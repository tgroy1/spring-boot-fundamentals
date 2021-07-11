package com.tgroy.actuatordemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tgroy.actuatordemo.model.TodoList;
import com.tgroy.actuatordemo.repository.TodoRepository;

@Service
public class TodoService {

	@Autowired
    private TodoRepository todoRepository;

	public List<TodoList> getTodoLists() {
	       return (List<TodoList>) todoRepository.findAll();
	    }
}
