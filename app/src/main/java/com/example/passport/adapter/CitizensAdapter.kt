package com.example.passport.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.passport.R
import com.example.passport.model.User


class CitizensAdapter :RecyclerView.Adapter<CitizensAdapter.CitizensViewHolder>(){


   private var list= ArrayList<User> ()



    fun submitList(newList:ArrayList<User>){

        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CitizensViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return CitizensViewHolder(view)
    }

    override fun getItemCount()= list.size



    override fun onBindViewHolder(holder: CitizensViewHolder, position: Int) {
        val user=list[position]
        holder.apply {

            tvName.text="${user.firstName} ${}"
            tvName.text=list[position].firstName
            tvLLList.setOnClickListener {


            }

        }
    }

    class CitizensViewHolder (view:View):RecyclerView.ViewHolder(view){

        val tvName:TextView=view.findViewById(R.id.tvName_item)
        val tvPassNum:TextView=view.findViewById(R.id.tvPassNum_item)
        val tvLLList: LinearLayout =view.findViewById(R.id.llTitle)

    }

}