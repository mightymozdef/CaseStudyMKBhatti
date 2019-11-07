package com.casestudy.moez.bhatti.repository;

import com.casestudy.moez.bhatti.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUserId(Integer userId);

}
