package com.bo.shirodemo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 权限表
 * @Author bo
 * @DATE 2019/12/23
 **/

@Entity
@Data
public class Permission implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long permissionId;

    private String permissionName;

}
