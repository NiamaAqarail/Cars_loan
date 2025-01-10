package com.github.NiamaAqarial.demo.repository;

import com.github.NiamaAqarial.demo.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
