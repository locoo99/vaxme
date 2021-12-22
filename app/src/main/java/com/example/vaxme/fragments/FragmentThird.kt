package com.example.vaxme.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.vaxme.R

class FragmentThird: Fragment(R.layout.fragment_third) {
    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var editText: EditText
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.textView)
        button = view.findViewById(R.id.button)
        editText = view.findViewById(R.id.editText)
        val sharedPreferences = this.getActivity()?.getSharedPreferences("pref", 0)
        val notes = sharedPreferences?.getString("NOTES", "")
        textView.text = notes
        button.setOnClickListener {
            val note= textView.text.toString()
            val nnote = editText.text.toString()
            val result = nnote + "\n" + note
            textView.text = result
            sharedPreferences?.edit()
                ?.putString("NOTES",result)
                ?.apply()
        }


    }
}