package org.woehlke.btw17.kandidaten.frontend.controller.open.data;


import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.test.context.support.WithAnonymousUser;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.woehlke.btw17.kandidaten.KandidatenApplication;
import org.woehlke.btw17.kandidaten.configuration.properties.KandidatenProperties;
import org.woehlke.btw17.kandidaten.oodm.model.Partei;
import org.woehlke.btw17.kandidaten.oodm.service.ParteiService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.woehlke.btw17.kandidaten.oodm.service.KandidatService.FIRST_PAGE_NUMBER;
import static org.woehlke.btw17.kandidaten.oodm.service.KandidatService.PAGE_SIZE;


@RunWith(SpringRunner.class)
@SpringBootTest(
    classes={KandidatenApplication.class},
    webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT
)
@AutoConfigureMockMvc
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParteiControllerTest {

    private static final Logger log = LoggerFactory.getLogger(ParteiControllerTest.class);

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ParteiController controller;

    @Autowired
    private ParteiService parteiService;

    @Autowired
    private KandidatenProperties kandidatenProperties;

    @Commit
    @Test
    public void test001controllerIsPresentTest(){
        log.info("controllerIsPresentTest");
        assertThat(controller).isNotNull();
    }

    @WithAnonymousUser
    @Commit
    @Test
    public void test010getAll()throws Exception {
        String msg ="test010getAll: ";
        log.info(msg);

        MvcResult result = this.mockMvc.perform(get("/partei/all"))
                .andExpect(status().isOk())
                .andExpect(view().name( "partei/all"))
                .andExpect(model().attributeExists("pageContent"))
                .andExpect(model().attributeExists("parteien"))
                .andExpect(model().attributeExists("suchformularFreitext"))
                .andReturn();

        String content = result.getResponse().getContentAsString();

        log.debug(msg+"#######################################");
        log.debug(msg+"#######################################");
        log.debug(msg+content);
        log.debug(msg+"#######################################");
        log.debug(msg+"#######################################");
        Assert.assertTrue(true);
    }

    @WithAnonymousUser
    @Commit
    @Test
    public void test020getUserForId()  throws Exception {
        String msg ="test020getUserForId: ";
        log.info(msg);
        int page=FIRST_PAGE_NUMBER;
        int size=PAGE_SIZE;
        Pageable pageable = new PageRequest(page,size);
        Page<Partei> parteien = parteiService.getAll(pageable);
        boolean goOn = true;
        while(goOn) {
            for (Partei partei : parteien) {
                log.debug(msg+"/partei/" + partei.getId());
                MvcResult result = this.mockMvc.perform(get("/partei/" + partei.getId()))
                        .andExpect(status().isOk())
                        .andExpect(view().name("partei/id"))
                        .andExpect(model().attributeExists("pageContent"))
                        .andExpect(model().attributeExists("partei"))
                        .andExpect(model().attributeExists("kandidaten"))
                        .andExpect(model().attributeExists("suchformularFreitext"))
                        .andReturn();

                String content = result.getResponse().getContentAsString();

                log.debug(msg + "#######################################");
                log.debug(msg + "#######################################");
                log.debug(msg + content);
                log.debug(msg + "#######################################");
                log.debug(msg + "#######################################");
            }
            Assert.assertTrue(true);
            if (parteien.hasNext()) {
                pageable = parteien.nextPageable();
                parteien = parteiService.getAll(pageable);
            } else {
                goOn = false;
            }
        }
    }
}