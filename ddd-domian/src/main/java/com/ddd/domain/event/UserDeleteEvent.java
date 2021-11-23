package com.ddd.domain.event;

/**
 * 用户删除领域事件
 *
 * @author louzai
 * @since 2021/11/20
 */
public class UserDeleteEvent extends BaseDomainEvent<Long> {
    public UserDeleteEvent(Long userId) {
        super(userId);
    }
}
