package com.casestudy.moez.bhatti.repository;

import com.casestudy.moez.bhatti.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserByUserId(Integer userId);

}
