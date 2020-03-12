package basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * �������� ����һ��N�׾���A�����A��M���ݣ�M�ǷǸ������� ���磺 A = 1 2 3 4 A��2���� 7 10 15 22 �����ʽ
 * ��һ����һ��������N��M��1<=N<=30, 0<=M<=5������ʾ����A�Ľ�����Ҫ�������
 * ������N�У�ÿ��N������ֵ������10�ķǸ���������������A��ֵ �����ʽ �����N�У�ÿ��N����������ʾA��M��������Ӧ�ľ������ڵ���֮����һ���ո����
 * �������� 2 2 1 2 3 4 ������� 7 10 15 22
 *
 */
public class Basic17 {
	public static void main(String[] args) {
		// ����ĳ˷���������ߵ�i��*�ұߵ�j��֮�͵���i��j�еĽ��
		Scanner sc = new Scanner(System.in);

		// ����
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();

		// һ����Ž����һ�������������
		int[][] arr_result = new int[n][n];
		int[][] arr_temp = new int[n][n];

		// �ر�أ���m=0ʱ��Ҫ���⴦��,�Խ���Ϊ1
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

		// ������ʼ��
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr_temp[i][j] = arr[i][j];
			}
		}

		// ����m-1�γ˷�
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

		// ���
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
