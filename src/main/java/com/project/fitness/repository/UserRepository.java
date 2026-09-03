package com.project.fitness.repository;

import com.project.fitness.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface UserRepository extends JpaRepository<User , String > {
    User findByEmail(String email);

}
