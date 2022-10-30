package edu.temple.flossplayer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BookViewModel : ViewModel() {

    val selectedBook : MutableLiveData<BookList> by lazy {
        MutableLiveData<BookList>()
    }

    private var selectedIndex = -1


    fun SelectedBook(selectedBook: BookList) {

        this.selectedBook.value = selectedBook
    }

    fun getBookList() : LiveData<BookList>{
        return selectedBook
    }

    fun setSelectedIndex(position : Int) {
        this.selectedIndex = position
    }

    fun getSelectedBook(): Book {
        return selectedBook.value!!.get(selectedIndex)
    }
    fun getSelectedIndex(): Int{
        return selectedIndex
    }
}
