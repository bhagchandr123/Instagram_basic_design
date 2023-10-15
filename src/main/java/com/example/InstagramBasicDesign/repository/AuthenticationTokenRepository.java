package com.example.InstagramBasicDesign.repository;

import com.example.InstagramBasicDesign.model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationTokenRepository extends JpaRepository<AuthenticationToken,Long> {
}
