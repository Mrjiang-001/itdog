package com.itdog.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @description: 所有新增时间、修改时间设置
 * @author: mhqf
 * @Date: 2022-07-02 19:28
 **/
public class AutoEntity {
    private static final long serialVersionUID = 1L;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value="创建时间，系统生成",name="createDate",required=false,hidden = true)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+08") //从数据库读出日期格式时，进行转换的规则
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//接受从前端传入的日期格式，映射到java类日期属性的规则
    public Date createDate;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value="创建人名称，系统生成",name="creatorName",required=false,hidden = true)
    public String creatorName;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value="创建人id，系统生成",name="creatorId",required=false,hidden = true)
    public String creatorId;

    @TableField(fill = FieldFill.UPDATE)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+08") //从数据库读出日期格式时，进行转换的规则
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//接受从前端传入的日期格式，映射到java类日期属性的规则
    @ApiModelProperty(value="变更时间，系统生成",name="modifyDate",required=false,hidden = true)
    public Date modifyDate;

    @TableField(fill = FieldFill.UPDATE)
    @ApiModelProperty(value="变更人名称，系统生成",name="modifyName",required=false,hidden = true)
    public String modifyName;

    @TableField(fill = FieldFill.UPDATE)
    @ApiModelProperty(value="变更人id，系统生成",name="modifyId",required=false,hidden = true)
    public String modifyId;
}
