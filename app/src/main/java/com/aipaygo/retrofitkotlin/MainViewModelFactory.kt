package com.aipaygo.retrofitkotlin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aipaygo.retrofitkotlin.repository.Repo

class MainViewModelFactory(
    private val repository: Repo
) : ViewModelProvider.Factory {

    override fun <T: ViewModel?> create(modelClass: Class<T>): T{
        return MainViewModel(repository) as T
    }

}