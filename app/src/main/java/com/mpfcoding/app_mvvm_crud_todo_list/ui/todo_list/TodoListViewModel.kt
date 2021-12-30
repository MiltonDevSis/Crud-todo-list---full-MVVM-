package com.mpfcoding.app_mvvm_crud_todo_list.ui.todo_list

import androidx.lifecycle.ViewModel
import com.mpfcoding.app_mvvm_crud_todo_list.data.TodoRepository
import com.mpfcoding.app_mvvm_crud_todo_list.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import javax.inject.Inject

@HiltViewModel
class TodoListViewModel @Inject constructor(
    private val repository: TodoRepository
): ViewModel() {

    val todos = repository.getTodos()

    private val _uiEvents = Channel<UiEvent>()
    val uiEvent = _uiEvents.receiveAsFlow()
}