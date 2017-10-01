package org.woehlke.btw17.kandidaten.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Component
@Validated
@ConfigurationProperties(prefix="btw17.kandidaten")
public class KandidatenProperties {

    @NotNull
    private Integer pageSize;

    @NotNull
    private String loginUsername;

    @NotNull
    private String loginPassword;

    @NotNull
    private List<String> webSecurityConfigPublicPaths;

    @NotNull
    private List<String> urlPrefixForKandidatFoto;

    @NotNull
    private String googleMapsApiKey;

    @NotNull
    private String googleAnalyticsKey;

    @NotNull
    private String googleSiteVerification;

    @NotNull
    private String msvalidateKey;

    @NotNull
    private String facebookAppId;

    @NotNull
    private Long connTimeToLive;

    @NotNull
    private Long maxIdleTime;

    @NotNull
    private Integer millisToWaitBetweenTwoApiCalls;

    @NotNull
    private Boolean checkFotoUrl;

    @NotNull
    private String pageSubTitle;

    @NotNull
    private String twitterCardSite;

    @NotNull
    private String twitterCardCreator;

    @Valid
    public TableContent tableContent = new TableContent();

    @Validated
    public static class TableContent {

        @NotNull
        private Long countBeruf;

        @NotNull
        private Long countBerufsgruppe;

        @NotNull
        private Long countBundesland;

        @NotNull
        private Long countGeburtsort;

        @NotNull
        private Long countPartei;

        @NotNull
        private Long countWahlkreis;

        @NotNull
        private Long countWohnort;

        @NotNull
        private Long countLandesListe;

        @NotNull
        private Long countKandidatFlat;

        @NotNull
        private Long countKandidat;

        public Long getCountBeruf() {
            return countBeruf;
        }

        public void setCountBeruf(Long countBeruf) {
            this.countBeruf = countBeruf;
        }

        public Long getCountBerufsgruppe() {
            return countBerufsgruppe;
        }

        public void setCountBerufsgruppe(Long countBerufsgruppe) {
            this.countBerufsgruppe = countBerufsgruppe;
        }

        public Long getCountBundesland() {
            return countBundesland;
        }

        public void setCountBundesland(Long countBundesland) {
            this.countBundesland = countBundesland;
        }

        public Long getCountGeburtsort() {
            return countGeburtsort;
        }

        public void setCountGeburtsort(Long countGeburtsort) {
            this.countGeburtsort = countGeburtsort;
        }

        public Long getCountPartei() {
            return countPartei;
        }

        public void setCountPartei(Long countPartei) {
            this.countPartei = countPartei;
        }

        public Long getCountWahlkreis() {
            return countWahlkreis;
        }

        public void setCountWahlkreis(Long countWahlkreis) {
            this.countWahlkreis = countWahlkreis;
        }

        public Long getCountWohnort() {
            return countWohnort;
        }

        public void setCountWohnort(Long countWohnort) {
            this.countWohnort = countWohnort;
        }

        public Long getCountLandesListe() {
            return countLandesListe;
        }

        public void setCountLandesListe(Long countLandesListe) {
            this.countLandesListe = countLandesListe;
        }

        public Long getCountKandidatFlat() {
            return countKandidatFlat;
        }

        public void setCountKandidatFlat(Long countKandidatFlat) {
            this.countKandidatFlat = countKandidatFlat;
        }

        public Long getCountKandidat() {
            return countKandidat;
        }

        public void setCountKandidat(Long countKandidat) {
            this.countKandidat = countKandidat;
        }
    }

    public TableContent getTableContent() {
        return tableContent;
    }

    public void setTableContent(TableContent tableContent) {
        this.tableContent = tableContent;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getLoginUsername() {
        return loginUsername;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public List<String> getWebSecurityConfigPublicPaths() {
        return webSecurityConfigPublicPaths;
    }

    public void setWebSecurityConfigPublicPaths(List<String> webSecurityConfigPublicPaths) {
        this.webSecurityConfigPublicPaths = webSecurityConfigPublicPaths;
    }

    public String getGoogleMapsApiKey() {
        return googleMapsApiKey;
    }

    public void setGoogleMapsApiKey(String googleMapsApiKey) {
        this.googleMapsApiKey = googleMapsApiKey;
    }

    public String getGoogleAnalyticsKey() {
        return googleAnalyticsKey;
    }

    public void setGoogleAnalyticsKey(String googleAnalyticsKey) {
        this.googleAnalyticsKey = googleAnalyticsKey;
    }

    public Long getConnTimeToLive() {
        return connTimeToLive;
    }

    public void setConnTimeToLive(Long connTimeToLive) {
        this.connTimeToLive = connTimeToLive;
    }

    public Long getMaxIdleTime() {
        return maxIdleTime;
    }

    public void setMaxIdleTime(Long maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
    }

    public Integer getMillisToWaitBetweenTwoApiCalls() {
        return millisToWaitBetweenTwoApiCalls;
    }

    public void setMillisToWaitBetweenTwoApiCalls(Integer millisToWaitBetweenTwoApiCalls) {
        this.millisToWaitBetweenTwoApiCalls = millisToWaitBetweenTwoApiCalls;
    }

    public List<String> getUrlPrefixForKandidatFoto() {
        return urlPrefixForKandidatFoto;
    }

    public void setUrlPrefixForKandidatFoto(List<String> urlPrefixForKandidatFoto) {
        this.urlPrefixForKandidatFoto = urlPrefixForKandidatFoto;
    }

    public Boolean getCheckFotoUrl() {
        return checkFotoUrl;
    }

    public void setCheckFotoUrl(Boolean checkFotoUrl) {
        this.checkFotoUrl = checkFotoUrl;
    }

    public String getPageSubTitle() {
        return pageSubTitle;
    }

    public void setPageSubTitle(String pageSubTitle) {
        this.pageSubTitle = pageSubTitle;
    }

    public String getTwitterCardSite() {
        return twitterCardSite;
    }

    public void setTwitterCardSite(String twitterCardSite) {
        this.twitterCardSite = twitterCardSite;
    }

    public String getTwitterCardCreator() {
        return twitterCardCreator;
    }

    public void setTwitterCardCreator(String twitterCardCreator) {
        this.twitterCardCreator = twitterCardCreator;
    }

    public String getGoogleSiteVerification() {
        return googleSiteVerification;
    }

    public void setGoogleSiteVerification(String googleSiteVerification) {
        this.googleSiteVerification = googleSiteVerification;
    }

    public String getMsvalidateKey() {
        return msvalidateKey;
    }

    public void setMsvalidateKey(String msvalidateKey) {
        this.msvalidateKey = msvalidateKey;
    }

    public String getFacebookAppId() {
        return facebookAppId;
    }

    public void setFacebookAppId(String facebookAppId) {
        this.facebookAppId = facebookAppId;
    }

    public String[] getWebSecurityConfigPublicPathsAsArray() {
        int size = webSecurityConfigPublicPaths.size();
        String[] myArray = new String[size];
        for(int i=0; i<size; i++){
            myArray[i] = webSecurityConfigPublicPaths.get(i);
        }
        return myArray;
    }

    @Override
    public String toString() {
        List<String> outputLines = new ArrayList<>();
        int i = 0;
        for(String path:this.getWebSecurityConfigPublicPaths()){
            outputLines.add(" btw17.kandidaten.webSecurityConfigPublicPaths["+i+"] =   "+path);
            i++;
        }
        i = 0;
        for(String urlPrefix:this.getUrlPrefixForKandidatFoto()){
            outputLines.add(" btw17.kandidaten.urlPrefixForKandidatFoto["+i+"] =        "+urlPrefix);
            i++;
        }
        outputLines.add("--------------------------------------------------------------------------------------------------------------");
        outputLines.add(" btw17.kandidaten.pageSize =                           "+this.getPageSize());
        outputLines.add(" btw17.kandidaten.loginUsername =                      "+this.getLoginUsername());
        outputLines.add(" btw17.kandidaten.loginPassword =                      "+this.getLoginPassword());
        outputLines.add(" btw17.kandidaten.googleMapsApiKey =                   "+this.getGoogleMapsApiKey());
        outputLines.add(" btw17.kandidaten.googleAnalyticsKey =                 "+this.getGoogleAnalyticsKey());
        outputLines.add(" btw17.kandidaten.googleSiteVerification =             "+this.getGoogleSiteVerification());
        outputLines.add(" btw17.kandidaten.msvalidateKey =                      "+this.getMsvalidateKey());
        outputLines.add(" btw17.kandidaten.twitterCardCreator =                 "+this.getTwitterCardCreator());
        outputLines.add(" btw17.kandidaten.twitterCardSite =                    "+this.getTwitterCardSite());
        outputLines.add(" btw17.kandidaten.facebookAppId =                      "+this.getFacebookAppId());
        outputLines.add(" btw17.kandidaten.pageSubTitle =                       "+this.getPageSubTitle());
        outputLines.add(" btw17.kandidaten.connTimeToLive =                     "+this.getConnTimeToLive());
        outputLines.add(" btw17.kandidaten.maxIdleTime =                        "+this.getMaxIdleTime());
        outputLines.add(" btw17.kandidaten.millisToWaitBetweenTwoApiCalls =     "+this.getMillisToWaitBetweenTwoApiCalls());
        outputLines.add(" btw17.kandidaten.checkFotoUrl =                       "+this.getCheckFotoUrl());
        StringBuffer sb = new StringBuffer();
        for(String outputLine:outputLines){
            sb.append(outputLine);
            sb.append("\n");
        }
        return sb.toString();
    }
}
