package com.example.springsecurity.service;

import com.example.springsecurity.model.AppUser;
import org.springframework.stereotype.Service;


public interface IAppUserService {

    AppUser getUserByName(String name);
}
