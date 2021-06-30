package com.example.springsecurity.repository;

import com.example.springsecurity.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<AppUser, Long> {
     AppUser findByName(String name);


}
