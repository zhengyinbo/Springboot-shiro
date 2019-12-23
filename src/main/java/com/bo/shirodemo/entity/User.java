package com.bo.shirodemo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * @Author bo
 * @DATE 2019/12/23
 **/

@Entity
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long userId;

    private String userName;

    private String password;

    private Date createTime;

    private Date updateTime;

}
