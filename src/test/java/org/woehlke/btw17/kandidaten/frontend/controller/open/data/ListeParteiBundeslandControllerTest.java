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
import org.springframework.security.test.context.support.WithAnonymousUser;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.woehlke.btw17.kandidaten.KandidatenApplication;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)
@SpringBootTest(
        classes={KandidatenApplication.class},
        webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT
)
@AutoConfigureMockMvc
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ListeParteiBundeslandControllerTest {

    private static final Logger log = LoggerFactory.getLogger(ListeParteiBundeslandControllerTest.class);

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private LandesListeController controller;

    @Commit
    @Test
    public void test001controllerIsPresentTest(){
        log.info("controllerIsPresentTest");
        assertThat(controller).isNotNull();
    }

    @WithAnonymousUser
    @Commit
    @Test
    public void test010getLandesListeForBundeslandAll()throws Exception {
        String msg ="test010getLandesListeForBundeslandAll: ";
        log.info(msg);

        MvcResult result = this.mockMvc.perform(get("/landesliste/bundesland/all"))
                .andExpect(status().isOk())
                .andExpect(view().name( "landesliste/bundesland/all"))
                .andExpect(model().attributeExists("pageContent"))
                .andExpect(model().attributeExists("bundeslaender"))
                .andExpect(model().attributeExists("bundeslandIdTarget"))
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
    public void test011getLandesListeForListeParteiAll()throws Exception {
        String msg ="test011getLandesListeForListeParteiAll: ";
        log.info(msg);

        MvcResult result = this.mockMvc.perform(get("/landesliste/listepartei/all"))
                .andExpect(status().isOk())
                .andExpect(view().name( "landesliste/listepartei/all"))
                .andExpect(model().attributeExists("pageContent"))
                .andExpect(model().attributeExists("listeparteien"))
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
}