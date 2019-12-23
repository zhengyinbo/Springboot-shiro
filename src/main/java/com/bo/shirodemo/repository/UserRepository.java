package com.bo.shirodemo.repository;

import com.bo.shirodemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author bo
 * @DATE 2019/12/23
 **/

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

}
