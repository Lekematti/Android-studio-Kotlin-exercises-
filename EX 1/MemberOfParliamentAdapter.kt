package com.example.teht5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.teht5.databinding.ItemMemberOfParliamentBinding


class MemberOfParliamentAdapter : RecyclerView.Adapter<MemberOfParliamentViewHolder>() {
    private val members = ParliamentMembersData.members

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberOfParliamentViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = ItemMemberOfParliamentBinding.inflate(inflater, parent, false)
        return MemberOfParliamentViewHolder(view)
    }

    override fun getItemCount(): Int {
        return members.size
    }

    override fun onBindViewHolder(holder: MemberOfParliamentViewHolder, position: Int) {
        val member = members[position]
        holder.bind(member)
    }
}