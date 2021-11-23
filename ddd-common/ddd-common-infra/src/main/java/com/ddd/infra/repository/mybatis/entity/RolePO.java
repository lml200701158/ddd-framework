package com.ddd.infra.repository.mybatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

/**
 * 用户表
 *
 * @author louzai
 * @since 2021/11/20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "t_role", autoResultMap = true)
public class RolePO extends BaseUuidEntity {

    /** 角色名称 */
    private String name;

    /** 角色code */
    private String code;
}
