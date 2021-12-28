package com.oz10.jetpack.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val usd_to_eu_rate = 0.74f
    private var dollarText = ""
    private var result: MutableLiveData<Float> = MutableLiveData()

    fun setAmount(value: String) {
        this.dollarText = value
        this.result.value = value.toFloat() * usd_to_eu_rate
    }

    fun getResult(): MutableLiveData<Float> {
        return result
    }

}