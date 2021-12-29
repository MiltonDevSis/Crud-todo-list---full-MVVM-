package com.mpfcoding.app_mvvm_crud_todo_list

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mpfcoding.app_mvvm_crud_todo_list.ui.theme.App_MVVM_Crud_Todo_ListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App_MVVM_Crud_Todo_ListTheme {

            }
        }
    }
}