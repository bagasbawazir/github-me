package com.bawazir.uaskelompok4.details;

import com.bawazir.uaskelompok4.Movie;
import com.bawazir.uaskelompok4.Review;
import com.bawazir.uaskelompok4.Video;

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