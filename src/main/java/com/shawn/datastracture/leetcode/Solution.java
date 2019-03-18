package com.shawn.datastracture.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * @Author shawn
 * @create 2019/3/18 0018
 */
public class Solution {
    public static void main(String[] args){
        String a = "abcdefg";
        int i = lengthOfLongestSubstring(a);
        System.out.println(i);
        Set s = new HashSet();
        s.add(1);
        s.add(2);
        s.add(1);
        System.out.println(s);
        int max = Math.max(20, 10);
        System.out.println(max);
        char b = a.charAt(1);
        System.out.println(b);

    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

}
