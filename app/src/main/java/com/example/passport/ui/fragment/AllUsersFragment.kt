package com.example.passport.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.passport.R
import com.example.passport.model.User


class AllUsersFragment : Fragment(R.layout.fragment_all_users) {
    lateinit var users:ArrayList<User>
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
    }

    private fun initViews(view: View) {

    }


}