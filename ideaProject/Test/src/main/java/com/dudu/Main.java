package com.dudu;

import java.util.Scanner;

/**
 * @author zhaomeng
 * @Description:
 * @date 2019/3/6 22:58
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            int length = line.length();
            int[] array=new int[128];
            for (int i=0;i<length;i++){
                array[line.charAt(i)]++;
            }
            for (int i=0;i<length;i++){
                if (array[line.charAt(i)]==1){

                }
            }
        }
    }
}
