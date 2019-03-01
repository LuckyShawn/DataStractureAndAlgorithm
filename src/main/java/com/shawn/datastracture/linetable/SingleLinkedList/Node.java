package com.shawn.datastracture.linetable.SingleLinkedList;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description 节点类
 * @Author shawn
 * @create 2019/3/1 0001
 */
@Data
@AllArgsConstructor
public class Node {
    Object data;
    Node next;

    public Node(Object data){

    }

    public Node(){

    }
}
