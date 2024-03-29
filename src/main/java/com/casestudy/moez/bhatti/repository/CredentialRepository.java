package com.casestudy.moez.bhatti.repository;

import com.casestudy.moez.bhatti.models.Credential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialRepository extends JpaRepository<Credential, String> {

    Credential findByUsername(String username);

}
