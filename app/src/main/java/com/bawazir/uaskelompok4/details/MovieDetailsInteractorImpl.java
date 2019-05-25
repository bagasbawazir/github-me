package com.bawazir.uaskelompok4.details;

import com.bawazir.uaskelompok4.Review;
import com.bawazir.uaskelompok4.ReviewsWrapper;
import com.bawazir.uaskelompok4.Video;
import com.bawazir.uaskelompok4.VideoWrapper;
import com.bawazir.uaskelompok4.network.TmdbWebService;


import java.util.List;

import io.reactivex.Observable;

/**
 * @author arun
 */
class MovieDetailsInteractorImpl implements MovieDetailsInteractor {

    private TmdbWebService tmdbWebService;

    MovieDetailsInteractorImpl(TmdbWebService tmdbWebService) {
        this.tmdbWebService = tmdbWebService;
    }

    @Override
    public Observable<List<Video>> getTrailers(final String id) {
        return tmdbWebService.trailers(id).map(VideoWrapper::getVideos);
    }

    @Override
    public Observable<List<Review>> getReviews(final String id) {
        return tmdbWebService.reviews(id).map(ReviewsWrapper::getReviews);
    }

}
