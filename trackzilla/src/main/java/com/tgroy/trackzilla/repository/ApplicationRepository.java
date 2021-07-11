package com.tgroy.trackzilla.repository;

import org.springframework.data.repository.CrudRepository;

import com.tgroy.trackzilla.model.Application;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
