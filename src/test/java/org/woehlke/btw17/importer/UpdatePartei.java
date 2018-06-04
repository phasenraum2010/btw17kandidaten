package org.woehlke.btw17.importer;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
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
import org.woehlke.btw17.kandidaten.oodm.jpa.model.ListePartei;
import org.woehlke.btw17.kandidaten.oodm.jpa.model.Partei;
import org.woehlke.btw17.kandidaten.oodm.jpa.model.parts.OnlineStrategie;
import org.woehlke.btw17.kandidaten.oodm.jpa.service.ListeParteiService;
import org.woehlke.btw17.kandidaten.oodm.jpa.service.ParteiService;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {KandidatenApplication.class},webEnvironment = SpringBootTest.WebEnvironment.NONE)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UpdatePartei {

    private static final Logger log = LoggerFactory.getLogger(UpdatePartei.class);

    @Autowired
    private ListeParteiService listeParteiService;

    @Autowired
    private ParteiService parteiService;

    @Ignore
    @Commit
    @Test
    public void updatePartei() throws Exception {
        Iterable<Partei> allKandidatenPage = parteiService.getAll();
        for (Partei in : allKandidatenPage) {
            log.info(in.toString());
            ListePartei out = listeParteiService.findByPartei(in.getPartei());
            if(out != null) {
                OnlineStrategie os = in.getOnlineStrategie();
                if (os != null) {
                    out.setOnlineStrategie(os);
                    listeParteiService.update(out);
                }
            }
        }
    }
}
