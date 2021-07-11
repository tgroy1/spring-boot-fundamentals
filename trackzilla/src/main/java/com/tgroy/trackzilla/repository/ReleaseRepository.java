package com.tgroy.trackzilla.repository;

import org.springframework.data.repository.CrudRepository;

import com.tgroy.trackzilla.model.Release;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}