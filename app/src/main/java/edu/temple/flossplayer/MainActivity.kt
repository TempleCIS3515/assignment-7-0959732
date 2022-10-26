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

        //instance of BookList class
        val myBooklist = BookList("Colleen Hoover", "Reminders of Him")
        myBooklist.add("Jess Kidd","Himself")
        myBooklist.add("Armando Lucas Correa", "The Daughter's Tales")
        myBooklist.add("Megan Miranda", "All the Missing Girls")
        myBooklist.add("Sally Rooney", "Normal People")
        myBooklist.add("Lisa Jewell", "The Family Upstairs")
        myBooklist.add("Jeanine Cummins", "The Outside Boy")
        myBooklist.add("Rebecca Serle", "The Dinner List")
        myBooklist.add("Kim Liggett", "The Grace Year")
        myBooklist.add("Mariana Zapata", "All Rhoades Lead Here")


    }

    override fun BookSelected() {
        if (findViewById<View>(R.id.container2) == null) 
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container_1, BookListFragment())
                .addToBackStack(null)
                .commit()
    }













}







}













//    override fun onBackPressed() { //WHEN BACK arrow is pressed
//        //clear selected state
//        super.onBackPressed()
//    }
