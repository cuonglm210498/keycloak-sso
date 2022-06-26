package com.example.keycloaksso.repository;

import com.example.keycloaksso.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * author cuonglm18
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
