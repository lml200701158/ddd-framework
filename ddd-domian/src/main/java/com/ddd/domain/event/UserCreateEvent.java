package com.ddd.domain.event;

import com.ddd.infra.domain.AuthorizeDO;

/**
 * 用户新增领域事件
 *
 * @author louzai
 * @since 2021/11/20
 */
public class UserCreateEvent extends BaseDomainEvent<AuthorizeDO> {
    public UserCreateEvent(AuthorizeDO user) {
        super(user);
    }
}