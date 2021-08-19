package com.aipaygo.retrofitkotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aipaygo.retrofitkotlin.model.Post
import com.aipaygo.retrofitkotlin.repository.Repo
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repo): ViewModel() {

    val theResponse: MutableLiveData<Post> = MutableLiveData()

    fun getPost(){
        viewModelScope.launch{
            val response = repository.getPost()
            theResponse.value = response
        }
    }

}