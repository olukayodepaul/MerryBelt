package com.mobile.merrybelt.ui.users.fragment.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.mobile.merrybelt.R
import com.mobile.merrybelt.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
    }

}