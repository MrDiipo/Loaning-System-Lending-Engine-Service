package com.mrdiipo.profile.domain.repository;

import com.mrdiipo.profile.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
