package com.example.passport.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.findFragment
import androidx.navigation.fragment.findNavController
import com.example.passport.R


class MenuFragment : Fragment(R.layout.fragment_menu) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
    }

    private fun initViews(view: View) {
        val bAllUsers = view.findViewById<Button>(R.id.b_all_users)
        val bAddUser = view.findViewById<Button>(R.id.b_add_user)


        bAddUser.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_addUserFragment)
        }

        bAllUsers.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_allUsersFragment)
        }

    }


}