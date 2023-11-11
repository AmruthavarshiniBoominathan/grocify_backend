package com.iamneo.hotelhub.repo;

import com.iamneo.hotelhub.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users,Integer> {

    Optional<Users> findByEmail(String email);
}
