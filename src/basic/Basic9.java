package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



/*
 * 问题描述
　　123321是一个非常特殊的数，它从左边读和从右边读是一样的。
　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
输入格式
　　输入一行，包含一个正整数n。
输出格式
　　按****从小到大****的顺序输出满足条件的整数，每个整数占一行。
 */
public class Basic9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		ArrayList<Integer> list=new ArrayList<Integer>();//Java动态数组
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
