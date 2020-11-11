package com.ironclad.agenda.view.activities

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.ironclad.agenda.R
import com.ironclad.agenda.databinding.ActivityHomeBinding
import com.ironclad.agenda.utils.SharedPreferenceHelper

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

        binding.fab.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_newTaskFragment)
        }

        binding.bottomAppBar.setOnMenuItemClickListener { menuItems ->
            when (menuItems.itemId) {
                R.id.search -> {
                    Toast.makeText(this, "Search Tapped", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.accAndSettings -> {
                    binding.root.findNavController().navigate(R.id.action_homeFragment_to_accountFragment)
                    true
                }
                else -> false
            }
        }
    }
}