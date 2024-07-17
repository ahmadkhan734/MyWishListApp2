package com.example.mywishlistapp2.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "wish_table" )
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish_title")
    val title:String = "",
    @ColumnInfo(name = "wish_desc")
    val description: String = ""
)



object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch 2",
            description = "An Android Watch"),
        Wish(title = "Oculus Quest 2",
            description = "A VR headset for playing games"),
        Wish(title = "A Sci-Fi TV",
            description = "A Science friction book from any seller"),
        Wish(title = "A bean Bag 2",
            description = "A bean Bag for comfy chair in room"),
        Wish(title = "Google Watch 2",
            description = "An Android Watch")
    )
}
