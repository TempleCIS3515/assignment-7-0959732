package edu.temple.flossplayer

import android.app.FragmentTransaction
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

open class BookFragment : Fragment() { //this is parent fragment

    lateinit var title_textView: TextView
    lateinit var author_textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_book, container, false)




//            var childFragment: ChildFragment()
//            FragmentTransaction transaction = getChildFragmentManager()
//                .beginTransaction()
//            transaction.replace(R.id.BookPlayerFragment, childFragment)
//                .commit()

        }

    }


}
