package com.example.budrt

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.budrt.TransactionDao

@Database(entities = arrayOf(Transaction::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun transactionDao() : TransactionDao
}