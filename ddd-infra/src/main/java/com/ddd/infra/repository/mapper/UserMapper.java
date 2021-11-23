package com.ddd.infra.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ddd.infra.repository.mybatis.entity.UserPO;
import org.apache.ibatis.annotations.Mapper;

public interface UserMapper extends BaseMapper<UserPO> {
}
