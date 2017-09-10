package org.woehlke.btw17.kandidaten.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.woehlke.btw17.kandidaten.oodm.service.*;

import java.util.ArrayList;
import java.util.List;

@Component
public class StartupListener implements ApplicationListener<ContextRefreshedEvent> {

    private static final Logger log = LoggerFactory.getLogger(StartupListener.class);

    private final SpringProperties springProperties;

    private final KandidatenProperties kandidatenProperties;

    private final BerufService berufService;

    private final BerufsgruppeService berufsgruppeService;

    private final BundeslandService bundeslandService;

    private final GeburtsortService geburtsortService;

    private final KandidatFlatService kandidatFlatService;

    private final KandidatService kandidatService;

    private final ListeParteiService listeParteiService;

    private final ParteiService parteiService;

    private final LandesListeService landesListeService;

    private final WahlkreisService wahlkreisService;

    private final WohnortService wohnortService;

    private final MinisteriumService ministeriumService;

    private final FraktionService fraktionService;

    @Autowired
    public StartupListener(SpringProperties springProperties, KandidatenProperties kandidatenProperties, BerufService berufService, BerufsgruppeService berufsgruppeService, BundeslandService bundeslandService, GeburtsortService geburtsortService, KandidatFlatService kandidatFlatService, KandidatService kandidatService, ListeParteiService listeParteiService, ParteiService parteiService, LandesListeService landesListeService, WahlkreisService wahlkreisService, WohnortService wohnortService, MinisteriumService ministeriumService, FraktionService fraktionService) {
        this.springProperties = springProperties;
        this.kandidatenProperties = kandidatenProperties;
        this.berufService = berufService;
        this.berufsgruppeService = berufsgruppeService;
        this.bundeslandService = bundeslandService;
        this.geburtsortService = geburtsortService;
        this.kandidatFlatService = kandidatFlatService;
        this.kandidatService = kandidatService;
        this.listeParteiService = listeParteiService;
        this.parteiService = parteiService;
        this.landesListeService = landesListeService;
        this.wahlkreisService = wahlkreisService;
        this.wohnortService = wohnortService;
        this.ministeriumService = ministeriumService;
        this.fraktionService = fraktionService;
    }

    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
        List<String> outputLines = new ArrayList<>();
        outputLines.add("--------------------------------------------------------------------------------------------------------------");
        outputLines.add("    ***  Bundestagswahl 2017 - Direkt Kandidaten  ***");
        outputLines.add("--------------------------------------------------------------------------------------------------------------");
        int i = 0;
        for(String path:kandidatenProperties.getWebSecurityConfigPublicPaths()){
            outputLines.add(" btw17.kandidaten.webSecurityConfigPublicPaths["+i+"] =   "+path);
            i++;
        }
        i = 0;
        for(String urlPrefix:kandidatenProperties.getUrlPrefixForKandidatFoto()){
            outputLines.add(" btw17.kandidaten.urlPrefixForKandidatFoto["+i+"] =        "+urlPrefix);
            i++;
        }
        outputLines.add(" btw17.kandidaten.pageSize =                           "+kandidatenProperties.getPageSize());
        outputLines.add(" btw17.kandidaten.loginUsername =                      "+kandidatenProperties.getLoginUsername());
        outputLines.add(" btw17.kandidaten.loginPassword =                      "+kandidatenProperties.getLoginPassword());
        outputLines.add(" btw17.kandidaten.googleMapsApiKey =                   "+kandidatenProperties.getGoogleMapsApiKey());
        outputLines.add(" btw17.kandidaten.googleAnalyticsKey =                 "+kandidatenProperties.getGoogleAnalyticsKey());
        outputLines.add(" btw17.kandidaten.connTimeToLive =                     "+kandidatenProperties.getConnTimeToLive());
        outputLines.add(" btw17.kandidaten.maxIdleTime =                        "+kandidatenProperties.getMaxIdleTime());
        outputLines.add(" btw17.kandidaten.millisToWaitBetweenTwoApiCalls =     "+kandidatenProperties.getMillisToWaitBetweenTwoApiCalls());
        outputLines.add(" btw17.kandidaten.checkFotoUrl =                       "+kandidatenProperties.getCheckFotoUrl());
        outputLines.add("--------------------------------------------------------------------------------------------------------------");
        outputLines.add(" spring.datasource.url = "+springProperties.getDatasource().getUrl());
        outputLines.add("--------------------------------------------------------------------------------------------------------------");
        outputLines.add(" org.woehlke.btw17.kandidaten.oodm.model.Beruf:        "+berufService.count());
        outputLines.add(" org.woehlke.btw17.kandidaten.oodm.model.Berufsgruppe: "+berufsgruppeService.count());
        outputLines.add(" org.woehlke.btw17.kandidaten.oodm.model.Bundesland:   "+bundeslandService.count());
        outputLines.add(" org.woehlke.btw17.kandidaten.oodm.model.Geburtsort:   "+geburtsortService.count());
        outputLines.add(" org.woehlke.btw17.kandidaten.oodm.model.ListePartei:  "+listeParteiService.count());
        outputLines.add(" org.woehlke.btw17.kandidaten.oodm.model.Partei:       "+parteiService.count());
        outputLines.add(" org.woehlke.btw17.kandidaten.oodm.model.Wahlkreis:    "+wahlkreisService.count());
        outputLines.add(" org.woehlke.btw17.kandidaten.oodm.model.Wohnort:      "+wohnortService.count());
        outputLines.add(" org.woehlke.btw17.kandidaten.oodm.model.LandesListe:  "+landesListeService.count());
        outputLines.add(" org.woehlke.btw17.kandidaten.oodm.model.Fraktion:     "+ministeriumService.count());
        outputLines.add(" org.woehlke.btw17.kandidaten.oodm.model.Ministerium:  "+fraktionService.count());
        outputLines.add(" org.woehlke.btw17.kandidaten.oodm.model.KandidatFlat: "+kandidatFlatService.count());
        outputLines.add(" org.woehlke.btw17.kandidaten.oodm.model.Kandidat:     "+kandidatService.count());
        outputLines.add("--------------------------------------------------------------------------------------------------------------");
        StringBuffer sb = new StringBuffer();
        sb.append("\n");
        for(String outputLine:outputLines){
            sb.append(outputLine);
            sb.append("\n");
        }
        log.info(sb.toString());
    }
}
