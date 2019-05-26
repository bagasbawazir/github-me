package com.kelompok4.movie.details;

import com.kelompok4.movie.Review;
import com.kelompok4.movie.Video;

import java.util.List;

import io.reactivex.Observable;

public interface MovieDetailsInteractor
{
    Observable<List<Video>> getTrailers(String id);
    Observable<List<Review>> getReviews(String id);
}
