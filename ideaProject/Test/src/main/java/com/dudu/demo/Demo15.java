package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2020/2/16 10:52
 */
public class Demo15 {
    public static void main(String[] args) {
        String msg="success";
        NOTIFY_TYPE.valueOf("email").getNotifyMechanism().doNotify(msg);
        NOTIFY_TYPE.valueOf("sms").getNotifyMechanism().doNotify(msg);
    }
}
