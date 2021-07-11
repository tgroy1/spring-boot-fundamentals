package com.tgroy.actuatordemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tgroy.actuatordemo.model.TodoList;

@Repository
public interface TodoRepository extends CrudRepository<TodoList, Long> {

}
