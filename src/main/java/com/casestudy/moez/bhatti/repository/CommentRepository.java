package com.casestudy.moez.bhatti.repository;


import com.casestudy.moez.bhatti.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

    Comment findCommentById(Integer commentId);

}
