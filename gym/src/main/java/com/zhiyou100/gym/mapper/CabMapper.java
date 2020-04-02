package com.zhiyou100.gym.mapper;

import com.zhiyou100.gym.pojo.Cab;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface CabMapper {

    @Select("select * from cab")
    @Results({
            @Result(column="cab_id",property="cabId",id=true),
            @Result(column="cab_number",property="cabNumber"),
            @Result(column="cab_capacity",property="cabCapacity"),
            @Result(column="cab_status",property="cabStatus")})
    public List<Cab> queryAll(Map<String, Object> map);
}
