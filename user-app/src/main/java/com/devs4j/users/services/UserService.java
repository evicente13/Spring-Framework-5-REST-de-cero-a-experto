package com.devs4j.users.services;

import com.devs4j.users.model.User;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private Faker faker;

    private List<User> users = new ArrayList<>();

    @PostConstruct
    public void init(){
        for(int i=0; i<100 ; i++){
            users.add(new User(faker.funnyName().name(), faker.name().username(), faker.dragonBall().character()));
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUserByname(String username){
        return users.stream().filter(u->u.getUsername().equals(username)).findAny()
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        String.format("USER %s NOT FOUND", username)));
    }
}
