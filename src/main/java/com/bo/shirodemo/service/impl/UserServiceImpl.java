package com.bo.shirodemo.service.impl;

import com.bo.shirodemo.entity.User;
import com.bo.shirodemo.repository.UserRepository;
import com.bo.shirodemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author bo
 * @DATE 2019/12/23
 **/

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findByUserName(String userName) {
        return repository.findByUserName(userName);
    }
}
