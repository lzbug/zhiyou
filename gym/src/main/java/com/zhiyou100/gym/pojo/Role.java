package com.zhiyou100.gym.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Role {
    private Integer id;
    private String name;
    private List<User> users;
    private List<Permission>permissions;
}
