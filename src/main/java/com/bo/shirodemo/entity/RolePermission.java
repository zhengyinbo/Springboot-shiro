package com.bo.shirodemo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 角色权限表
 * @Author bo
 * @DATE 2019/12/23
 **/

@Entity
@Data
public class RolePermission implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private Long roleId;

    private Long permissionId;

}
