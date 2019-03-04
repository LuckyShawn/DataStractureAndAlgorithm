package com.shawn.datastracture.sort;

import java.util.Arrays;

/**
 * @Description TODO
 * @Author shawn
 * @create 2019/3/4 0004
 */
public class BubbleSort {
    public static void main(String[] args){
        int [] arr = {1,50,60,70,52,10,2,6,55};
        System.out.println(Arrays.toString(arr));
        //递归
        //sort1(arr);
        //非递归
        sort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort2(int [] arr){
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }


    /**
     * 使用递归冒泡排序
     * @param arr
     */
    public static void sort1(int [] arr){
        sort1(arr,arr.length-1);
    }

    private static void sort1(int [] arr,int j){
        //退出递归条件
        if(j <= 1){
            return ;
        }
        //排序交换操作
        for (int i = 0; i < j; i++) {

            if(arr[i]>arr[i+1]){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
        //递归调用
        sort1(arr,j-1);
    }
}
