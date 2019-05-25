package com.bawazir.uaskelompok4.details;

import dagger.Subcomponent;

/**
 * @author arunsasidharan
 */
@DetailsScope
@Subcomponent(modules = {DetailsModule.class})

public interface DetailsComponent {
    void inject(MovieDetailsFragment target);
}
