package com.mobile.merrybelt.ui.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobile.merrybelt.databinding.ActivityCompleteRegistrationBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class CompleteSignUp : AppCompatActivity() {

    private lateinit var binding: ActivityCompleteRegistrationBinding
    //private val viewModel: ProfileViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCompleteRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}