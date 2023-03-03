package com.example.todoapp.service;

import java.util.List;

import com.example.todoapp.model.Todo;

public interface ITodoService {

	public List<Todo> findAll();

	public Todo findById(int id);

	public void addTodo(Todo todo);

	public void deleteTodo(int id);

	public void updateTodo(int id, Todo newTodo);
	   
}
