package org.spring.student.studentsystem.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.EntityType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// Show ID Data from Database
@Configuration
public class ConfigureRepositoryRestConfigration implements RepositoryRestConfigurer {
    private EntityManager entityManager;

    @Autowired
    public ConfigureRepositoryRestConfigration(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        exposeIds(config);
    }

    // Retrieve Data in API
    public void exposeIds(RepositoryRestConfiguration config) {
        Set<EntityType<?>> entityTypes = entityManager.getMetamodel().getEntities();
        List<Class> classes = new ArrayList<>();
        for (EntityType type : entityTypes) {
            classes.add(type.getJavaType());
        }

        Class[] domainTypes = classes.toArray(new Class[0]);
        config.exposeIdsFor(domainTypes);
    }
}
