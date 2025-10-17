package com.klef.labexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.labexam.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
