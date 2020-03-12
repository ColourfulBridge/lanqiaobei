package begin;

import java.util.Scanner;

public class Begin3 {
//	给定圆的半径r，求圆的面积。
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		sc.close();
		System.out.printf("%.7f",Math.PI*r*r);//输出有格式的，应该用同C一样的printf方法
	}
}
