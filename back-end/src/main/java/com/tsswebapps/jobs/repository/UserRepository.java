package com.tsswebapps.jobs.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsswebapps.jobs.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
