package com.example.todoapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todoapp.model.Todo;
import com.example.todoapp.repository.TodoRepository;
@Service
public class TodoService implements ITodoService{
	//private static List<Todo> todos=new ArrayList<>();

    @Autowired
    TodoRepository todoRepository;
    
    @Override
    public List<Todo> findAll() { // Business Logic
        return todoRepository.findAll();
    }
    @Override
    public Todo findById(int id) { // business Logic
        return todoRepository.findById(id).get();
    }
    @Override
    public void addTodo(Todo todo) {
        todoRepository.save(todo);
    }
    @Override
    public void deleteTodo(int id) {
        todoRepository.deleteById(id);
    }
    @Override
    public void updateTodo(int id,Todo newTodo) {

        Todo todo=todoRepository.findById(id).get();

        todo.setId(newTodo.getId());
        todo.setTitle(newTodo.getTitle());
        todo.setStatus(newTodo.isStatus());

        todoRepository.save(todo);
    }
}
