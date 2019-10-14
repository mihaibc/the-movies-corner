package com.bacusoft.themoviescorner.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bacusoft.themoviescorner.data.models.MovieDataModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    val movies = listOf(
        MovieDataModel("Batwoman","https://image.tmdb.org/t/p/w600_and_h900_bestv2/jnaimWkIVSD9IInmZPyLYarSvvc.jpg"),
        MovieDataModel("Joker","https://image.tmdb.org/t/p/w600_and_h900_bestv2/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg"),
        MovieDataModel("Arrom","https://image.tmdb.org/t/p/w600_and_h900_bestv2/mo0FP1GxOFZT4UDde7RFDz5APXF.jpg"),
        MovieDataModel("The Flash","https://image.tmdb.org/t/p/w600_and_h900_bestv2/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg"),
        MovieDataModel("Night Hunter","https://image.tmdb.org/t/p/w600_and_h900_bestv2/tAMIXRTHRI7znijZhD6hrR6618J.jpg")
    )
}