package com.shawn.datastracture.linetable.SingleLinkedList;

/**
 * @Description 单链表实现
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
        Node p = head;
        for (int j = 0; j < i; j++) {
            p = p.next;
        }
        return p.getData();
    }

    @Override
    public boolean isEmpty() {
        return size==0;
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
        //判断i的范围，提高健壮性
        if(i<0 || i>size){
            throw new IndexOutOfBoundsException("索引越界异常："+i);
        }
        //定位到前一个节点
        Node p = head;
        for(int j = 0;j < i;j++){
            p = p.next;
        }
        //创建一个新节点
        Node  newNode = new Node(e);
        //添加操作  //指明前驱 后继
        newNode.next = p.next;  //新节点添加 后继
        newNode.data = e;   //新节点赋值
        p.next = newNode;   //新节点添加前驱
        size++;
    }

    @Override
    public void add(Object e) {
        this.add(size,e);
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


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        Node p = head.getNext();
        while(p!=null){
            //取出结点值
            Object data = p.getData();
            //加入StringBuffer
            builder.append(data+",");
            //后移一个结点
            p = p.getNext();
        }
        //删除最后的一个逗号
        if(builder.length()>1){
            builder.deleteCharAt(builder.length()-1);
        }
        builder.append("]");

        return builder.toString();
    }

}
