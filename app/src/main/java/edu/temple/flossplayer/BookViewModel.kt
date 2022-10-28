package edu.temple.flossplayer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BookViewModel : ViewModel() {

    val selectedBook : MutableLiveData<BookList> by lazy {
        MutableLiveData<BookList>()
    }
    lateinit var booklist: BookList


    fun SelectedBook(book: BookList) {

        selectedBook.value = book
    }

    fun getSelectedBook() : LiveData<BookList>{
        return selectedBook
    }
}
