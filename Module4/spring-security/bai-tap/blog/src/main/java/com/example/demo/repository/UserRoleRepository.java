package com.example.demo.repository;

import com.example.demo.model.AppUser;
import com.example.demo.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole,Long> {
List<UserRole> findByAppUser(AppUser appUser);
}
