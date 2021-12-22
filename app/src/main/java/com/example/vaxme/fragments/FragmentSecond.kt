package com.example.vaxme.fragments

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.vaxme.R

class FragmentSecond: Fragment(R.layout.fragment_second){
    private lateinit var imageView: ImageView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageView = view.findViewById(R.id.imageView)
        val sharedPreferences = this.getActivity()?.getSharedPreferences("IMG", 0)
        val img = sharedPreferences?.getString("IMGLINKS","")


        Glide.with(this)
            .load(img)
            .placeholder(R.drawable.ic_launcher_background)
            .into(imageView)

    }

    override fun onResume() {
        super.onResume()
        val sharedPreferences = this.getActivity()?.getSharedPreferences("IMG", 0)
        val img = sharedPreferences?.getString("IMGLINKS","")


        Glide.with(this)
            .load(img)
            .placeholder(R.drawable.ic_launcher_background)
            .into(imageView)
    }
}