package com.ddd.applicaiton.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 用户&角色数据
 *
 * @author louzai
 * @since 2021/11/22
 */
@Data
@NoArgsConstructor
public class UserRoleDTO {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID列表
     */
    private List<RoleInfoDTO> roles;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 真是姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 单位id
     */
    private Long unitId;

    /**
     * 单位名称
     */
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
