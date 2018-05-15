package com.meklit.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepository extends CrudRepository<AppUser, Long>{
    com.meklit.demo.AppUser findByUsername(String username);

    com.meklit.demo.AppUser findByEmail(String email);
    com.meklit.demo.AppUser countByEmail(String email);
    Long countByUsername(String username);
}
