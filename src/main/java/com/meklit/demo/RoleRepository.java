package com.meklit.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;

public interface RoleRepository extends CrudRepository<AppRole, Long> {
    AppRole findByRole(String role);
}
