package com.pharmaser.bitacora.repository;

import com.pharmaser.bitacora.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
