package org.woehlke.btw17.kandidaten.oodm.model;

import org.woehlke.btw17.kandidaten.configuration.EditStatus;
import org.woehlke.btw17.kandidaten.oodm.model.listener.BerufsgruppeListener;
import org.woehlke.btw17.kandidaten.oodm.model.parts.DomainObject;

import javax.persistence.*;

/**
 * @see org.woehlke.btw17.kandidaten.oodm.model.Kandidat
 */
@Entity
@Table(
    name = "berufsgruppe",
    uniqueConstraints = {
        @UniqueConstraint(name="unique_berufsgruppe",columnNames = {"berufsgruppe"})
    }
)
@EntityListeners(BerufsgruppeListener.class)
public class Berufsgruppe implements DomainObject {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Column(name = "berufsgruppe")
    private String berufsgruppe;

    @Enumerated(EnumType.STRING)
    @Column(name = "edit_status")
    private EditStatus editStatus = EditStatus.UNTOUCHED;

    @Transient
    public String getName() {
        return berufsgruppe;
    }

    @Transient
    @Override
    public String getUniqueId() {
        return id + ":"+this.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBerufsgruppe() {
        return berufsgruppe;
    }

    public void setBerufsgruppe(String berufsgruppe) {
        this.berufsgruppe = berufsgruppe;
    }

    public EditStatus getEditStatus() {
        return editStatus;
    }

    public void setEditStatus(EditStatus editStatus) {
        this.editStatus = editStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Berufsgruppe)) return false;

        Berufsgruppe that = (Berufsgruppe) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (berufsgruppe != null ? !berufsgruppe.equals(that.berufsgruppe) : that.berufsgruppe != null) return false;
        return editStatus == that.editStatus;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (berufsgruppe != null ? berufsgruppe.hashCode() : 0);
        result = 31 * result + (editStatus != null ? editStatus.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Berufsgruppe{" +
                "id=" + id +
                ", berufsgruppe='" + berufsgruppe + '\'' +
                ", editStatus=" + editStatus +
                '}';
    }
}
