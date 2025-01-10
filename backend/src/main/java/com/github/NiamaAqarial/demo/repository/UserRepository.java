package com.github.NiamaAqarial.demo.repository;

import com.github.NiamaAqarial.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
