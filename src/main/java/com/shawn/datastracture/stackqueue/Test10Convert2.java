package com.shawn.datastracture.stackqueue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Description 10进制转换2进制(普通转换，栈转换)
 * @Author shawn
 * @create 2019/3/1 0001
 */
public class Test10Convert2 {
    public static void main(String[] args){
        //获取二进制
        String str = convert(10);
        System.out.println(str);

        //利用栈获取二进制
        String str1 = convertLevelUp(13);
        System.out.println(str1);

    }


    /**
     * 利用栈实现二进制转换
     * @param num
     * @return
     */
    public static String convertLevelUp(int num){
        //被除数
        int t = num;
        Deque deque = new LinkedList();
        while (t>0){
            //被除数对2取模，获得余数，入栈
            int mod = t%2;
            deque.push(mod);

            //除以2得到的商继续短除
            t = t/2;
        }
        String str = "";
        while (!deque.isEmpty()){
            str = str+deque.pop();
        }
        System.out.println(num+"----->"+str);
        return str;

    }


    /**
     * 普通转换方法
     * @param num
     * @return
     */
    public static String convert(int num){
        int t = num;
        String str = "";
        do{
            //被除数取模,得到余数 作为二进制位数
            int mod = t % 2;
            //除以2得到的商作为被除数继续
            int result = t / 2;
            t = result;
            //System.out.println(mod);
            str = mod + str;  //1+""  0+"1" 1+"01"   1+"101"   =1101
        }while (t > 0);
        System.out.println(num+"----->"+str);
        return str;
    }
}
