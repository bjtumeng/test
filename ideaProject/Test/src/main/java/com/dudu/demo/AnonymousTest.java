package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/25 22:44
 */
public class AnonymousTest {
    public void test(Product p){
        System.out.println("购买一个"+p.getName()+",花掉了"+p.getPrice());
    }

    public static void main(String[] args) {
        AnonymousTest test =new AnonymousTest();
        test.test(new Product() {
            @Override
            public double getPrice() {
                return 23;
            }

            @Override
            public String getName() {
                return "张三";
            }
        });
    }
}
