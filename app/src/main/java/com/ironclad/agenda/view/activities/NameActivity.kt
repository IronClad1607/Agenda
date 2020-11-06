package com.ironclad.agenda.view.activities

import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.ironclad.agenda.R
import com.ironclad.agenda.databinding.ActivityNameBinding
import com.ironclad.agenda.utils.SharedPreferenceHelper
import com.ironclad.agenda.view.viewmodel.NameActivityViewModel

class NameActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNameBinding
    private lateinit var viewModel: NameActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_name)
        viewModel = ViewModelProvider(this).get(NameActivityViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        val sharedPreferences =
            getSharedPreferences(SharedPreferenceHelper.spFirstTime, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()


        binding.btnNext.setOnClickListener {
            val name = viewModel.name.value!!
            if (name.isNotEmpty()) {
                editor.putString(SharedPreferenceHelper.keyName, name)
                editor.apply()

                val homeIntent = Intent(this, HomeActivity::class.java)
                startActivity(homeIntent)
            } else {
                Toast.makeText(this, "Please Enter Name!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}