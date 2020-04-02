package com.zhiyou100.gym.pojo;

import lombok.Data;
import lombok.ToString;

import java.sql.Timestamp;
@ToString
@Data
/**
 * 租柜管理--租柜记录
 */
public class CabInfo {
    private Integer cabInfoId;

    private Integer cabInfoNumber;

    private Integer cabInfoPrice;

    private Integer cabInfoDuration;

    private Timestamp cabInfoCreateTime;

    private Timestamp cabInfoUpdateTime;

    private Integer cabInfoMember;

    private Integer cabInfoStatus;
}
