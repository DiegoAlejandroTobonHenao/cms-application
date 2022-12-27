package com.cms.domain.repository;

import com.cms.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
public interface UserRepository extends JpaRepository<User, String> {

}