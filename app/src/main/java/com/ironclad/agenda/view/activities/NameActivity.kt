package com.ironclad.agenda.view.activities

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ironclad.agenda.R
import com.ironclad.agenda.databinding.ActivityNameBinding

class NameActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_name)
        binding.etName.boxStrokeColor = Color.rgb(249,249,249)
    }
}