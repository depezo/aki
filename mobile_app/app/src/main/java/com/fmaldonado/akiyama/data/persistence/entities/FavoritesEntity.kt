package com.fmaldonado.akiyama.data.persistence.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.fmaldonado.akiyama.data.models.content.Episode
import org.jetbrains.annotations.NotNull
import java.util.*

@Entity(tableName = "favorites")
data class FavoritesEntity(
    @PrimaryKey(autoGenerate = false)
    @NotNull
    @ColumnInfo(name = "id")
    val id: String = "",
    @NotNull
    @ColumnInfo(name = "title")
    val title: String = "",
    @NotNull
    @ColumnInfo(name = "type")
    val type: String = "",
    @NotNull
    @ColumnInfo(name = "poster")
    val poster: String = "",
    @NotNull
    @ColumnInfo(name = "genres")
    val genres: List<String> = mutableListOf(),
    @NotNull
    @ColumnInfo(name = "date")
    val dateAdded: Long = Date().time,
)
