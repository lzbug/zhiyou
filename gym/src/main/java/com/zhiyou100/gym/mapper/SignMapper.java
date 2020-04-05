package com.zhiyou100.gym.mapper;

import com.zhiyou100.gym.pojo.Sign;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SignMapper {
    @Select("select * from sign")
    @Results({
            @Result(column="sign_id",property="signId",id=true),
            @Result(column="sign_number",property="signNumber"),
            @Result(column="sign_time",property="signTime"),
            @Result(column="sign_per_id",property="signPerId"),
            @Result(column="sign_remarks",property="signRemarks"),
            @Result(column="sign_status",property="signStatus")})
    public List<Sign> queryAll();

    @Insert("insert into sign values(null,#{sign_number},#{sign_time},#{sign_per_id},#{sign_remarks},#{sign_status})")
    public int add(Sign sign);
}
