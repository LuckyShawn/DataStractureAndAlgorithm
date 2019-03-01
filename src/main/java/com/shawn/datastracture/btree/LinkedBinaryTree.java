package com.shawn.datastracture.btree;


/**
 * @Description TODO
 * @Author shawn
 * @create 2019/3/1 0001
 */
public class LinkedBinaryTree implements BinaryTree {

    private Node root;  //根节点

    public LinkedBinaryTree(Node root) {
        this.root = root;
    }

    public LinkedBinaryTree() {
        this.root = root;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public int size() {
        int num = this.size(root);
        System.out.println("节点的个数是:"+num);
        return num;
    }
    public int size(Node root) {
        if(root == null){
            return 0;
        }else{
            //获取左子树size
            int nl = this.size(root.leftChild);
            //获取右子树size
            int nr = this.size(root.rightChild);
            //左子树size+右子树size+根size
            return nl+nr+1;
        }
    }

    @Override
    public int getHeight() {
        return getHeight(root);
    }

    private int getHeight(Node root) {
        if(root == null){
            return 0;
        }else{
            int nl = this.getHeight(root.leftChild);
            int nr = this.getHeight(root.rightChild);
            return nl > nr ? nl+1 : nr+1;
        }
    }

    @Override
    public Node findKey(int value) {
        return null;
    }

    @Override
    public void preOrderTraverse() {
        //输出根节点的值
        if (root != null) {
            System.out.print(root.value + "  ");
            //对左子树进行先序遍历
            //构建二叉树，根的左子树作为根
            BinaryTree leftChild = new LinkedBinaryTree(root.leftChild);
            leftChild.preOrderTraverse();

            //对右子树进行先序遍历
            //构建二叉树，根的右子树作为根
            BinaryTree rightChild = new LinkedBinaryTree(root.rightChild);
            rightChild.preOrderTraverse();
        }


    }

    @Override
    public void inOrderTraverse() {
        System.out.println("中序遍历");
        this.inOrderTraverse(root);
        System.out.println();
    }

    private void inOrderTraverse(Node root) {
        if(root != null) {
            //遍历左子树
            this.inOrderTraverse(root.leftChild);
            //输出根的值
            System.out.print(root.value+"  ");
            //遍历右子树
            this.inOrderTraverse(root.rightChild);
        }
    }

    @Override
    public void postOrderTraverse() {
        System.out.println("后序遍历");
        this.postOrderTraverse(root);
        System.out.println();
    }

    @Override
    public void postOrderTraverse(Node node) {
        if(node != null) {
            //遍历左子树
            this.postOrderTraverse(node.leftChild);
            //遍历右子树
            this.postOrderTraverse(node.rightChild);
            //输出根的值
            System.out.print(node.value+"  ");
        }
    }

    @Override
    public void inOrderByStack() {

    }

    @Override
    public void preOrderByStack() {

    }

    @Override
    public void postOrderByStack() {

    }

    @Override
    public void levelOrderByStack() {

    }
}
