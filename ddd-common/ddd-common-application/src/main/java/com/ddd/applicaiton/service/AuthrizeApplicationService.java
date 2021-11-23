package com.ddd.applicaiton.service;

import com.ddd.applicaiton.dto.UserRoleDTO;

public interface AuthrizeApplicationService {
    /**
     * 新建用户授权
     *
     * @param userRole
     */
    void createUserAuthorize(UserRoleDTO userRole);

    /**
     * 查询用户授权
     *
     * @param userId
     */
    UserRoleDTO queryUserAuthorize(Long userId);

    /**
     * 修改用户授权
     *
     * @param userRole
     */
    void updateUserAuthorize(UserRoleDTO userRole);

    /**
     * 删除用户授权
     *
     * @param userId
     */
    void deleteUserAuthorize(Long userId);
}
