package com.bacusoft.themoviescorner.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UpcomingViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is upcoming movies Fragment"
    }
    val text: LiveData<String> = _text
}