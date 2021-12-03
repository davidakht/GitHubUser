package com.example.githubuser

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var imgAvatar : ImageView = itemView.findViewById(R.id.img_item_avatar)
    var tvUsername : TextView = itemView.findViewById(R.id.tv_item_username)
    var tvName : TextView = itemView.findViewById(R.id.tv_item_name)
    var tvLocation : TextView = itemView.findViewById(R.id.tv_item_location)
    var tvRepository : TextView = itemView.findViewById(R.id.tv_item_repository)
    var tvCompany : TextView = itemView.findViewById(R.id.tv_item_company)
    var tvFollowers : TextView = itemView.findViewById(R.id.tv_item_followers)
    var tvFollowing : TextView = itemView.findViewById(R.id.tv_item_following)
}