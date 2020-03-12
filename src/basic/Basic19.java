package basic;

import java.util.Scanner;

/**
 * 问题描述
 * 回文串，是一种特殊的字符串，它从左往右读和从右往左读是一样的。小龙龙认为回文串才是完美的。现在给你一个串，它不一定是回文的，请你计算最少的交换次数使得该串变成一个完美的回文串。
 * 交换的定义是：交换两个相邻的字符 例如mamad 第一次交换 ad : mamda 第二次交换 md : madma 第三次交换 ma : madam
 * (回文！完美！)
 *  输入格式 第一行是一个整数N，表示接下来的字符串的长度(N <= 8000) 第二行是一个字符串，长度为N.只包含小写字母 输出格式
 * 如果可能，输出最少的交换次数。 否则输出Impossible 样例输入 5 mamad 样例输出 3
 *
 */
public class Basic19 {
	public static void main(String[] args) {
		//首先明确相邻交换==左右移动
		//输入
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		
		//先剔除Impossible的情况
		//个数为奇数的项>=2的情况
		int[] arr=new int[26];//26个小写字母的个数
		for(int i=0;i<n;i++)
		{
			arr[str.charAt(i)-'a']++;
		}
		//查看是否有超过一个奇数个数项
		int count=0;
		for(int i=0;i<26;i++)
		{
			if(arr[i]%2!=0)
				count++;
		}
		//如果直接Impossible
		if(count>1)
		{
			System.out.println("Impossible");
		}
		else {
			System.out.println(getCount(str));
		}
	}
	
	public static int getCount(String str)
	{
		//排除了多个奇数个的情况
		if(str.length()==1||str.length()==0)
			return 0;
		
		//每次对开头的字符匹配移动。把从右边数第一个的这个字符移动到末尾是当下最好的方法。
		char ch=str.charAt(0);
		//首先对奇数情况特殊处理
		StringBuffer sb=new StringBuffer(str);
		int lastindex=str.lastIndexOf(ch);
		if(lastindex==0)//也就是开头字符只有一个
		{
			//如果遇到单个字符的，这样是最少的：比如smmnn->smnnm->mnsnm
			int count=sb.length()/2;
			sb.deleteCharAt(0);
			return count+getCount(sb.toString());
		}
		else {
			//相当于把该字符移动到最末尾
			int count=str.length()-1-lastindex;
			sb.deleteCharAt(lastindex);
			sb.deleteCharAt(0);
			return count+getCount(sb.toString());
		}
	}
}
