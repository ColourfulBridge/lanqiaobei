package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



/*
 * ��������
����123321��һ���ǳ����������������߶��ʹ��ұ߶���һ���ġ�
��������һ��������n�� �����������������λ����λʮ�������������λ����֮�͵���n ��
�����ʽ
��������һ�У�����һ��������n��
�����ʽ
������****��С����****��˳���������������������ÿ������ռһ�С�
 */
public class Basic9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		ArrayList<Integer> list=new ArrayList<Integer>();//Java��̬����
		for (int i = 1; i < 10; i++) {
			if (2 * i > n)
				break;
			for(int j=0;j<10;j++)
			{
				if(2*i+2*j>n)
					break;
				for(int k=0;k<10;k++)
				{
					if(2*i+2*j+k>n)
						break;
					else if(2*i+2*j+k==n)
					{
						list.add(i*10000+j*1000+k*100+j*10+i);
					}
					else if(2*i+2*j+2*k==n)
					{
						list.add(i*100000+j*10000+k*1000+k*100+j*10+i);
					}
				}
			}
		}
		Collections.sort(list);
		for(int item:list)
		{
			System.out.println(item);
		}
	}
	
}
