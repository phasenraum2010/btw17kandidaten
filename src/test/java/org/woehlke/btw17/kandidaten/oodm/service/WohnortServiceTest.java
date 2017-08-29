package org.woehlke.btw17.kandidaten.oodm.service;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;
import org.woehlke.btw17.kandidaten.KandidatenApplication;
import org.woehlke.btw17.kandidaten.oodm.model.Wohnort;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {KandidatenApplication.class},webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class WohnortServiceTest {

    private static final Logger log = LoggerFactory.getLogger(WohnortServiceTest.class);

    @Autowired
    private WohnortService wohnortService;

    @Commit
    @Test
    public void findByWohnortTest() throws Exception {
        int page = 1;
        int size = 250;
        Pageable pageable = new PageRequest(page,size);
        Page<Wohnort> wohnorte = wohnortService.getAll(pageable);
        int resultSize = wohnorte.getNumber();
        log.info("found: # "+resultSize);
        Assert.assertTrue(resultSize>0);
        for(Wohnort wohnort:wohnorte.getContent()){
            Wohnort found = wohnortService.findByWohnort(wohnort.getWohnort());
            Assert.assertEquals(wohnort.getId(),found.getId());
            log.info("found: "+found.toString());
        }
    }
}