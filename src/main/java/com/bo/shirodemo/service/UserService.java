package com.bo.shirodemo.service;

import com.bo.shirodemo.entity.User;

/**
 * @Author bo
 * @DATE 2019/12/23
 **/


public interface UserService {

    User findByUserName(String userName);

}
