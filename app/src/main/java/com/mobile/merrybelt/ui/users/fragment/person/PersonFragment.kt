package com.mobile.merrybelt.ui.users.fragment.person

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.mobile.merrybelt.R
import com.mobile.merrybelt.databinding.FragmentPersonBinding

import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PersonFragment : Fragment(R.layout.fragment_person) {

    private lateinit var binding: FragmentPersonBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPersonBinding.bind(view)
    }

}