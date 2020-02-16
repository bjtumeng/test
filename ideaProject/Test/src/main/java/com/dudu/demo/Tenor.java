package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2020/2/4 11:06
 */
class Singer{
    public String name ="singer";
    public static  String sing(){
        return "la";
    }
}
public class Tenor extends Singer{
    public String name="tenor";
    public static String sing(){      //static 编译时就确定了
        return "fa";
    }
    public static void main(String[] args){
        Tenor t =new Tenor();
        Singer s =new Tenor();
        System.out.println(t.name+":"+t.sing()+" "+s.name+":"+s.sing());
    }
}
