package com.citybuzz.repositories;

import org.springframework.data.repository.CrudRepository;

import com.citybuzz.domain.User;

public interface UserRepository extends CrudRepository<User, String> {

}