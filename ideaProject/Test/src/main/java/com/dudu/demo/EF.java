package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2020/2/5 12:11
 */
class EF{
    private String name = "外部类";
//    public void run(){
//        System.out.println("外部类奔跑");
//    }
    /*使用内部类的属性和方法*/
    public void eat(){
        D d = new D();
//        System.out.println(d.value);
        d.say();
    }
     class D{
//        private String value = "DDD";
        public String name = "内部类";
        public void say(){
            String name="局部变量";
            System.out.println("1:"+name);
            System.out.println("2:"+this.name);
//            System.out.println("3:"+EF.this.name);
//            run();
        }
    }

    public static void main(String[] args) {
        EF ef=new EF();
        ef.eat();
    }
}
