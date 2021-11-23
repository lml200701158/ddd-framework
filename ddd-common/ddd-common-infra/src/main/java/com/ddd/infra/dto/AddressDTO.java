package com.ddd.infra.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 地址数据
 *
 * @author louzai
 * @since 2021/11/20
 */
@Data
@NoArgsConstructor
public class AddressDTO {
    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String county;
}
