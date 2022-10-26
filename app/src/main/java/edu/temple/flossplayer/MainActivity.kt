package edu.temple.flossplayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var object1 = BookList("Colleen Hoover", "Reminders of Him")
        var object2 = BookList("Jess Kidd", "Himself")
        var object3 = BookList("Armando Lucas Correa", "The Daughter's Tales")
        var object4 = BookList("Megan Miranda", "All the Missing Girls")
        var object5 = BookList("Sally Rooney", "Normal People")
        var object6 = BookList("Lisa Jewell", "The Family Upstairs")
        var object7 = BookList("Mariana Zapata", "All Rhoades Lead Here")
        var object8 = BookList("Jeanine Cummins", "The Outside Boy")
        var object9 = BookList("Rebecca Serle", "The Dinner List")
        var object10 = BookList("Kim Liggett", "The Grace Year")

    }
}








//    override fun onBackPressed() { //WHEN BACK arrow is pressed
//        //clear selected state
//        super.onBackPressed()
//    }
