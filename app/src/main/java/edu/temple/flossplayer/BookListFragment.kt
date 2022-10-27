package edu.temple.flossplayer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView

class BookListFragment : Fragment() {

    lateinit var recyclerView : RecyclerView
    private lateinit var bookViewModel: BookViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //view model
        bookViewModel = ViewModelProvider(requireActivity()).get(BookViewModel::class.java)

        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_book_list, container, false).also {
            //recycler view
            recyclerView.findViewById<RecyclerView>(R.id.booklist_recyclerView)
        }

    }


//needed?
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        val clickEvent = { book:Book -> BookViewModel() }
}