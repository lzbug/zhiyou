package com.zhiyou100.gym.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.List;
@Data
@ToString
public class User {
    private Integer id ;
    private String account;
    private String password;
    private List<Role> roles;
    private List<Permission> permissions;
}
