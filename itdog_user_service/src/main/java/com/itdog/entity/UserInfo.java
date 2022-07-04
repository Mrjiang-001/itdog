package com.itdog.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author mhqf
 * @description user_info
 * @date 2022-07-02
 */
@Data
@ApiModel("user_info")
public class UserInfo  implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    /**
     * 用户id
     */
    @ApiModelProperty("用户id")
    private Long id;

    /**
     * 用户昵称（微信名称）
     */
    @ApiModelProperty("用户昵称（微信名称）")
    private String userCname;

    /**
     * 用户手机号
     */
    @ApiModelProperty("用户手机号")
    private Long mobilePhone;

    /**
     * 用户年龄
     */
    @ApiModelProperty("用户年龄")
    private Integer age;

    /**
     * 身份证号
     */
    @ApiModelProperty("身份证号")
    private String idCard;

    /**
     * 用户个人介绍
     */
    @ApiModelProperty("用户个人介绍")
    private String userIntroduce;

    /**
     * 用户微信id
     */
    @ApiModelProperty("用户微信id")
    private String wechatId;

    /**
     * 支付宝id
     */
    @ApiModelProperty("支付宝id")
    private String alipayId;

    /**
     * 用户密码
     */
    @ApiModelProperty("用户密码")
    private String userPwd;

    /**
     * 是否锁定
     */
    @TableField(value = "is_lock",fill = FieldFill.INSERT)
    @ApiModelProperty("是否锁定")
    private Integer isLock;

    /**
     * 是否有效
     */
    @TableField(value = "status",fill = FieldFill.INSERT)
    @ApiModelProperty("是否有效")
    private Integer status;

    /**
     * 注册时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+08") //从数据库读出日期格式时，进行转换的规则
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//接受从前端传入的日期格式，映射到java类日期属性的规则
    @ApiModelProperty("注册时间")
    @TableField(value = "register_time",fill = FieldFill.INSERT)
    private Date registerTime;

    /**
     * 修改密码时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+08") //从数据库读出日期格式时，进行转换的规则
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//接受从前端传入的日期格式，映射到java类日期属性的规则
    @ApiModelProperty("修改密码时间")
    private Date modifyPwdTime;

}
