package com.shawn.datastracture.search;

/**
 * @Description 需要顺序结构，按照关键字有序
 * @Author shawn
 * @create 2019/3/4 0004
 */
public class TestBinarySearch {
    public static void main(String[] args){
        int [] array = {1,2,3,4,5,6,7,8,9,10};

        //要查找的值
        int key = 2;
        //查找
        //int index = binarySearch1(array,key);

        int index = binarySearch2(array,key);
        //输出
        if(index == -1){
            System.out.println("查找的数不存在");
        }else{
            System.out.println(key + "的索引是："+index);
        }
    }


    /**
     * 使用递归
     * @param array
     * @param key
     * @return
     */
    public static int binarySearch2(int[] array , int key){
        //指定low和high索引
        int low = 0;
        int high = array.length-1;
        return binarySearch2(array,key,low,high);
    }
    public static int binarySearch2(int[] array , int key,int low ,int high){
        //递归的结束条件
        if(low > high){ //不存在
            return -1;
        }
        //求mid
        int mid = (low + high)/2;
        //判断是否等于
        if( key == array[mid] ){
            return mid;
        }else if(key < array[mid]){
            return binarySearch2(array,key,low,mid-1);
        }else {
            return binarySearch2(array,key,low+1,high);
        }
    }

    /**
     * 不使用递归(节省空间)
     *  时间复杂度：T(n) = O(log2n)
     *  空间复杂度：S(n) = O(1)
     * @param array
     * @param key
     * @return
     */
    public static int binarySearch1(int[] array , int key){
        //指定low和high索引
        int low = 0;
        int high = array.length-1;

        while(low <= high){
            //求mid
            int mid = (low + high)/2;
            //判断是否等于
            if( key == array[mid] ){
                return mid;
            }else if(key < array[mid]){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
