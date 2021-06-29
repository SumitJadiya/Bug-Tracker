package com.stj.repository;

import org.springframework.data.repository.CrudRepository;

import com.stj.entity.Application;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
