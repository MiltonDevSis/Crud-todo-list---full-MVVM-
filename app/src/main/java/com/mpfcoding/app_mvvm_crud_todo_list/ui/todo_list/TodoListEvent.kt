package com.mpfcoding.app_mvvm_crud_todo_list.ui.todo_list

import com.mpfcoding.app_mvvm_crud_todo_list.data.Todo

sealed class TodoListEvent{
    data class OnDeleteTodo(val todo: Todo): TodoListEvent()
    data class OnDoneChange(val todo: Todo, val isDone: Boolean): TodoListEvent()
    data class OnTodoClick(val todo: Todo): TodoListEvent()
    object OnUndoDeleteClick: TodoListEvent()
    object OnAddTodoClick: TodoListEvent()
}
