package com.example.work;

import java.util.List;

/**
 * 黑名单服务
 */
public interface BlackPhoneService {

    /**
     * 判断手机号是否在黑名单内
     * 支持判断网络虚拟号、固定号码等
     *
     * @param phone 手机号
     * @return 是否在黑名单内
     */
    boolean vailPhone(String phone);

    /**
     * 获取全量黑名单手机号
     *
     * @return 列表
     */
    List<String> getFullPhone();

}
