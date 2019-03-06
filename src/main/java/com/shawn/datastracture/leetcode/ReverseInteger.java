package com.shawn.datastracture.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description 整数反转
 * @Author shawn
 * @create 2019/3/6 0006
 */
public class ReverseInteger {
    public static void main(String[] args){
        System.out.println( reverse(55559999));
        reverse1(1234);
    }

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static int reverse1(int x) {
        int rev = 0;
        Queue queue = new LinkedList();
        while(x!=0 ){
            queue.offer(x%10);
            x = x/10;
        }
        while (queue.size()!=0){
            rev = rev * 10 + (int)queue.poll();
        }
        return rev;
    }
}
