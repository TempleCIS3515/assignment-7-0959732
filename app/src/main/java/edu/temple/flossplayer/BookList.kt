package edu.temple.flossplayer

class BookList() {

    //book objects using an ArrayList
    val arrayBookList = ArrayList<Book>()

    fun add(book: Book) {
        arrayBookList.add(book)
    }

    fun remove(book: Book){
       arrayBookList.remove(book)
    }

    operator fun get(int: Int): Book {
        return arrayBookList[int]
    }

    fun size(): Int{
        return arrayBookList.size
    }






}