package com.shawn.datastracture.SingleLinkedList;

/**
 * @Description 线性表接口
 * @Author shawn
 * @create 2019/3/1 0001
 */
public interface MyList {
    // 返回线性表的大小，即数据元素的个数。
    int size();

    // 返回线性表中序号为 i 的数据元素
    Object get(int i);

    // 如果线性表为空返回 true，否则返回 false。
    boolean isEmpty();

    // 判断线性表是否包含数据元素 e
    boolean contains(Object e);

    // 返回数据元素 e 在线性表中的序号
    int indexOf(Object e);

    // 将数据元素 e 插入到线性表中 i 号位置
    void add(int i, Object e);

    // 将数据元素 e 插入到线性表末尾
    void add(Object e);

    // 将数据元素 e 插入到元素 obj 之前
    boolean addBefore(Object obj, Object e);

    // 将数据元素 e 插入到元素 obj 之后
    boolean addAfter(Object obj, Object e);

    // 删除线性表中序号为 i 的元素,并返回之
    Object remove(int i);

    // 删除线性表中第一个与 e 相同的元素
    boolean remove(Object e);

    // 替换线性表中序号为 i 的数据元素为 e，返回原数据元素
    Object replace(int i, Object e);
}
