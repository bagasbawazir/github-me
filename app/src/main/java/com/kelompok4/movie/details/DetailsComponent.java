package com.kelompok4.movie.details;

import dagger.Subcomponent;

/**
 * @author arunsasidharan
 */
@DetailsScope
@Subcomponent(modules = {DetailsModule.class})

public interface DetailsComponent {
    void inject(MovieDetailsFragment target);
}
