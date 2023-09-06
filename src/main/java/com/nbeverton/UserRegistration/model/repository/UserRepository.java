package com.nbeverton.UserRegistration.model.repository;

import com.nbeverton.UserRegistration.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
