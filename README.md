# springBoot项目
## 基于shiro的角色权限管理


### 依赖

 <dependency>
  <groupId>org.apache.shiro</groupId>
   <artifactId>shiro-spring</artifactId>
   <version>1.4.0</version>
 </dependency>

### 数据库设计

| 数据表 | 说明 |
| --- | --- |
| user | 用户表 |
| role | 角色表 |
| permission | 权限表 |
| user_role | 用户-角色表 |
| role_permission | 角色-权限表 |

