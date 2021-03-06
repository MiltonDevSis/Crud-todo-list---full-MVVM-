package com.mpfcoding.app_mvvm_crud_todo_list.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Todo::class],
    version = 1
)
abstract class TodoDatabase: RoomDatabase() {

    abstract val dao: TodoDao
}