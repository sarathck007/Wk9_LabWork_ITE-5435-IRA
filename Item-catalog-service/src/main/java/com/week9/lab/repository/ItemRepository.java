package com.week9.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.week9.lab.model.Item;


/**
 * Repository interface for Item entity
 * @RepositoryRestResource automatically exposes RESTful endpoints for CRUD operations
 * This allows clients to access items via HTTP (GET, POST, PUT, DELETE)
 */
@RepositoryRestResource
public interface ItemRepository extends JpaRepository<Item, Long> {
	// Spring Data JPA provides implementation for basic CRUD operations
    // No additional methods needed for basic functionality
}
