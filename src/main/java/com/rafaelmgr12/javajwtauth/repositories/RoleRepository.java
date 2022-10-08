package com.rafaelmgr12.javajwtauth.repositories;

import com.rafaelmgr12.javajwtauth.models.ERole;
import com.rafaelmgr12.javajwtauth.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}

