package begin;

import java.util.Scanner;

public class Begin2 {
//	��1+2+3+...+n��ֵ��
	public static void main(String[] args) {
		//��Ŀ������ζ�Ž����ܴ�����n�������long��
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		sc.close();
		System.out.println(n*(n+1)/2);
	}

}
