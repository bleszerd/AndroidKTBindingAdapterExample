package com.github.bleszerd.bindingtest.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.github.bleszerd.bindingtest.R
import com.github.bleszerd.bindingtest.data.Posts

class PostAdapter(private val dataset: List<Posts>) :
    RecyclerView.Adapter<PostAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val buttonPostText: Button = view.findViewById(R.id.buton_post)

        init {
            buttonPostText.setOnClickListener {
                Toast.makeText(buttonPostText.context, "Text", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.post_item_activity, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.buttonPostText.text = dataset[position].toString()
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}