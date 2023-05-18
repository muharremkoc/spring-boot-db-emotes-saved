package com.emotes.springbootdbemotessaved.repository;

import com.emotes.springbootdbemotessaved.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
