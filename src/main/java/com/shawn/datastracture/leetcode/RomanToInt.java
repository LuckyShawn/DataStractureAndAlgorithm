package com.shawn.datastracture.leetcode;

/**
 * @Description 罗马数字转换int
 * @Author shawn
 * @create 2019/3/18 0018
 */
public class RomanToInt {
    public static void main(String[] args){
        String a = "IV";
        int i = romanToInt(a);
        System.out.println(i);
    }
    public static int romanToInt(String s ){
        int n = s.length();
        int roman_int = 0;
        for(int i=0;i<n;i++)
        {
            switch(s.charAt(i))
            {
                case 'I' : roman_int = roman_int + 1;break;
                case 'V' : roman_int = roman_int + 5;break;
                case 'X' : roman_int = roman_int + 10;break;
                case 'L' : roman_int = roman_int + 50;break;
                case 'C' : roman_int = roman_int + 100;break;
                case 'D' : roman_int = roman_int + 500;break;
                case 'M' : roman_int = roman_int + 1000;break;
                default: System.out.println("default");break;
            }

            if(i!=0)
            {
                if(((s.charAt(i)=='V')||(s.charAt(i)=='X'))&&(s.charAt(i-1)=='I'))
                    roman_int = roman_int-1*2;
                if(((s.charAt(i)=='L')||(s.charAt(i)=='C'))&&(s.charAt(i-1)=='X'))
                    roman_int = roman_int-10*2;
                if(((s.charAt(i)=='D')||(s.charAt(i)=='M'))&&(s.charAt(i-1)=='C'))
                    roman_int = roman_int-100*2;
            }
        }
        return roman_int;
    }
}
