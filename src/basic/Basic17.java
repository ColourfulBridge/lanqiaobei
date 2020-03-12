package basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 问题描述 给定一个N阶矩阵A，输出A的M次幂（M是非负整数） 例如： A = 1 2 3 4 A的2次幂 7 10 15 22 输入格式
 * 第一行是一个正整数N、M（1<=N<=30, 0<=M<=5），表示矩阵A的阶数和要求的幂数
 * 接下来N行，每行N个绝对值不超过10的非负整数，描述矩阵A的值 输出格式 输出共N行，每行N个整数，表示A的M次幂所对应的矩阵。相邻的数之间用一个空格隔开
 * 样例输入 2 2 1 2 3 4 样例输出 7 10 15 22
 *
 */
public class Basic17 {
	public static void main(String[] args) {
		// 矩阵的乘法规则是左边的i行*右边的j列之和等于i行j列的结果
		Scanner sc = new Scanner(System.in);

		// 输入
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();

		// 一个存放结果，一个用于做左矩阵
		int[][] arr_result = new int[n][n];
		int[][] arr_temp = new int[n][n];

		// 特别地，当m=0时，要特殊处理,对角线为1
		if (m == 0) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (j != 0)
						System.out.print(" ");
					if (i != j)
						System.out.print(arr_result[i][j]);
					else
						System.out.print(1);
				}
				System.out.println();
			}
			return;
		}

		// 左矩阵初始化
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr_temp[i][j] = arr[i][j];
			}
		}

		// 进行m-1次乘法
		while ((--m) != 0) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					int sum = 0;
					for (int k = 0; k < n; k++) {
						sum += arr_temp[i][k] * arr[k][j];
					}
					arr_result[i][j] = sum;
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr_temp[i][j] = arr_result[i][j];
				}
			}
		}

		// 输出
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j != 0)
					System.out.print(" ");
				System.out.print(arr_result[i][j]);
			}
			System.out.println();
		}
	}
}
