package basic;

import java.util.Scanner;

/**
 * ��Դ����
ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
��������
�����������[a,b]�������������������ֽ⡣
�����ʽ
����������������a��b��
�����ʽ
����ÿ�����һ�����ķֽ⣬����k=a1*a2*a3...(a1<=a2<=a3...��kҲ�Ǵ�С�����)(����ɿ�����)
��������
3 10
�������
3=3
4=2*2
5=5
6=2*3
7=7
8=2*2*2
9=3*3
10=2*5
��ʾ
������ɸ������������Ȼ���ٷֽ⡣
 * @author ����
 *
 */
public class Basic16 {
	static boolean[] map;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		map=new boolean[b+1];//��������ȥ���еķ�������ʣ�������������ı����϶���������
		for(int i=0;i<b+1;i++)
			map[i]=true;
		for(int i=2;i<b+1;i++)
		{
			if(map[i])
			{
				for(int j=2;j*i<b+1;j++)
				{
					map[j*i]=false;
				}
			}
		}
		
		//�����ֽ�
		for(int i=a;i<=b;i++)
		{
			System.out.print(i+"=");
			devide(i);
			System.out.println();
		}
	}
	
	//�ݹ�ֽ�
	public static void devide(int num)
	{
		if(map[num])
			System.out.print(num);
		else
			for(int i=2;i<num;i++)
			{
				if(num%i==0)//i��num������
				{
					devide(i);
					System.out.print("*");
					devide(num/i);
					break;
				}
			}
	}
}
