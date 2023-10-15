package com.example.InstagramBasicDesign.repository;

import com.example.InstagramBasicDesign.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
