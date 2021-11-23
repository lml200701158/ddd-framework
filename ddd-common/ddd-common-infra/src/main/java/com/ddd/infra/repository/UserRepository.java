package com.ddd.infra.repository;

import com.ddd.infra.domain.AuthorizeDO;

/**
 * 用户领域仓储
 *
 * @author louzai
 * @since 2021/11/20
 */
public interface UserRepository {

    /**
     * 删除
     *
     * @param userId
     */
    void delete(Long userId);

    /**
     * 查询
     *
     * @param userId
     * @return
     */
    AuthorizeDO query(Long userId);

    /**
     * 保存
     *
     * @param user
     * @return
     */
    AuthorizeDO save(AuthorizeDO user);
}
