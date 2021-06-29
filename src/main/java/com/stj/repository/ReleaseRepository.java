package com.stj.repository;

import org.springframework.data.repository.CrudRepository;

import com.stj.entity.Release;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}
