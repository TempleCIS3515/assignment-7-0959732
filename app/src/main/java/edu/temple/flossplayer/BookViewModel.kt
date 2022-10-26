package edu.temple.flossplayer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BookViewModel : ViewModel() {

    val selectedBook : MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    fun setSelectedBook(book: String) {

        selectedBook.value = book
    }

    fun getSelectedBook() : LiveData<String> {
        return selectedBook
    }
}
}