package basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * �������� ����һ������Ϊn�����У���������а���С�����˳�����С�1<=n<=200 �����ʽ ��һ��Ϊһ������n��
 * �ڶ��а���n��������Ϊ�����������ÿ�������ľ���ֵС��10000�� �����ʽ ���һ�У�����С�����˳��������������С� �������� 5 8 3 6 4
 * 9 ������� 3 4 6 8 9
 * 
 * @author ����
 *
 */
public class Basic13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			if (i != 0)
				System.out.print(" ");
			System.out.print(arr[i]);
		}
	}
}
