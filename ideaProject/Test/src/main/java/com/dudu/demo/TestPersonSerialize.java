package com.dudu.demo;

import java.io.*;

/**
 * @author zhaomeng
 * @Description:
 * @date 2020/2/4 22:19
 */
public class TestPersonSerialize {
    public static void main(String[] args) throws Exception {
//        serializePerson();
        Student p = deserializePerson();
        System.out.println(p.getName()+";"+p.getAge());
    }
    private static void serializePerson() throws FileNotFoundException, IOException {
        Student person = new Student();
        person.setName("测试实例");
        person.setAge(25);
        person.setSex("male");
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
                new File("E:/person.txt")));
        oo.writeObject(person);
        System.out.println("序列化成功");
        oo.close();
    }
    private static Student deserializePerson() throws IOException, Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E:/person.txt")));
        Student person = (Student) ois.readObject();
        person.setAge(12);
        System.out.println(person);
        return person;
    }
}
