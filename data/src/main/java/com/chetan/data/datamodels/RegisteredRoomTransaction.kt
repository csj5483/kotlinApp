package com.chetan.data.datamodels

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

//If you're Data Models for a given API require API specific code, then create a separate Data
//Model instead of polluting your domain with platform specific APIs.
@Entity(
        tableName = "transactions",
        indices = [Index("creation_date")]
)
data class RegisteredRoomTransaction(

        @PrimaryKey
        @ColumnInfo(name = "creation_date")
        val creationDate: String,

        @ColumnInfo(name = "contents")
        val contents: String,

        @ColumnInfo(name = "up_votes")
        val upVotes: Int,

        @ColumnInfo(name = "image_url")
        val imageUrl: String,

        @ColumnInfo(name = "creator_id")
        val creatorId: String,

        @ColumnInfo(name = "transaction_type")
        val transactionType: String
)