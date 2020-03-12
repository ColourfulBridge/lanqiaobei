package basic;

import java.util.Scanner;

/**
 * 问题描述
　　从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
　　注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
 * @author 张琦
 *
 */
public class Basic11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(Long.valueOf(str, 16));//这边是一个坑,99999999八位的时候已经超出Integer的最大范围了换Long可以
		//今后在做题时需注意取值的最大范围
	}
}
