package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2019/1/15 23:09
 */
public class Solution1 {
    public boolean Find(int [][] array,int target) {
        int len = array.length-1;
        int i = 0;
        while((len >= 0)&& (i < array[0].length)){
            if(array[len][i] > target){
                len--;
            }else if(array[len][i] < target){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
}