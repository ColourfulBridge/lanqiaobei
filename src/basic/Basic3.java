package basic;

import java.util.Scanner;

/*��������
������ĸ�������һЩ������ͼ�Σ����������һ�����ӣ�
ABCDEFG
BABCDEF
CBABCDE
DCBABCD
EDCBABC
����һ��5��7�е�ͼ�Σ����ҳ����ͼ�εĹ��ɣ������һ��n��m�е�ͼ�Ρ�
�����ʽ
����һ�У�������������n��m���ֱ��ʾ��Ҫ�����ͼ�ε�������������
�����ʽ
���n�У�ÿ��m���ַ���Ϊ���ͼ�Ρ�
���ݹ�ģ��Լ��
1 <= n, m <= 26��
*/
public class Basic3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		sc.close();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print((char)('A'+Math.abs(i-j)));//�����������ҳ�����
			}
			System.out.println();
		}
	}

}
