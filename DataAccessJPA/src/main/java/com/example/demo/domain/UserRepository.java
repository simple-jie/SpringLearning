package com.example.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String name);

    @Query("from t_user u where u.userName=:name")
    User findUserByUserName(@Param("name") String name);

}
