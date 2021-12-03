package com.example.githubuser

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class ListUserAdapter (private val listUser: ArrayList<User>): RecyclerView.Adapter<ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i : Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_user, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (username, name, location, repository, company, followers, following, avatar) = listUser[position]
        holder.imgAvatar.setImageResource(avatar)
        holder.tvUsername.text = username
        holder.tvName.text = name
        holder.tvLocation.text = location
        holder.tvRepository.text = repository
        holder.tvCompany.text = company
        holder.tvFollowers.text = followers
        holder.tvFollowing.text = following

        holder.itemView.setOnClickListener{
        val movewithObjectIntent = Intent (this, DetailUserActivity::class.java)
            movewithObjectIntent.putExtra(DetailUserActivity.EXTRA_USER, listUser)
            startActivity(movewithObjectIntent)}

    //onItemClickCallback.onItemClicked(listUser[holder.adapterPosition])}
    }

    override fun getItemCount(): Int = listUser.size
}