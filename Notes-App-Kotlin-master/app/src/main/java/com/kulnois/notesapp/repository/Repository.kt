package com.kulnois.notesapp.repository

import androidx.lifecycle.LiveData
import com.kulnois.notesapp.model.Note


interface Repository {
    suspend fun addNote(note: Note)

    suspend fun updateNote(note: Note)

    fun getNotes(): LiveData<List<Note>>

    fun getNote(key: Long): LiveData<Note>

    suspend fun deleteNote(note: Note)
}