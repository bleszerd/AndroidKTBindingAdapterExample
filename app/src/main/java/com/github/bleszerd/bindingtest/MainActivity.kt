package com.github.bleszerd.bindingtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.bleszerd.bindingtest.adapters.PostAdapter
import com.github.bleszerd.bindingtest.data.Posts
import com.github.bleszerd.bindingtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val posts: List<Posts> = listOf(
            Posts("Post 01"),
            Posts("Post 02"),
            Posts("Post 03"),
            Posts("Post 04"),
            Posts("Post 05"),
            Posts("Post 06"),
            Posts("Post 07"),
        )

        binding.recyclerView.adapter = PostAdapter(posts)
    }
}