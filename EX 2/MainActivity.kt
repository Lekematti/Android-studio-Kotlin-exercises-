package com.example.teht4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teht4.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var members: List<MemberOfParliament>
    private var randomMP: MemberOfParliament = MemberOfParliament(0, 0, "", "", "", false, "", "", 0, "")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        members = ParliamentMembersData.members
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.text = "Next parlament member"

        fun showRandomMP() {
            randomMP = members[java.util.Random().nextInt(members.size)]
            binding.nameTextView.text = "${randomMP.first} ${randomMP.last}"
            binding.partyTextView.text = randomMP.party
            binding.pmImage.setImageResource(R.drawable.ic_launcher_foreground)
        }

        showRandomMP()

        binding.button1.setOnClickListener {
            showRandomMP()
        }
    }
}
