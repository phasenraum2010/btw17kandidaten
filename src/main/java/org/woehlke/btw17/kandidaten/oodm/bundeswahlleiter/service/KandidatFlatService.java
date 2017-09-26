package org.woehlke.btw17.kandidaten.oodm.bundeswahlleiter.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.woehlke.btw17.kandidaten.oodm.bundeswahlleiter.model.KandidatFlat;

import java.util.List;

public interface KandidatFlatService {

    Page<KandidatFlat> getAll(Pageable pageRequest);

    Page<KandidatFlat> getAllOrderByNachname(Pageable pageRequest);

    long count();

    List<Long> getAllIdsWhereMdbIsNotNull();
}