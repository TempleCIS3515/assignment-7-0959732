package edu.temple.flossplayer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BookListFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    private lateinit var bookViewModel: BookViewModel
    private var bookList: BookList = BookList()


    var onClick = {position: Int ->
        bookViewModel.setSelectedIndex(position)
        (requireActivity() as BookSelection).onBookSelected()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bookViewModel = ViewModelProvider(requireActivity())[BookViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_book_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bookViewModel.getBookList().observe(requireActivity()) {
            (recyclerView.adapter as BookAdapter).setData(it)
        }
        recyclerView = view.findViewById(R.id.booklist_recyclerView)

        // to layout manager
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 1)
        // to image adapter
        recyclerView.adapter = BookAdapter(bookList,onClick)

    }

    interface BookSelection
    {
        fun onBookSelected()
    }
}