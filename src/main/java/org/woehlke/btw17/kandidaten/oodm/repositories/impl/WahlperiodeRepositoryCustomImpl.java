package org.woehlke.btw17.kandidaten.oodm.repositories.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.woehlke.btw17.kandidaten.oodm.repositories.custom.WahlperiodeRepositoryCustom;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Repository
public class WahlperiodeRepositoryCustomImpl implements WahlperiodeRepositoryCustom {

    private final EntityManager entityManager;

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public WahlperiodeRepositoryCustomImpl(EntityManager entityManager, DataSource dataSource) {
        this.entityManager = entityManager;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
}