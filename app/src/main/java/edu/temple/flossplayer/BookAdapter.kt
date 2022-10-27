package edu.temple.flossplayer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(_books: BookList,_clickEvent: (Book)->Unit) : RecyclerView.Adapter<BookAdapter.ViewHolder>()
{
    val booklist=_books
    val bookclick = _clickEvent

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val bookView = LayoutInflater.from(parent.context).inflate(R.layout.fragment_book,parent,false)
        return ViewHolder(bookView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.author.text = booklist[position].author
        holder.title.text = booklist[position].title
        holder.book = booklist[position]
    }

    override fun getItemCount(): Int {
       return booklist.size()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title : TextView = itemView.findViewById(R.id.title_textView)
        val author : TextView =itemView.findViewById(R.id.author_textView)
        lateinit var book :Book

            init {
                itemView.setOnClickListener{
                    bookclick(book)
                }
            }
    }
}
