package practice3;

import java.util.Arrays;

import com.sun.tools.javac.util.ArrayUtils;

//����2
public class P02 {
	public static void main(String[] args) {
		String[] arr= {"wang","zhao","zhu","lin","sun"};
		
		//����������Ƿ����һ��Ԫ��
		System.out.println("�鿴arr���Ƿ����zhu:"+Arrays.asList(arr).contains("zhu"));
		
		//���ܵ�ArrayUtils
		//������������
//		String[] str_all=ArrayUtils.addAll(arr,new String[] {"zhang","shen"});
		
		//���鷴ת
//		String[] arr_reverse=ArrayUtils.
		
		//���������Ƴ�ĳ��Ԫ��
		
		//java��ӡ����
		int[] arr2= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr2));//���Ժ�˳���Ĵ�ӡ
		double[] arr3= {2.34,4.56,7.89,5.78};
		System.out.println(Arrays.toString(arr3));
		//�ַ�������û��
		
		for(int n:arr2)
		{
			System.out.print(n+",");
		}
		System.out.println();
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+",");
		}
		System.out.println();
		
		System.out.println(Arrays.asList(arr2));//û��
		System.out.println(Arrays.asList(arr));//�ַ�����������
		
		//��λԪ��λ��
		System.out.println("�ҵ�arr��zhu��λ�ã�"+Arrays.binarySearch(arr, "zhu"));//����
		System.out.println("�ҵ�arr2��4��λ�ã�"+Arrays.binarySearch(arr2, 4));//����
		
		System.out.println("�ҵ�arr��zhu��λ�ã�"+Arrays.asList(arr).indexOf("zhu"));
		System.out.println("�ҵ�arr2��4��λ�ã�"+Arrays.asList(arr2).indexOf(4));//����List�����ַ���֮��Ķ�û����//��û��
	}
}
