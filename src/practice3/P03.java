package practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//��̬����
public class P03 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();// ���嶯̬����
		// ��������Ԫ��
		list.add(10);
		list.add(1, 20);
		list.add(1, 30);// ��ָ��������λ�����Ԫ��

		// forѭ������(Ч���еȣ�
		for (int item : list) {
			System.out.print(item + " ");
		}
		System.out.println();

		// ����������(Ч�����)
		Iterator<Integer> it = list.iterator();// ��ȡ����list�ĵ�����
		while (it.hasNext()) {
			System.out.print(it.next() + " ");// ������������
		}
		System.out.println();

		// ����ֵ����(Ч�����)
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");// �����������
		}
		System.out.println();

		// ���򷽷�
		Collections.sort(list);

		// �޸�ĳ�����µ�ֵ
		list.set(2, 100);

		// ɾ��ָ��λ�ϵ�Ԫ��
		list.remove(2);

		// ɾ��ָ����Ԫ��
		list.remove((Object) 20);// ����������Ķ���Object���͵�����

		// �жϼ����Ƿ����ĳ��Ԫ��
		System.out.println("�ж�list�Ƿ����20" + list.contains(20));

		// ��ռ���
		list.clear();

		// �жϼ����Ƿ�Ϊ��
		System.out.println("�жϼ����Ƿ�Ϊ��" + list.isEmpty());
		
		//ת��Ϊ����(���ã�
		Integer[] arr=list.toArray(new Integer[0]);
		for(Integer item:arr)
		{
			System.out.print(item+" ");
		}
		System.out.println();
		
		//ת��Ϊ����(�������)
		Integer[] arr1=new Integer[list.size()];
//		arr1=list.toArray();object����������ת��
		list.toArray(arr1);
		for(Integer item:arr1)
		{
			System.out.print(item+" ");
		}
	}
}
