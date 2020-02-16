package com.dudu.demo;

import java.io.Serializable;

/**
 * @author zhaomeng
 * @Description:
 * @date 2020/2/4 22:18
 */
public class Student implements Serializable {
    private int age;
    private String name;
    private String sex;
    private String add;

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", add='" + add + '\'' +
                '}';
    }
}
