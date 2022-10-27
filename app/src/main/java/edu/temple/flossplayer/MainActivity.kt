package edu.temple.flossplayer

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set the title for the activity.
        supportActionBar?.title = "FlossPlayer"



//        object {
//          fun getInstance (index : String) : BookList {


        //instance of BookList class
        val myBooklist = BookList()
        myBooklist.add(Book("Colleen Hoover", "Reminders of Him"))
        myBooklist.add(Book("Jess Kidd","Himself"))
        myBooklist.add(Book("Armando Lucas Correa", "The Daughter's Tales"))
        myBooklist.add(Book("Megan Miranda", "All the Missing Girls"))
        myBooklist.add(Book("Sally Rooney", "Normal People"))
        myBooklist.add(Book("Lisa Jewell", "The Family Upstairs"))
        myBooklist.add(Book("Jeanine Cummins", "The Outside Boy"))
        myBooklist.add(Book("Rebecca Serle", "The Dinner List"))
        myBooklist.add(Book("Kim Liggett", "The Grace Year"))
        myBooklist.add(Book("Mariana Zapata", "All Rhoades Lead Here"))


        val bookListFragment = BookListFragment()
        supportFragmentManager.beginTransaction().replace(R.id.container_1, bookListFragment).commit()

        }


    }

    override fun BookSelected() {

        val bundle = Bundle()
        val transaction = this.supportFragmentManager.beginTransaction()
        val bookFragment = BookFragment()
        bookFragment.arguments = bundle

        transaction.replace(R.id.container_2, bookFragment)
        transaction.commit()


    }





























//    override fun onBackPressed() { //WHEN BACK arrow is pressed
//        //clear selected state
//        super.onBackPressed()
//    }
