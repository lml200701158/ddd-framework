package com.ddd.api.converter;

import com.ddd.api.model.req.AuthorizeCreateReq;
import com.ddd.api.model.req.AuthorizeUpdateReq;
import com.ddd.api.model.vo.UserAuthorizeVO;
import com.ddd.applicaiton.dto.UserRoleDTO;
import org.mapstruct.Mapper;

/**
 * UserVO转换器
 *
 * @author louzai
 * @since 2021/11/20
 */
@Mapper(componentModel = "spring")
public interface AuthorizeConverter {

    // 这里很奇怪，通过mapstruce转换失败，一直找不到原因，就直接先手动赋值吧
    default UserRoleDTO toDTO(AuthorizeCreateReq authorizeCreateReq) {
        UserRoleDTO userRoleDTO = new UserRoleDTO();
        userRoleDTO.setUserId(authorizeCreateReq.getUserId());
        userRoleDTO.setRoles(authorizeCreateReq.getRoles());
        userRoleDTO.setUserName(authorizeCreateReq.getUserName());
        userRoleDTO.setRealName(authorizeCreateReq.getRealName());
        userRoleDTO.setPhone(authorizeCreateReq.getPhone());
        userRoleDTO.setPassword(authorizeCreateReq.getPassword());
        userRoleDTO.setUnitId(authorizeCreateReq.getUnitId());
        userRoleDTO.setProvince(authorizeCreateReq.getProvince());
        userRoleDTO.setCity(authorizeCreateReq.getCity());
        userRoleDTO.setCounty(authorizeCreateReq.getCounty());
        return userRoleDTO;
    }

    // 这里很奇怪，通过mapstruce转换失败，一直找不到原因，就直接先手动赋值吧
    default UserRoleDTO toDTO(AuthorizeUpdateReq authorizeUpdateReq) {
        UserRoleDTO userRoleDTO = new UserRoleDTO();
        userRoleDTO.setUserId(authorizeUpdateReq.getUserId());
        userRoleDTO.setRoles(authorizeUpdateReq.getRoles());
        userRoleDTO.setUserName(authorizeUpdateReq.getUserName());
        userRoleDTO.setRealName(authorizeUpdateReq.getRealName());
        userRoleDTO.setPhone(authorizeUpdateReq.getPhone());
        userRoleDTO.setPassword(authorizeUpdateReq.getPassword());
        userRoleDTO.setUnitId(authorizeUpdateReq.getUnitId());
        userRoleDTO.setProvince(authorizeUpdateReq.getProvince());
        userRoleDTO.setCity(authorizeUpdateReq.getCity());
        userRoleDTO.setCounty(authorizeUpdateReq.getCounty());
        return userRoleDTO;
    }

    // 这里很奇怪，通过mapstruce转换失败，一直找不到原因，就直接先手动赋值吧
    default UserAuthorizeVO toVO(UserRoleDTO userRoleDTO) {
        UserAuthorizeVO userAuthorizeVO = new UserAuthorizeVO();
        userAuthorizeVO.setUserId(userRoleDTO.getUserId());
        userAuthorizeVO.setRoles(userRoleDTO.getRoles());
        userAuthorizeVO.setUserName(userRoleDTO.getUserName());
        userAuthorizeVO.setRealName(userRoleDTO.getRealName());
        userAuthorizeVO.setPhone(userRoleDTO.getPhone());
        userAuthorizeVO.setPassword(userRoleDTO.getPassword());
        userAuthorizeVO.setUnitId(userRoleDTO.getUnitId());
        userAuthorizeVO.setUnitName(userRoleDTO.getUnitName());
        userAuthorizeVO.setProvince(userRoleDTO.getProvince());
        userAuthorizeVO.setCity(userRoleDTO.getCity());
        userAuthorizeVO.setCounty(userRoleDTO.getCounty());
        return userAuthorizeVO;
    }
}
