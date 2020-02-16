package com.dudu;

import java.util.regex.Pattern;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/12 21:32
 */
public class reg {
        public static void main(String args[]){
            String content = "I am noob " +
                    "from runoob.com.";
            String pattern = ".*runoob.*";
            boolean isMatch = Pattern.matches(pattern, content);
            System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
        }
}
