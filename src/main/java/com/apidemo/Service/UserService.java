package com.apidemo.Service;

import com.apidemo.Model.User;
import com.apidemo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository usersRepository;

    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }

}
