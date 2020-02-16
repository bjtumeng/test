package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2020/2/16 10:48
 */
//1、定义一个包含通知实现机制的“充血”的枚举类型
enum NOTIFY_TYPE {
    email("邮件",NotifyMechanismInterface.byEmail()),
    sms("短信",NotifyMechanismInterface.bySms()),
    wechat("微信",NotifyMechanismInterface.byWechat());
    String memo;
    NotifyMechanismInterface notifyMechanism;
    //2、私有构造函数，用于初始化枚举值
    private NOTIFY_TYPE(String memo,NotifyMechanismInterface notifyMechanism){
        this.memo=memo;
        this.notifyMechanism=notifyMechanism;
    }

    public String getMemo() {
        return memo;
    }

    public NotifyMechanismInterface getNotifyMechanism() {
        return notifyMechanism;
    }
}
//3、定义通知机制的接口或抽象父类
interface  NotifyMechanismInterface{
    String abc="1234";
    boolean doNotify(String msg);
    //3.1 返回一个定义了邮件通知机制的策的实现——一个匿名内部类实例
     static NotifyMechanismInterface byEmail(){
        return new NotifyMechanismInterface(){
            @Override
            public boolean doNotify(String msg){
                System.out.println("邮件通知"+msg);
                String abc = NotifyMechanismInterface.abc;
                abc="2314";
                System.out.println(abc);
                return true;
            }
        };
    }
    //3.2 定义短信通知机制的实现策略
    public static NotifyMechanismInterface bySms(){
        return new NotifyMechanismInterface(){
            @Override
            public boolean doNotify(String msg){
                System.out.println("短信通知"+msg);
                String abc = NotifyMechanismInterface.abc;
                System.out.println(abc);
                return true;
            }
        };
    }
    //3.3 定义微信通知机制的实现策略
    public static NotifyMechanismInterface byWechat(){
        return new NotifyMechanismInterface(){
            @Override
            public boolean doNotify(String msg){
                System.out.println("微信通知"+msg);
                return true;
            }
        };
    }
}
