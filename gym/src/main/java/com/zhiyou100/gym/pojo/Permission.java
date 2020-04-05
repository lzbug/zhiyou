package com.zhiyou100.gym.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Permission {
    private Integer id;
    private String name;
    private List<Role>roles;
}
