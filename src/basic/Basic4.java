package basic;

import java.util.Scanner;

/*
 * ��������
����n�������ҳ���n���������ֵ����Сֵ���͡�
�����ʽ
��һ��Ϊ����n����ʾ���ĸ�����
�ڶ�����n������Ϊ������n������ÿ�����ľ���ֵ��С��10000��
�����ʽ
������У�ÿ��һ����������һ�б�ʾ��Щ���е����ֵ���ڶ��б�ʾ��Щ���е���Сֵ�������б�ʾ��Щ���ĺ͡�
��������
5
1 3 -2 4 5
�������
5
-2
11
���ݹ�ģ��Լ��
1 <= n <= 10000��
 */
public class Basic4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int min = 10001, max = -10001, sum = 0;// ��ʼ��,max��С����С������min�Ŵ���������
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			if (temp < min) {//��1�����������ʱ�򶼻��滻max��min��ֵ������Ҫ�������������ж�
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
