package org.woehlke.btw17.kandidaten.oodm.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.woehlke.btw17.kandidaten.oodm.model.Fraktion;

import java.util.List;

public interface FraktionService {

    List<Fraktion> getAll();

    Page<Fraktion> getAll(Pageable pageRequest);

    Fraktion findByFraktion(String fraktion);

    long count();

    void deleteAll();

    Fraktion update(Fraktion fraktion);
}
