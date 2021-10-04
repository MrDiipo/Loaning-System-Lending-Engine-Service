package com.mrdiipo.lending_engine.domain.repository;

import com.mrdiipo.lending_engine.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
