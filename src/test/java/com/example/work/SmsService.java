package com.example.work;

/**
 * 发送信息模块
 */
public interface SmsService {

    /**
     * 发送短信
     *
     * @param phoneNumber 手机号
     * @param code 验证码
     * @return 是否成功
     */
    boolean sendSms(String phoneNumber, String code);

}
