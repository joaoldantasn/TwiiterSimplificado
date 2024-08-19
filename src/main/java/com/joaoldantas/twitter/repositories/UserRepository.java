package com.joaoldantas.twitter.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaoldantas.twitter.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID>{

}
