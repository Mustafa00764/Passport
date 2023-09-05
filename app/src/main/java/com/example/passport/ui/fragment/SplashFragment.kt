package com.example.passport.ui.fragment

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.passport.R


class SplashFragment : Fragment(R.layout.fragment_splash) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
    }

    private fun initViews(view: View) {
        nextFragment()
    }

    private fun nextFragment() {
        Handler(Looper.getMainLooper()).postDelayed({
           findNavController().navigate(R.id.action_splashFragment_to_menuFragment)

        },2000)
    }


}