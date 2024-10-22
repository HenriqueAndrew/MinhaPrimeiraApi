package br.edu.utfpr.minhaprimeiraapi.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import br.edu.utfpr.minhaprimeiraapi.database.converters.DateConverters
import br.edu.utfpr.minhaprimeiraapi.database.dao.UserLocationDao
import br.edu.utfpr.minhaprimeiraapi.database.model.UserLocation

@Database(entities = [UserLocation::class], version = 2, exportSchema = true)
@TypeConverters(DateConverters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userLocationDao(): UserLocationDao
}