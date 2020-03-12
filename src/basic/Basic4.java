package basic;

import java.util.Scanner;

/*
 * 问题描述
给出n个数，找出这n个数的最大值，最小值，和。
输入格式
第一行为整数n，表示数的个数。
第二行有n个数，为给定的n个数，每个数的绝对值都小于10000。
输出格式
输出三行，每行一个整数。第一行表示这些数中的最大值，第二行表示这些数中的最小值，第三行表示这些数的和。
样例输入
5
1 3 -2 4 5
样例输出
5
-2
11
数据规模与约定
1 <= n <= 10000。
 */
public class Basic4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int min = 10001, max = -10001, sum = 0;// 初始化,max放小于最小的数，min放大于最大的数
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			if (temp < min) {//第1个数输进来的时候都会替换max和min的值，所以要进行两次条件判断
				min = temp;
			}
			if (temp > max) {
				max = temp;
			}
			sum += temp;
		}
		sc.close();
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}
}
