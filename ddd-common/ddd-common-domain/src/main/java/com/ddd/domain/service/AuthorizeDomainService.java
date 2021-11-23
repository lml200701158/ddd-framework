package com.ddd.domain.service;

import com.ddd.infra.domain.AuthorizeDO;

/**
 * 用户授权 领域能力
 *
 * @author louzai
 * @since 2021/11/21
 */
public interface AuthorizeDomainService {
    /**
     * 设置单位信息
     *
     * @param user
     */
    void associatedUnit(AuthorizeDO user);
}
