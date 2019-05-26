package com.kelompok4.movie.details;

import com.kelompok4.movie.Movie;
import com.kelompok4.movie.Review;
import com.kelompok4.movie.Video;

import java.util.List;

/**
 * @author arun
 */
interface MovieDetailsView
{
    void showDetails(Movie movie);
    void showTrailers(List<Video> trailers);
    void showReviews(List<Review> reviews);
    void showFavorited();
    void showUnFavorited();
}