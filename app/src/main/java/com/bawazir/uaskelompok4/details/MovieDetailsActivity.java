package com.bawazir.uaskelompok4.details;

import android.graphics.Movie;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.bawazir.uaskelompok4.R;
import com.bawazir.uaskelompok4.Constants;
import com.bawazir.uaskelompok4.Movie;

public class MovieDetailsActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras != null && extras.containsKey(SyncStateContract.Constants.MOVIE))
            {
                Movie movie = extras.getParcelable(Constants.MOVIE);
                if (movie != null)
                {
                    MovieDetailsFragment movieDetailsFragment = MovieDetailsFragment.getInstance(movie);
                    getSupportFragmentManager().beginTransaction().add(R.id.movie_details_container, movieDetailsFragment).commit();
                }
            }
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
        }
        return super.onOptionsItemSelected(item);
    }
}
