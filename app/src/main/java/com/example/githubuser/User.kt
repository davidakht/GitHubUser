package com.example.githubuser

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.parcelize.Parceler

@Parcelize

data class User(
    var username : String?,
    var name : String?,
    var location: String?,
    var repository : String?,
    var company : String?,
    var followers : String?,
    var following : String?,
    var avatar : Int?,
) : Parcelable {
    constructor(parcel: Parcel) : this (
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int){
    }

    companion object : Parceler<User> {

        override fun User.write(parcel: Parcel, flags: Int) {
            parcel.writeString(username)
            parcel.writeString(name)
            parcel.writeString(location)
            parcel.writeString(repository)
            parcel.writeString(company)
            parcel.writeString(followers)
            parcel.writeString(following)
            parcel.writeValue(avatar)
        }

        override fun create(parcel: Parcel): User {
            return User(parcel)
        }
    }

}
