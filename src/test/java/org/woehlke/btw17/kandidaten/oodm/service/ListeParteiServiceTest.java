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
import org.woehlke.btw17.kandidaten.oodm.model.ListePartei;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {KandidatenApplication.class},webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class ListeParteiServiceTest {

    private static final Logger log = LoggerFactory.getLogger(ListeParteiServiceTest.class);

    @Autowired
    private ListeParteiService listeParteiService;

    @Commit
    @Test
    public void findByListeParteiTest() throws Exception {
        int page = 1;
        int size = 250;
        Pageable pageable = new PageRequest(page,size);
        Page<ListePartei> listeParteien = listeParteiService.getAll(pageable);
        int resultSize = listeParteien.getNumber();
        log.info("found: # "+resultSize);
        Assert.assertTrue(resultSize>0);
        for(ListePartei listePartei:listeParteien.getContent()){
            ListePartei found = listeParteiService.findByListePartei(listePartei.getListePartei(),listePartei.getListeParteiLang());
            Assert.assertEquals(listePartei.getId(),found.getId());
            log.info("found: "+found.toString());
        }
    }
}