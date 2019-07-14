package com.channelsoft.shiro.realms;

import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;

/**
 * @author zhaomeng
 * @Description:
 * @date 2019/7/7 21:32
 */
public class Shiro2Realm extends AuthenticatingRealm {
    @Override
    public String getName() {
        return null;
    }

//    @Override
//    public boolean supports(AuthenticationToken authenticationToken) {
//        return false;
//    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("222222222222222222");
        //1.把AuthenticationToken对象转换成UsernamePasswordToken
        UsernamePasswordToken token=(UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        if ("unknown".equals(username)){
            throw  new UnknownAccountException("用户不存在");
        }
        if ("monster".equals(username)){
            throw  new LockedAccountException("用户被锁定");
        }
        //principal:认证的实体信息，可以是String类型，也可以是实体类型
        Object principal=username;
        Object credntials="b53c6e155f9bf048fc8177a9eac955e2f82e09d8----";//数据库里的密码
        String realmName="Shiro2Realm";
        SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(principal,credntials,realmName);
        return simpleAuthenticationInfo;
    }

    public static void main(String[] args) {
           String algorithmName="SHA1";
           Object source="123";
           Object salt=null;
           int hashIterations=1024;
        SimpleHash simpleHash = new SimpleHash(algorithmName, source, salt, hashIterations);
        System.out.println(simpleHash);
    }
}
