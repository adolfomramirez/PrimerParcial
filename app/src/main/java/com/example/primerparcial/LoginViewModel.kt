package com.example.primerparcial
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class LoginViewModel : ViewModel(){
    val username = MutableLiveData<String>()
    val password = MutableLiveData<String>()
    val loginResult = MutableLiveData<Boolean>()

    fun login() {
        val user = username.value
        val pass = password.value
        loginResult.value = (user == "rgonzaleza" && pass == "rgonzaleza")
    }
}