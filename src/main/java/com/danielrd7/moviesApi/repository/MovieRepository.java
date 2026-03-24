package com.danielrd7.moviesApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danielrd7.moviesApi.entity.MovieEntity;

/**
 * Repository for CRUD operations over {@link MovieEntity}.
 *
 * @author Enrique Sanchez
 */
@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Long> {
}