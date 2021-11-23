package com.ddd.infra.repository.mybatis.entity;

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
@Builder
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "t_user_role", autoResultMap = true)
public class UserRolePO extends BaseUuidEntity {

    /** 用户id */
    private Long userId;

    /** 角色id */
    private Long roleId;
}
