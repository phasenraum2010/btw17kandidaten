package org.woehlke.btw17.kandidaten.oodm.graph.repositories.btw17;

import org.springframework.stereotype.Repository;
import org.woehlke.btw17.kandidaten.oodm.all.model.commons.GraphDomainRepository;
import org.woehlke.btw17.kandidaten.oodm.graph.model.btw17.Btw17Strukturdaten;

@Repository
public interface Btw17StrukturdatenRepository extends GraphDomainRepository<Btw17Strukturdaten> {
}