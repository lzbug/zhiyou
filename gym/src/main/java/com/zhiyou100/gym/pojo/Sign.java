package com.zhiyou100.gym.pojo;

import lombok.Data;
import lombok.ToString;

import java.sql.Timestamp;
@ToString
@Data
/**
 * 会员进场--入场记录
 */
public class Sign {
    private Integer signId;

    private Integer signNumber;

    private Timestamp signTime;

    private Integer signPerId;

    private String signRemarks;

    private Integer signStatus;
}