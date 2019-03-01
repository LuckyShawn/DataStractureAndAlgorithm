package com.shawn.datastracture.linetable.SingleLinkedList;


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

        list.add(2,2);

        System.out.println(list.isEmpty());
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.toString());
    }
}
