package practice1;

import java.io.BufferedInputStream;
import java.io.StringBufferInputStream;
import java.util.Scanner;

//输入输出
public class P01 {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		Scanner sc=new Scanner(new BufferedInputStream(System.in));//输入速度更快，大容量时适用
//		int n=sc.nextInt();
//		System.out.println("整数"+n);
//		double n1=sc.nextDouble();
//		System.out.println("浮点"+n1);
//		float n2=sc.nextFloat();
//		System.out.println("浮点"+n2);
//		String str=sc.next();//不接受空格
		String str=sc.nextLine();//遇到\n才停止读取。因此可以读空格
		
		System.out.println("字符串"+str);
		
		//输入一个之后，可以一直输入
		while(sc.hasNextLine())
		{
			System.out.println("输出："+sc.nextLine());
		}
		
		
	}

}
