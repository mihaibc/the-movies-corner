package com.bacusoft.themoviescorner.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bacusoft.themoviescorner.R
import com.bacusoft.themoviescorner.data.models.MovieDataModel

public class HomeMovieViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.home_movies_list_item, parent, false)) {
    private var mMovieTitleView: TextView? = null
    public var movieCoverImage: ImageView? = null


    init {
        mMovieTitleView = itemView.findViewById(R.id.movieTitleTextView)
        movieCoverImage= itemView.findViewById(R.id.movieCoverImageView)
    }

    fun bind(movie: MovieDataModel) {
        mMovieTitleView?.text = movie.movieName
    }
}