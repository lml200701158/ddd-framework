package com.ddd.infra.repository.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.ddd.infra.domain.AuthorizeDO;
import com.ddd.infra.repository.UserRepository;
import com.ddd.infra.repository.converter.UserConverter;
import com.ddd.infra.repository.mapper.RoleMapper;
import com.ddd.infra.repository.mapper.UserMapper;
import com.ddd.infra.repository.mapper.UserRoleMapper;
import com.ddd.infra.repository.mybatis.entity.RolePO;
import com.ddd.infra.repository.mybatis.entity.UserPO;
import com.ddd.infra.repository.mybatis.entity.UserRolePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 用户领域仓储
 *
 * @author louzai
 * @since 2021/11/21
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private UserMapper userMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private RoleMapper roleMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private UserConverter userConverter;

    @Override
    public void delete(Long userId) {
        userRoleMapper.delete(Wrappers.<UserRolePO>lambdaQuery()
                .eq(UserRolePO::getUserId, userId));
        userMapper.deleteById(userId);
    }

    @Override
    public AuthorizeDO query(Long userId) {
        UserPO user = userMapper.selectById(userId);
        if(Objects.isNull(user)){
            return null;
        }
        List<UserRolePO> userRoles = userRoleMapper.selectList(Wrappers.<UserRolePO>lambdaQuery()
                .eq(UserRolePO::getUserId, userId)
                .select(UserRolePO::getRoleId));
        List<Long> roleIds = CollectionUtils.isEmpty(userRoles)? new ArrayList<>() : userRoles.stream()
                .map(UserRolePO::getRoleId)
                .collect(Collectors.toList());
        List<RolePO> roles = roleMapper.selectBatchIds(roleIds);
        AuthorizeDO authorizeDO = userConverter.toAuthorizeDo(user, roles);
        return authorizeDO;

    }

    @Override
    public AuthorizeDO save(AuthorizeDO user) {
        UserPO userPo = userConverter.toUserPo(user);
        if(Objects.isNull(user.getUserId())){
            userMapper.insert(userPo);
            user.setUserId(userPo.getId());
        } else {
            userMapper.updateById(userPo);
            userRoleMapper.delete(Wrappers.<UserRolePO>lambdaQuery()
                    .eq(UserRolePO::getUserId, user.getUserId()));
        }
        List<UserRolePO> userRolePos = userConverter.toUserRolePo(user);
        userRolePos.forEach(userRoleMapper::insert);
        return this.query(user.getUserId());
    }
}
