package basic;

import java.util.Scanner;

/**
 * 资源限制
时间限制：1.0s   内存限制：512.0MB
问题描述
　　求出区间[a,b]中所有整数的质因数分解。
输入格式
　　输入两个整数a，b。
输出格式
　　每行输出一个数的分解，形如k=a1*a2*a3...(a1<=a2<=a3...，k也是从小到大的)(具体可看样例)
样例输入
3 10
样例输出
3=3
4=2*2
5=5
6=2*3
7=7
8=2*2*2
9=3*3
10=2*5
提示
　　先筛出所有素数，然后再分解。
 * @author 张琦
 *
 */
public class Basic16 {
	static boolean[] map;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		map=new boolean[b+1];//素数表，除去所有的非素数就剩下素数，素数的倍数肯定不是素数
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
		
		//遍历分解
		for(int i=a;i<=b;i++)
		{
			System.out.print(i+"=");
			devide(i);
			System.out.println();
		}
	}
	
	//递归分解
	public static void devide(int num)
	{
		if(map[num])
			System.out.print(num);
		else
			for(int i=2;i<num;i++)
			{
				if(num%i==0)//i是num的因子
				{
					devide(i);
					System.out.print("*");
					devide(num/i);
					break;
				}
			}
	}
}
