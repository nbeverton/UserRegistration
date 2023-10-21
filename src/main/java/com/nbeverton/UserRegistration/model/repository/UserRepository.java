package com.nbeverton.UserRegistration.model.repository;

import com.nbeverton.UserRegistration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    public Iterable<User> findByNameContainingIgnoreCase(String partName);
}
