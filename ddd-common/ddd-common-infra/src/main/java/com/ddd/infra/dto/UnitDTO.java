package com.ddd.infra.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 单位数据
 *
 * @author louzai
 * @since 2021/11/20
 */
@Data
@NoArgsConstructor
public class UnitDTO {
    /**
     * 单位id
     */
    private Long unitId;

    /**
     * 单位名称
     */
    private String unitName;
}
