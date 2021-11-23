package com.ddd.infra.repository.mybatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 用户表
 *
 * @author louzai
 * @since 2021/11/20
 */
@Data
@TableName(value = "t_user")
public class UserPO extends BaseUuidEntity {

    /**
     * 用户名
     * */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 真是姓名
     * */
    private String realName;

    /**
     * 手机号
     * */
    private String phone;

    /**
     * 密码
     * */
    private String password;

    /**
     * 单位id
     * */
    private Long unitId;

    /**
     * 单位名称
     * */
    private String unitName;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String county;
}
