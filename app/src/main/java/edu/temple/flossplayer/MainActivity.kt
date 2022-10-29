package edu.temple.flossplayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var bookViewModel: BookViewModel
    var landscape = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        landscape = (findViewById<FragmentContainerView>(R.id.container_2) != null)
        //bookViewModel.SelectedBook(this,

        object {
            val ITEM_KEY = "key"
        }


        // Set the title for the activity.
        supportActionBar?.title = "FlossPlayer"


        //instance of BookList class
        val myBooklist = BookList()
        myBooklist.add(Book("Colleen Hoover", "Reminders of Him"))
        myBooklist.add(Book("Jess Kidd", "Himself"))
        myBooklist.add(Book("Armando Lucas Correa", "The Daughter's Tales"))
        myBooklist.add(Book("Megan Miranda", "All the Missing Girls"))
        myBooklist.add(Book("Sally Rooney", "Normal People"))
        myBooklist.add(Book("Lisa Jewell", "The Family Upstairs"))
        myBooklist.add(Book("Jeanine Cummins", "The Outside Boy"))
        myBooklist.add(Book("Rebecca Serle", "The Dinner List"))
        myBooklist.add(Book("Kim Liggett", "The Grace Year"))
        myBooklist.add(Book("Mariana Zapata", "All Rhoades Lead Here"))

        bookViewModel = ViewModelProvider(this)[BookViewModel::class.java]
        bookViewModel.booklist = myBooklist

        if (savedInstanceState == null) {
            val bookListFragment = BookListFragment()
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container_1, bookListFragment)
                .commit()
        }
    }

    override fun onBookSelected() {
        if (!landscape) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container_2, BookPlayerFragment())
                .commit()
        }
    }


        interface BookSelection {
            fun onBookSelected()
        }
    }





