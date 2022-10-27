package edu.temple.flossplayer

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class BookPlayerFragment : BookFragment() { //this is a parent fragment

   // private var mListener: OnFragmentInteractionListener? = null

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
        return inflater.inflate(R.layout.fragment_book_player, container, false)
    }

    getChildFragmentManager()


//
//            override fun onAttach(context: Context) {
//                super.(context)
//                if (context is OnFragmentInteractionListener) {
//                    mListener = context as OnFragmentInteractionListener
//                } else {
//                    throw RuntimeException(
//                        context.toString()
//                                + " must implement OnFragmentInteractionListener"
//                    )
//                }
//            }
//
//                    override fun onDetach() {
//                        super.onDetach()
//                        mListener = null
//                    }
//
//
//                            interface OnFragmentInteractionListener {
//                                fun messageFromChildFragment(uri: Uri?)
//                            }
//}