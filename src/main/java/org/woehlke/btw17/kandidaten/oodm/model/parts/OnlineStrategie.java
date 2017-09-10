package org.woehlke.btw17.kandidaten.oodm.model.parts;

import org.hibernate.validator.constraints.URL;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Validated
@Embeddable
public class OnlineStrategie implements Serializable {

    private static final long serialVersionUID = 1L;

    @URL
    @Column(name="webseite")
    private String webseite;

    @URL
    @Column(name="twitter")
    private String twitter;

    @URL
    @Column(name="facebook")
    private String facebook;

    @URL
    @Column(name="youtube")
    private String youtube;

    @URL
    @Column(name="soundcloud")
    private String soundcloud;

    @URL
    @Column(name="wikipedia_article")
    private String wikipediaArticle;

    @URL
    @Column(name="bundestag")
    private String bundestagAbgeordnete;

    @URL
    @Column(name="abgeordnetenwatch")
    private String abgeordnetenwatch;

    @URL
    @Column(name="lobbypedia_url")
    private String lobbypediaUrl;

    @URL
    @Column(name = "google_plus")
    private String googlePlus;

    @URL
    @Column(name = "instagram")
    private String instagram;


    public String getWebseite() {
        return webseite;
    }

    public void setWebseite(String webseite) {
        this.webseite = webseite;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    public String getSoundcloud() {
        return soundcloud;
    }

    public void setSoundcloud(String soundcloud) {
        this.soundcloud = soundcloud;
    }

    public String getWikipediaArticle() {
        return wikipediaArticle;
    }

    public void setWikipediaArticle(String wikipediaArticle) {
        this.wikipediaArticle = wikipediaArticle;
    }

    public String getBundestagAbgeordnete() {
        return bundestagAbgeordnete;
    }

    public void setBundestagAbgeordnete(String bundestagAbgeordnete) {
        this.bundestagAbgeordnete = bundestagAbgeordnete;
    }

    public String getAbgeordnetenwatch() {
        return abgeordnetenwatch;
    }

    public void setAbgeordnetenwatch(String abgeordnetenwatch) {
        this.abgeordnetenwatch = abgeordnetenwatch;
    }

    public String getLobbypediaUrl() {
        return lobbypediaUrl;
    }

    public void setLobbypediaUrl(String lobbypediaUrl) {
        this.lobbypediaUrl = lobbypediaUrl;
    }

    public String getGooglePlus() {
        return googlePlus;
    }

    public void setGooglePlus(String googlePlus) {
        this.googlePlus = googlePlus;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnlineStrategie)) return false;

        OnlineStrategie that = (OnlineStrategie) o;

        if (webseite != null ? !webseite.equals(that.webseite) : that.webseite != null) return false;
        if (twitter != null ? !twitter.equals(that.twitter) : that.twitter != null) return false;
        if (facebook != null ? !facebook.equals(that.facebook) : that.facebook != null) return false;
        if (youtube != null ? !youtube.equals(that.youtube) : that.youtube != null) return false;
        if (soundcloud != null ? !soundcloud.equals(that.soundcloud) : that.soundcloud != null) return false;
        if (wikipediaArticle != null ? !wikipediaArticle.equals(that.wikipediaArticle) : that.wikipediaArticle != null)
            return false;
        if (bundestagAbgeordnete != null ? !bundestagAbgeordnete.equals(that.bundestagAbgeordnete) : that.bundestagAbgeordnete != null)
            return false;
        if (abgeordnetenwatch != null ? !abgeordnetenwatch.equals(that.abgeordnetenwatch) : that.abgeordnetenwatch != null)
            return false;
        if (lobbypediaUrl != null ? !lobbypediaUrl.equals(that.lobbypediaUrl) : that.lobbypediaUrl != null)
            return false;
        if (googlePlus != null ? !googlePlus.equals(that.googlePlus) : that.googlePlus != null) return false;
        return instagram != null ? instagram.equals(that.instagram) : that.instagram == null;
    }

    @Override
    public int hashCode() {
        int result = webseite != null ? webseite.hashCode() : 0;
        result = 31 * result + (twitter != null ? twitter.hashCode() : 0);
        result = 31 * result + (facebook != null ? facebook.hashCode() : 0);
        result = 31 * result + (youtube != null ? youtube.hashCode() : 0);
        result = 31 * result + (soundcloud != null ? soundcloud.hashCode() : 0);
        result = 31 * result + (wikipediaArticle != null ? wikipediaArticle.hashCode() : 0);
        result = 31 * result + (bundestagAbgeordnete != null ? bundestagAbgeordnete.hashCode() : 0);
        result = 31 * result + (abgeordnetenwatch != null ? abgeordnetenwatch.hashCode() : 0);
        result = 31 * result + (lobbypediaUrl != null ? lobbypediaUrl.hashCode() : 0);
        result = 31 * result + (googlePlus != null ? googlePlus.hashCode() : 0);
        result = 31 * result + (instagram != null ? instagram.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OnlineStrategie{" +
                "webseite='" + webseite + '\'' +
                ", twitter='" + twitter + '\'' +
                ", facebook='" + facebook + '\'' +
                ", youtube='" + youtube + '\'' +
                ", soundcloud='" + soundcloud + '\'' +
                ", wikipediaArticle='" + wikipediaArticle + '\'' +
                ", bundestagAbgeordnete='" + bundestagAbgeordnete + '\'' +
                ", abgeordnetenwatch='" + abgeordnetenwatch + '\'' +
                ", lobbypediaUrl='" + lobbypediaUrl + '\'' +
                ", googlePlus='" + googlePlus + '\'' +
                ", instagram='" + instagram + '\'' +
                '}';
    }
}