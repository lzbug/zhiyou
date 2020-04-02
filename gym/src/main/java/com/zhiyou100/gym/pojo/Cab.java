package com.zhiyou100.gym.pojo;

import lombok.Data;
import lombok.ToString;

@ToString
@Data

/**
 * 租柜管理--租柜
 */
public class Cab {
    private Integer cabId;

    private Integer cabNumber;

    private Integer cabCapacity;

    private Integer cabStatus;
}
