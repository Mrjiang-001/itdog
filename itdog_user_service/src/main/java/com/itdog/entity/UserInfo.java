package com.itdog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Long id;

    /**
     * 用户昵称（微信名称）
     */
    private String userCname;

    /**
     * 用户手机号
     */
    private Long mobilePhone;

    /**
     * 用户年龄
     */
    private Integer age;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 用户个人介绍
     */
    private String userIntroduce;

    /**
     * 用户微信id
     */
    private String wechatId;

    /**
     * 支付宝id
     */
    private String alipayId;

    /**
     * 用户密码
     */
    private String userPwd;

    /**
     * 是否锁定
     */
    private int lock;

    /**
     * 是否有效
     */
    private int status;

    /**
     * 注册时间
     */
    private Date registerTime;

    /**
     * 修改密码时间
     */
    private Date modifyPwdTime;

}
