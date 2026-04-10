package com.danielrd7.moviesApi.vo;

import java.io.Serializable;
import java.time.LocalDate;

import com.danielrd7.moviesApi.enumeration.Rating;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class MovieVO implements Serializable {
    
    private static final long serialVersionUID = 1739406000000L;
    
    private Long id;
    @NotBlank (message = "Name is needed")
    private String name;
    @NotNull (message = "Launch date is needed")
    private LocalDate launchDate;
    @NotNull (message = "Duration is needed")
    private Integer duration;
    private Rating rating;
    @Pattern(
            regexp = "^(?!.(?i)(?:--|;|/\\|\\/|\\b(?:select|insert|update|delete|drop|truncate|alter|union|exec|execute|xp_)\\b|\\bor\\b\\s+\\d+=\\d+|\\band\\b\\s+\\d+=\\d+)).$",
            flags = Pattern.Flag.CASE_INSENSITIVE,
            message = "Description contains invalid characters"
    )
    private String description;
    
    public MovieVO() {
    }
    
    public MovieVO(Long id, String name, LocalDate launchDate, Integer duration, Rating rating, String description) {
        this.id = id;
        this.name = name;
        this.launchDate = launchDate;
        this.duration = duration;
        this.rating = rating;
        this.description = description;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public LocalDate getLaunchDate() {
        return launchDate;
    }
    
    public void setLaunchDate(LocalDate launchDate) {
        this.launchDate = launchDate;
    }
    
    public Integer getDuration() {
        return duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    
    public Rating getRating() {
        return rating;
    }
    
    public void setRating(Rating rating) {
        this.rating = rating;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return "MovieVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", launchDate=" + launchDate +
                ", duration=" + duration +
                ", rating=" + rating +
                ", description='" + description + '\'' +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        MovieVO movieVO = (MovieVO) o;
        
        if (id != null ? !id.equals(movieVO.id) : movieVO.id != null) return false;
        if (name != null ? !name.equals(movieVO.name) : movieVO.name != null) return false;
        if (launchDate != null ? !launchDate.equals(movieVO.launchDate) : movieVO.launchDate != null) return false;
        if (duration != null ? !duration.equals(movieVO.duration) : movieVO.duration != null) return false;
        if (rating != null ? !rating.equals(movieVO.rating) : movieVO.rating != null) return false;
        if (description != null ? !description.equals(movieVO.description) : movieVO.description != null) return false;
        
        return true;
    }
    
    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (launchDate != null ? launchDate.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
