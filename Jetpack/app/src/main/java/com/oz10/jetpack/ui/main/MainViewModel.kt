package com.oz10.jetpack.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val usd_to_eu_rate = 0.74f
    var dollarText: MutableLiveData<String> = MutableLiveData()
    var result: MutableLiveData<Float> = MutableLiveData()

    fun convertValue() {
        dollarText.let {
            if (!it.value.equals(""))
                result.value = it.value?.toFloat()?.times(usd_to_eu_rate)
            else
                result.value = 0f
        }
    }


}