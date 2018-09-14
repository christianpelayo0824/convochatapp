package com.convochat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.convochat.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
