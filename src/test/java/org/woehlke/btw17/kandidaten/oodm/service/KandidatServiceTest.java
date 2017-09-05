package org.woehlke.btw17.kandidaten.oodm.service;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;
import org.woehlke.btw17.kandidaten.KandidatenApplication;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(
    classes = { KandidatenApplication.class },
    webEnvironment = SpringBootTest.WebEnvironment.NONE
)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KandidatServiceTest {

    private static final Logger log = LoggerFactory.getLogger(KandidatServiceTest.class);

    @Autowired
    private KandidatService KandidatService;

    @Commit
    @Test
    public void test000serviceIsPresentTest(){
        log.info("serviceIsPresentTest");
        assertThat(KandidatService).isNotNull();
    }

    @Commit
    @Test
    public void test001getAll() throws Exception {

    }

}
