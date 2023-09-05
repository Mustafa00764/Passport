package com.example.passport.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.findFragment
import androidx.navigation.fragment.findNavController
import com.example.passport.R
import com.example.passport.data.local.UserRepository
import com.example.passport.model.User


class AddUserFragment : Fragment(R.layout.fragment_add_user) {
lateinit var repositori:UserRepository
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
    }

    private fun initViews(view: View) {
        repositori= UserRepository(requireActivity().application)
        val bSave= view.findViewById<Button>(R.id.b_save)
        val et_familiya = view.findViewById<EditText>(R.id.et_familiya)
        val et_dad_name = view.findViewById<EditText>(R.id.et_dad_name)
        val et_viloyat = view.findViewById<EditText>(R.id.et_viloyat)
        val et_tuman = view.findViewById<EditText>(R.id.et_tuman)
        val passport = view.findViewById<EditText>(R.id.passport)
        val et_olingan_vaqti = view.findViewById<EditText>(R.id.et_olingan_vaqti)
        val et_muddati = view.findViewById<EditText>(R.id.et_muddati)
        val etName = view.findViewById<EditText>(R.id.et_name)
        val et_gender = view.findViewById<EditText>(R.id.et_gender)

        bSave.setOnClickListener {
            val name = etName.text.toString()
            val familiya = et_familiya.text.toString()
            val dadname = et_dad_name.text.toString()
            val viloyat = et_viloyat.text.toString()
            val tuman = et_tuman.text.toString()
            val passport = passport.text.toString()
            val olinganvaqti = et_olingan_vaqti.text.toString()
            val muddat = et_muddati.text.toString()
            val gender = et_gender.text.toString()
            val user=User(name,familiya,dadname,viloyat,tuman,passport,olinganvaqti,muddat,gender)
            repositori.saveUser(user)
            findNavController().navigate(R.id.action_addUserFragment_to_menuFragment)
        }
    }



}