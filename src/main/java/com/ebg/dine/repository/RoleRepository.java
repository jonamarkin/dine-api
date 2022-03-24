package com.ebg.dine.repository;

import com.ebg.dine.models.auth.ERole;
import com.ebg.dine.models.auth.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
    //Role findByRole(String role);
}

