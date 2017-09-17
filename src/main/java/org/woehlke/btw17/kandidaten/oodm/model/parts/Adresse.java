package org.woehlke.btw17.kandidaten.oodm.model.parts;

import org.springframework.validation.annotation.Validated;
import org.woehlke.btw17.kandidaten.configuration.MySerializable;
import org.woehlke.btw17.kandidaten.oodm.model.Bundesland;

import javax.persistence.*;

/**
 * @see org.woehlke.btw17.kandidaten.oodm.model.parts.AdresseEmbedded
 */
@Validated
@Embeddable
public class Adresse implements MySerializable {

    @Column
    private String strasse;

    @Column
    private String hausnummer;

    @Column
    private String plz;

    @Column
    private String ort;

    @Column
    private String nation;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "fk_bundesland")
    private Bundesland bundesland;

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Bundesland getBundesland() {
        return bundesland;
    }

    public void setBundesland(Bundesland bundesland) {
        this.bundesland = bundesland;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adresse)) return false;

        Adresse adresse = (Adresse) o;

        if (strasse != null ? !strasse.equals(adresse.strasse) : adresse.strasse != null) return false;
        if (hausnummer != null ? !hausnummer.equals(adresse.hausnummer) : adresse.hausnummer != null) return false;
        if (plz != null ? !plz.equals(adresse.plz) : adresse.plz != null) return false;
        if (ort != null ? !ort.equals(adresse.ort) : adresse.ort != null) return false;
        if (nation != null ? !nation.equals(adresse.nation) : adresse.nation != null) return false;
        return bundesland != null ? bundesland.equals(adresse.bundesland) : adresse.bundesland == null;
    }

    @Override
    public int hashCode() {
        int result = strasse != null ? strasse.hashCode() : 0;
        result = 31 * result + (hausnummer != null ? hausnummer.hashCode() : 0);
        result = 31 * result + (plz != null ? plz.hashCode() : 0);
        result = 31 * result + (ort != null ? ort.hashCode() : 0);
        result = 31 * result + (nation != null ? nation.hashCode() : 0);
        result = 31 * result + (bundesland != null ? bundesland.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "strasse='" + strasse + '\'' +
                ", hausnummer='" + hausnummer + '\'' +
                ", plz='" + plz + '\'' +
                ", ort='" + ort + '\'' +
                ", nation='" + nation + '\'' +
                ", bundesland=" + bundesland +
                '}';
    }
}
