package com.fxz.csvdemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 描述：
 *
 * @author Fang
 * @date 2021-03-16 16:37:15
 */
@TableName("employee")
@Data
public class Employee {

    private String id;
    private String name;
    private Integer age;
    private String department;
    private double salary;
    private String createBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private String updateBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

}
