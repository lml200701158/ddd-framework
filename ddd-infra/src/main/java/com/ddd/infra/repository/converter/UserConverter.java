package com.ddd.infra.repository.converter;

import com.ddd.infra.domain.AuthorizeDO;
import com.ddd.infra.dto.AddressDTO;
import com.ddd.infra.dto.RoleDTO;
import com.ddd.infra.dto.UnitDTO;
import com.ddd.infra.repository.mybatis.entity.RolePO;
import com.ddd.infra.repository.mybatis.entity.UserPO;
import com.ddd.infra.repository.mybatis.entity.UserRolePO;
import org.mapstruct.Mapper;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * UserPo转换器
 *
 * @author louzai
 * @since 2021/11/20
 */
@Mapper(componentModel = "spring")
public interface UserConverter {

    default AuthorizeDO toAuthorizeDo(UserPO userPo, List<RolePO> roles) {
        AuthorizeDO authorizeDO = new AuthorizeDO();
        authorizeDO.setUserId(userPo.getId());
        authorizeDO.setUserName(userPo.getUserName());
        authorizeDO.setRealName(userPo.getRealName());
        authorizeDO.setPhone(userPo.getPhone());
        authorizeDO.setPassword(userPo.getPassword());

        UnitDTO unitDTO = new UnitDTO();
        unitDTO.setUnitId(userPo.getUnitId());
        unitDTO.setUnitName(userPo.getUnitName());

        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setCity(userPo.getCity());
        addressDTO.setCounty(userPo.getCounty());
        addressDTO.setProvince(userPo.getProvince());

        authorizeDO.setUnit(unitDTO);
        authorizeDO.setAddress(addressDTO);

        List<RoleDTO> roleDTOList = new ArrayList<>();
        roles.stream().forEach(e -> {
            RoleDTO roleDTO  = new RoleDTO();
            roleDTO.setRoleId(e.getId());
            roleDTO.setCode(e.getCode());
            roleDTO.setName(e.getName());
            roleDTOList.add(roleDTO);
        });
        authorizeDO.setRoles(roleDTOList);
        return authorizeDO;
    }

    default UserPO toUserPo(AuthorizeDO user){
        UserPO userPo = new UserPO();
        BeanUtils.copyProperties(user,userPo);
        userPo.setId(user.getUserId());
        userPo.setCity(user.getAddress().getCity());
        userPo.setCounty(user.getAddress().getCounty());
        userPo.setProvince(user.getAddress().getProvince());
        userPo.setUnitId(user.getUnit().getUnitId());
        userPo.setUnitName(user.getUnit().getUnitName());
        return userPo;
    }

    default List<UserRolePO> toUserRolePo(AuthorizeDO user){
        return user.getRoles().stream()
                .map(e-> new UserRolePO(user.getUserId(),e.getRoleId()))
                .collect(Collectors.toList());
    }
}
