package com.example.teht5

import androidx.recyclerview.widget.RecyclerView
import com.example.teht5.databinding.ItemMemberOfParliamentBinding


class MemberOfParliamentViewHolder(private val view: ItemMemberOfParliamentBinding) : RecyclerView.ViewHolder(view.root) {
    fun bind(member: MemberOfParliament) {
        view.nameTextView.text = "${member.first} ${member.last}"
        view.partyTextView.text = member.party
    }
}