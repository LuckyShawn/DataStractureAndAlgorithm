package com.shawn.datastracture.btree;
/**
 * �������ӿ�
 * �����в�ͬ��ʵ���࣬ÿ�������ʹ�ò�ͬ�Ĵ洢�ṹ������˳��ṹ����ʽ�ṹ
 * @author Administrator
 *
 */
public interface BinaryTree {
	/**
	 * �Ƿ����
	 * @return
	 */
	public boolean isEmpty();
	/**
	 * ���������
	 * @return
	 */
	public int size();

	/**
	 * ��ȡ�������ĸ߶�
	 * @return
	 */
	public int getHeight();
	/**
	 * ��ѯָ��ֵ�Ľ��
	 * @param value
	 * @return
	 */
	public Node findKey(int value); // ����
	/**
	 * ǰ��ݹ����
	 */
	public void preOrderTraverse();
	/**
	 * ��������ݹ����
	 */
	public void inOrderTraverse();
	/**
	 * ��������ݹ����
	 */
	public  void postOrderTraverse();
	/**
	 * ��������ݹ����
	 * @param node  �������
	 */
	public  void postOrderTraverse(Node node);
	/**
	 * ��������ǵݹ����
	 * 1����������ڵ�current�����ýڵ㲻Ϊ���򽫸ýڵ�ѹջ�������������ڵ���Ϊcurrent���ظ��˲�����ֱ��currentΪ�ա�
	 * 2����������Ϊ�գ�ջ���ڵ��ջ�����ʽڵ�󽫸ýڵ����������Ϊcurrent
	 * 3) �ظ�1��2��������ֱ��currentΪ����ջ�ڽڵ�Ϊ�ա�
	 */
	public void inOrderByStack();
	/**
	 *   ǰ������ǵݹ����
	 *   1����������ڵ�current�����ýڵ㲻Ϊ������ʸýڵ���ٽ��ڵ�ѹջ�������������ڵ���Ϊcurrent���ظ��˲�����ֱ��currentΪ�ա�
	 *   2����������Ϊ�գ�ջ���ڵ��ջ�����ýڵ����������Ϊcurrent
	 *   3) �ظ�1��2��������ֱ��currentΪ����ջ�ڽڵ�Ϊ�ա�
	 */
	public  void preOrderByStack();
	/**
	 * ��������ǵݹ����
	 * 1����������ڵ�current�����ýڵ㲻Ϊ������ʸýڵ���ٽ��ڵ�ѹջ�������������ڵ���Ϊcurrent���ظ��˲�����ֱ��currentΪ�ա�
	 * 2����������Ϊ�գ�ȡջ���ڵ�������������������Ϊ�ջ��������շ��ʹ�������ʸýڵ㣬����preNode��Ϊ�ýڵ�
	 * 3) �ظ�1��2��������ֱ��currentΪ����ջ�ڽڵ�Ϊ�ա�
	 */
	public  void postOrderByStack();

	/**
	 * ���ղ�α���������
	 */
	public void levelOrderByStack();
}


