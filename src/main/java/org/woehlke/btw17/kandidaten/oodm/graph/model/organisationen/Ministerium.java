package org.woehlke.btw17.kandidaten.oodm.graph.model.organisationen;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;
import org.woehlke.btw17.kandidaten.oodm.all.model.commons.GraphDomainObject;
import org.woehlke.btw17.kandidaten.oodm.graph.model.geographie.Adresse;
import org.woehlke.btw17.kandidaten.oodm.graph.model.geographie.GeoPosition;
import org.woehlke.btw17.kandidaten.oodm.graph.model.kandidaten.Kandidat;
import org.woehlke.btw17.kandidaten.oodm.graph.model.parts.CommonFields;
import org.woehlke.btw17.kandidaten.oodm.graph.model.parts.OnlineStrategie;
import org.woehlke.btw17.kandidaten.oodm.graph.model.webseite.Webseite;

import static org.woehlke.btw17.kandidaten.oodm.graph.model.commons.RelationshipType.LOCATION;
import static org.woehlke.btw17.kandidaten.oodm.graph.model.commons.RelationshipType.PUBLISH_ONLINE;


@Setter
@Getter
@NodeEntity
public class Ministerium implements GraphDomainObject {

    @Id
    @GeneratedValue
    private Long id;

    @Property(name="ministerium")
    private String ministerium;

    @Property(name="ministerium_lang")
    private String ministeriumLang;

    @Property(name="bundesminister")
    private String bundesministerName;

    @Relationship(type=LOCATION)
    private Kandidat bundesminister;

    @Relationship(type=LOCATION)
    private CommonFields commonFields = new CommonFields();

    @Relationship(type=LOCATION)
    private OnlineStrategie onlineStrategie = new OnlineStrategie();

    @Relationship(type=LOCATION)
    private GeoPosition geoPosition = new GeoPosition();

    @Relationship(type=LOCATION)
    private Adresse adresse = new Adresse();

    @Relationship(type=PUBLISH_ONLINE)
    private Webseite webseite = new Webseite();

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return ministerium +"  "+ministeriumLang;
    }

    @Override
    public String getUniqueId() {
        return id + ":"+this.getName();
    }

}
