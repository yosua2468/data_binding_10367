package com.example.data_binding_10367

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    
    val currentRandomFruitName: LiveData<String>
        get()= FakeRepository.currentRandomFruitName
    
    fun onChangeRandomFruitClick() = FakeRepository.changeCurrentRandomFruitName()
    
    val editTextContent = MutableLiveData<String>()
    
    private val _displayedEditTextContent = MutableLiveData<String>()
    val displayedEditTextContext: LiveData<String>
        get() = _displayedEditTextContent
    
    fun onDisplayEditTextContentClick(){
        _displayedEditTextContent.value = editTextContent.value
    }
    
    fun onSelectRandomEditTextFruit(){
        editTextContent.value = FakeRepository.getRandomfruitName()
    }
            
    
}