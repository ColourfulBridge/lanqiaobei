package basic;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ��������
����һ������n�����������У�������a�������еĵ�һ�γ����ǵڼ�����
�����ʽ
��һ�а���һ������n��
�ڶ��а���n���Ǹ�������Ϊ���������У������е�ÿ������������10000��
�����а���һ������a��Ϊ�����ҵ�����
�����ʽ
���a�������г����ˣ��������һ�γ��ֵ�λ��(λ�ô�1��ʼ���)���������-1�� 
��������
6
1 9 4 8 3 9
9 
�������
2 
���ݹ�ģ��Լ��
1 <= n <= 1000��  
 */
public class Basic5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int element=sc.nextInt();
		sc.close();
//		System.out.println(Arrays.binarySearch(arr, element));//���������
		for(int i=0;i<n;i++)
		{
			if(arr[i]==element)
			{
				System.out.println(i+1);
				return;
			}
		}
		System.out.println(-1);
	}
}
