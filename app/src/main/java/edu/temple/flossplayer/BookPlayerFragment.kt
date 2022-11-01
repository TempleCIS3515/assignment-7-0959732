package edu.temple.flossplayer


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class BookPlayerFragment : Fragment() { //this is a parent fragment

    private lateinit var bookViewModel: BookViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bookViewModel = ViewModelProvider(requireActivity())[BookViewModel::class.java]

        val bookFragment = BookFragment()
        childFragmentManager
            .beginTransaction()
            .add(R.id.container_1, bookFragment)
            .commit()
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_book_player, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bookViewModel.getBookList().observe(requireActivity()) {
            view.findViewById<View>(R.id.fragmentContainerView2)
        }
    }
}
