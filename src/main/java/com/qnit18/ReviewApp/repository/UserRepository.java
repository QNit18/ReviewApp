package com.qnit18.ReviewApp.repository;


import com.qnit18.ReviewApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    boolean existsUsersByUsername(String userName);
}
