package edu.temple.flossplayer

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentContainerView
import androidx.lifecycle.ViewModelProvider

open class BookFragment : Fragment() { //this is child fragment

    lateinit var title_textView: TextView
    lateinit var author_textView: TextView
    lateinit var bookViewModel: BookViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            bookViewModel = ViewModelProvider(requireActivity())[(BookViewModel::class.java)]
        }
    }

    fun onItemClicked(book: BookList) {
        bookViewModel.setBookList(book)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_book, container, false).also {
            val title = it.findViewById<TextView>(R.id.title_textView)
            val author = it.findViewById<TextView>(R.id.author_textView)

            (requireActivity() as MainActivity).bookViewModel.getBookList()
                .observe(requireActivity()) {
                    title.text = title.toString()
                    author.text = author.toString()
                }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val clickEvent = { book: Book -> BookViewModel() }

        bookViewModel.getSelectedIndex().observe(viewLifecycleOwner)
        {
            view.findViewById<FragmentContainerView>(R.id.book_layout)
        }
    }
}

