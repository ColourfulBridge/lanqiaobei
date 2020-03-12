package basic;

import java.util.Scanner;


/*
 * ��������
����������ֳ�Pascal�����Σ����ĵ�i+1����(a+b)i��չ��ʽ��ϵ����
����
����һ����Ҫ�����ǣ��������е�ÿ�����ֵ����������ϵ�������ӡ�
����
�����������������ε�ǰ4�У�
����
   1
����
  1 1
����
 1 2 1
����
1 3 3 1
����
����n���������ǰn�С�
�����ʽ
�������һ����n��
�����ʽ
�����������ε�ǰn�С�ÿһ�д���һ�еĵ�һ������ʼ����������м�ʹ��һ���ո�ָ����벻Ҫ��ǰ���������Ŀո� 
��������
4 
�������
1
1 1
1 2 1
1 3 3 1 
���ݹ�ģ��Լ��
1 <= n <= 34�� 
 */
public class Basic6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][];
		for(int i=0;i<n;i++)
		{
			arr[i]=new int[i+1];
			arr[i][0]=arr[i][i]=1;
		}
		
		for(int i=2;i<n;i++)
		{
			for(int j=1;j<i;j++)
			{
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(j!=0)
					System.out.print(" ");
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
