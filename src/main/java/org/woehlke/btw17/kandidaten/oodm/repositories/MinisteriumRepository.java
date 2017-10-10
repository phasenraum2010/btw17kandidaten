package org.woehlke.btw17.kandidaten.oodm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.woehlke.btw17.kandidaten.oodm.model.Ministerium;

import java.util.List;


@Repository
public interface MinisteriumRepository extends JpaRepository<Ministerium,Long> {

    Ministerium findByMinisterium(String ministerium);

    @Query(name="Ministerium.getAllIds")
    List<Long> getAllIds();

    @Query(name="Ministerium.getMaxId")
    Long getMaxId();

}
