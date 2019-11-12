package com.casestudy.moez.bhatti.repository;

import com.casestudy.moez.bhatti.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

    Post findPostById(Integer postId);

}
