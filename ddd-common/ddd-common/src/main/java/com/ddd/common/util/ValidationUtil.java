package com.ddd.common.util;

import com.ddd.common.exception.ValidationException;

/**
 * 校验工具类
 *
 * @author louzai
 * @since 2021/11/20
 */
public class ValidationUtil {

    public static void isTrue(boolean expect, String code, Object... params) {
        if (!expect) {
            throw ValidationException.of(code, params);
        }
    }

    public static void isFalse(boolean expect, String code, Object... params) {
        isTrue(!expect, code, params);
    }

}