package com.shawn.datastracture.btree;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description 树节点类
 * @Author shawn
 * @create 2019/3/1 0001
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Node {
    Object value;   //节点值
    Node leftChild; //左子树的引用
    Node rightChild;//右子树的引用
}
