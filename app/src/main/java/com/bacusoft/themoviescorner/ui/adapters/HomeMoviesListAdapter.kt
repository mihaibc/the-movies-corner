package com.bacusoft.themoviescorner.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bacusoft.themoviescorner.data.models.MovieDataModel
import com.bumptech.glide.Glide

class HomeMoviesListAdapter(private val list: List<MovieDataModel>)
    : RecyclerView.Adapter<HomeMovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeMovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return HomeMovieViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: HomeMovieViewHolder, position: Int) {
        val movie: MovieDataModel = list[position]
        holder.bind(movie)
        Glide
            .with(holder.itemView)
            .load(movie.movieCoverUrl)
            .centerCrop()
            .into(holder.movieCoverImage!!)
    }
    override fun getItemCount(): Int = list.size

}