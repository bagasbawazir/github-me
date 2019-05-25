package com.bawazir.uaskelompok4.details;

import com.bawazir.uaskelompok4.Review;
import com.bawazir.uaskelompok4.Video;

import java.util.List;

import io.reactivex.Observable;

public interface MovieDetailsInteractor
{
    Observable<List<Video>> getTrailers(String id);
    Observable<List<Review>> getReviews(String id);
}
