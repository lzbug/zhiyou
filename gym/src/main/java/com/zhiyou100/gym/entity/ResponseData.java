package com.zhiyou100.gym.entity;

public class ResponseData<T> {
    //封装数据
    private T data;
    //状态码
    private int code;
    //响应信息
    private String msg;

    public ResponseData(T data, int code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg; }
        //定义其他的经常使用的默认构造方法 }
}
