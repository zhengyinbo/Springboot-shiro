package com.bo.shirodemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.bo.shirodemo.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author bo
 * @DATE 2019/12/23
 **/

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "login")
    public JSONObject Login(String userName, String password){
        Subject subject = SecurityUtils.getSubject(); //主体提交认证
        SecurityUtils.getSubject().getSession().setTimeout(-10001); //设置session失效时间
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
        subject.login(token); // 登录
        JSONObject jsonObject = new JSONObject();
        try {
            subject.login(token);
            //System.out.println(subject.getPrincipals());//获取用户名
            jsonObject.put("token", subject.getSession().getId());//返回登录状态 token
            return jsonObject;
        } catch (IncorrectCredentialsException e) {
            jsonObject.put("msg", "密码错误");
            return jsonObject;
        } catch (LockedAccountException e) {
            jsonObject.put("msg", "登录失败，该用户已被冻结，请联系上级管理员");
            return jsonObject;
        } catch (AuthenticationException e) {
            jsonObject.put("msg", "该用户不存在");
            return jsonObject;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
