package begin;

import java.util.Scanner;

public class Begin2 {
//	求1+2+3+...+n的值。
	public static void main(String[] args) {
		//题目可能意味着结果会很大，所以n最好是用long型
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		sc.close();
		System.out.println(n*(n+1)/2);
	}

}
