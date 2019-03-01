package com.shawn.datastracture.SingleLinkedList;

/**
 * @Description TODO
 * @Author shawn
 * @create 2019/3/1 0001
 */
public class SingleLinkedList implements MyList{

    public Node head = new Node();//只有一个头结点

    public int size;//默认长度是0，头结点不算



    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public void add(int i, Object e) {

    }

    @Override
    public void add(Object e) {

    }

    @Override
    public boolean addBefore(Object obj, Object e) {
        return false;
    }

    @Override
    public boolean addAfter(Object obj, Object e) {
        return false;
    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public Object replace(int i, Object e) {
        return null;
    }
}
