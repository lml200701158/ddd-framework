package com.ddd.applicaiton.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 角色数据
 *
 * @author louzai
 * @since 2021/11/20
 */
@Data
@NoArgsConstructor
public class RoleInfoDTO {

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色code
     */
    private String code;
}
