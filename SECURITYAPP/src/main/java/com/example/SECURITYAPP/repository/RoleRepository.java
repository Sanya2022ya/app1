package com.example.SECURITYAPP.repository;

import com.example.SECURITYAPP.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
