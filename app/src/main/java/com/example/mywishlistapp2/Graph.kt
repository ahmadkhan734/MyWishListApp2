package com.example.mywishlistapp2

import android.content.Context
import androidx.room.Room
import com.example.mywishlistapp2.data.WishDatabase
import com.example.mywishlistapp2.data.WishRepository

object Graph {

    lateinit var database: WishDatabase

    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }

    fun provide(context: Context){
        database = Room.databaseBuilder(context,
            WishDatabase::class.java,
            "wishList.db").build()
    }
}