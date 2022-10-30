package edu.temple.flossplayer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BookViewModel : ViewModel() {

    val selectedBook : MutableLiveData<BookList> by lazy {
        MutableLiveData<BookList>()
    }

    private var selectedIndex = MutableLiveData<Int>(-1)


    fun setBookList(_bookList: BookList) {

        this.selectedBook.value = _bookList
    }

    fun getBookList() : LiveData<BookList>{
        return selectedBook
    }

    fun setSelectedIndex(_position : Int) {
        this.selectedIndex = MutableLiveData<Int>(_position)
    }

    fun getSelectedBook(): Book {
        return selectedBook.value!!.get(selectedIndex.value!!)
    }

    fun getSelectedIndex(): LiveData<Int>{
        return selectedIndex
    }
}
