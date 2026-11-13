package com.example.pertemuan9.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface SiswaDao {
    @Query(value="SELECT * FROM tblSiswa ORDER BY nama ASC")
    fun getAll(): Flow<List<Siswa>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)
}