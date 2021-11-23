package com.ddd.domain.impl;

import com.ddd.domain.service.AuthorizeDomainService;
import com.ddd.infra.domain.AuthorizeDO;
import org.springframework.stereotype.Service;

@Service
public class AuthorizeDomainServiceImpl implements AuthorizeDomainService {
    @Override
    // 设置单位信息
    public void associatedUnit(AuthorizeDO authorizeDO) {
        String unitName = "武汉小米";// TODO: 通过第三方获取
        authorizeDO.getUnit().setUnitName(unitName);
    }
}
