package com.example.spring_boot_demo1.Repositories;

import com.example.spring_boot_demo1.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
