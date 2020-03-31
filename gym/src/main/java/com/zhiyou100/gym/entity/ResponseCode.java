package com.zhiyou100.gym.entity;

public enum ResponseCode {
    //列出常用的状态码和信息选项
    SUCCESS(2000,"成功"),
    ERROR_IN_SERVER(5000,"服务器出错"),
    USER_EXISTS(5001,"用户已存在"),
    NOT_LOGIN(4000,"未登录"),
    ERROR_LOGIN(4001,"用户名或密码错误");
    //状态码
   private final int code;
   //响应信息
   private final String msg;
   ResponseCode(int code, String msg) {
       this.code = code;
       this.msg = msg; }
    public int getCode() {
       return code;
   }
   public String getMsg() {
       return msg;
   }
}

