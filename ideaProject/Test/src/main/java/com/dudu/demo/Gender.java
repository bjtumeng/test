package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:枚举类
 * @date 2018/11/25 11:03
 */
public enum Gender {
  MALE("男"),FEMALE("女");
  private final String name;

    private Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
