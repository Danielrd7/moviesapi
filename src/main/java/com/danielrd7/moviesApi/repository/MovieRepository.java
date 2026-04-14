package com.danielrd7.moviesApi.repository;

import java.time.LocalDate;

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
    /**
     * Finds a movie by title and release date.
     *
     * @param name movie title
     * @param launchDate movie release date
     * @return matching movie entity or {@code null} when no record matches
     */
    MovieEntity findByNameAndLaunchDate(String name, LocalDate launchDate);
}