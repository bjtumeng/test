package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/12/18 21:11
 */
public class MergeArrayAndOrder {
    public static void main(String[] args) {
        int[] array1 = new int[]{2, 8, 11, 24, 32, 34, 56, 62, 68, 77};
        int[] array2 = new int[]{3, 14, 22, 39, 55, 61, 69, 78};
        int[] array = MergeArray(array1, array2);
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i]+"  ");
        }
    }

    public static int[] MergeArray(int[] array1, int[] array2) {
        int [] array=new int[array1.length+array2.length];
        int m=0;
        int n=0;
        for (int i=0;i<array.length;i++){
            if (m==array1.length){
                array[i]=array2[n++];
            }else if (n==array2.length){
                array[i]=array1[m++];
            }else if (array1[m]<array2[n]){
                array[i]=array1[m++];
            }else if (array1[m]>array2[n]){
                array[i]=array2[n++];
            }
        }
        return array;
    }
}
