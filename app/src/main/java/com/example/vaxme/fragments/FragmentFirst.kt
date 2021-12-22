package com.example.vaxme.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.vaxme.R

class FragmentFirst: Fragment(R.layout.fragment_first) {
    private lateinit var editText: EditText
    private lateinit var button: Button
    private lateinit var textView: TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        editText = view.findViewById(R.id.editText)
        button = view.findViewById(R.id.button )
        textView = view.findViewById(R.id.textView)

        val sharedPreferences = this.getActivity()?.getSharedPreferences("IMG",0)
        val notes = sharedPreferences?.getString("IMGLINKS", "")
        textView.text = notes
        button.setOnClickListener {
            val imgLink = editText.text.toString()
            sharedPreferences?.edit()
            ?.putString("IMGLINKS",imgLink)
            ?.apply()
        }
    }
}