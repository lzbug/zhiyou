package com.zhiyou100.gym.pojo;

import lombok.Data;
import lombok.ToString;

import java.security.Timestamp;
@ToString
@Data
/**
 * 潜客登记--潜客
 */
public class Sneak {
    private Integer sneakId;

    private Integer sneakNumber;

    private Integer sneakPhone;

    private String sneakSex;

    private Timestamp sneakStartTime;

    private String sneakRemarks;

    private String sneakOccupation;

    private String sneakHobby;

    private String sneakAddress;

    private Integer sneakStatus;
}