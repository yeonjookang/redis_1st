package com.example.movie.repository.dto;

import com.example.movie.entity.movie.Genre;
import com.example.movie.entity.movie.Grade;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class MoviesNowShowingDetailDto {
    private Long movieId;
    private String movieName;
    private Grade grade;
    private LocalDate releaseDate;
    private String thumbnail;
    private Long runningTime;
    private Genre genre;
    private Long theaterId;
    private String theaterName;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
}
