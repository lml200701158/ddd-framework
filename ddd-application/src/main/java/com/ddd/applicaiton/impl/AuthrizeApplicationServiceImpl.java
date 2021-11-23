package com.ddd.applicaiton.impl;

import com.ddd.applicaiton.converter.UserApplicationConverter;
import com.ddd.applicaiton.dto.UserRoleDTO;
import com.ddd.applicaiton.service.AuthrizeApplicationService;
import com.ddd.common.exception.ValidationException;
import com.ddd.common.util.ValidationUtil;
import com.ddd.domain.event.DomainEventPublisher;
import com.ddd.domain.event.UserCreateEvent;
import com.ddd.domain.event.UserDeleteEvent;
import com.ddd.domain.event.UserUpdateEvent;
import com.ddd.domain.service.AuthorizeDomainService;
import com.ddd.infra.domain.AuthorizeDO;
import com.ddd.infra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.Objects;

/**
 * 应用服务
 *
 * @author louzai
 * @since 2021/11/22
 */
@Service
public class AuthrizeApplicationServiceImpl implements AuthrizeApplicationService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthorizeDomainService authorizeDomainService;

    @Autowired
    DomainEventPublisher domainEventPublisher;

    @Autowired
    UserApplicationConverter userApplicationConverter;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void createUserAuthorize(UserRoleDTO userRoleDTO){
        // DTO转为DO
        AuthorizeDO authorizeDO = userApplicationConverter.toAuthorizeDo(userRoleDTO);
        // 关联单位单位信息
        authorizeDomainService.associatedUnit(authorizeDO);
        // 存储用户
        AuthorizeDO saveAuthorizeDO = userRepository.save(authorizeDO);
        // 发布用户新建的领域事件
        domainEventPublisher.publishEvent(new UserCreateEvent(saveAuthorizeDO));
    }

    @Override
    public UserRoleDTO queryUserAuthorize(Long userId) {
        // 查询用户授权领域数据
        AuthorizeDO authorizeDO = userRepository.query(userId);
        if (Objects.isNull(authorizeDO)) {
            throw ValidationException.of("UserId is not exist.", null);
        }
        // DO转DTO
        return userApplicationConverter.toAuthorizeDTO(authorizeDO);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateUserAuthorize(UserRoleDTO userRoleDTO) {
        // 先校验用户是否存在【应用服务仅允许此种判断，抛出错误情况，即为参数校验，不允许实际业务逻辑处理】
        ValidationUtil.isTrue(Objects.nonNull(userRepository.query(userRoleDTO.getUserId())), "UserId is not exist.");
        // DTO转为DO
        AuthorizeDO authorizeDO = userApplicationConverter.toAuthorizeDo(userRoleDTO);
        // 设置单位信息
        authorizeDomainService.associatedUnit(authorizeDO);
        // 存储用户
        AuthorizeDO saveAuthorizeDO = userRepository.save(authorizeDO);
        // 发布用户修改的领域事件
        domainEventPublisher.publishEvent(new UserUpdateEvent(saveAuthorizeDO));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteUserAuthorize(Long userId) {
        // 根据用户id删除用户聚合
        userRepository.delete(userId);
        // 发布用户删除领域事件
        domainEventPublisher.publishEvent(new UserDeleteEvent(userId));
    }
}
