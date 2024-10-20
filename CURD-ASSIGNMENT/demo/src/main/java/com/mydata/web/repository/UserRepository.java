package com.mydata.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydata.web.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
