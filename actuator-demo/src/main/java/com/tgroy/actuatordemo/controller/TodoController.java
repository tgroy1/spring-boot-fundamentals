package com.tgroy.actuatordemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tgroy.actuatordemo.model.TodoList;
import com.tgroy.actuatordemo.service.TodoService;

@RestController
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
    private TodoService todoService;

	@GetMapping("/lists")
    public List<TodoList> getTodoLists() {
        return todoService.getTodoLists();
    }
}
