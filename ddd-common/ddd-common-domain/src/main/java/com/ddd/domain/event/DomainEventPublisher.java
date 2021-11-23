package com.ddd.domain.event;

/**
 * 领域事件发布接口
 *
 * @author louzai
 * @since 2021/11/22
 */
public interface DomainEventPublisher {
    /**
     * 发布事件
     *
     * @param event 领域事件
     */
    void publishEvent(BaseDomainEvent event);
}
