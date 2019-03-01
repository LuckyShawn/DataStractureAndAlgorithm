package com.shawn.datastracture.SingleLinkedList;


/**
 * @Description TODO
 * @Author shawn
 * @create 2019/3/1 0001
 */
public class SingleLinkedListTest {
    public static void main(String[] args){
        MyList list = new SingleLinkedList();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);

        System.out.println(list);
    }
}
