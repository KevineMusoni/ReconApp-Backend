package com.example.demo.repo;

import com.example.demo.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface CommentRepo extends JpaRepository<Comment, Long> {
    List<Comment> findAll();
}
