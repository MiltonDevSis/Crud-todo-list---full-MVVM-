package com.mpfcoding.app_mvvm_crud_todo_list

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
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