package com.ddd.infra.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
* 对数据库的mapper加载
 *
 * @author louzai
 * @since 2021/11/20
*/
@Configuration
@ComponentScan
@MapperScan(value = "com.ddd.infra.repository.mapper")
public class InfraCoreConfig {
}
