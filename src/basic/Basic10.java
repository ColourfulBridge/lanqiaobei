package basic;

import java.util.Scanner;

/**
 * ��������
����ʮ�����������ڳ������ʱ����Ҫʹ�õ���һ�������ı�ʾ��ʽ������0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F��16�����ţ��ֱ��ʾʮ��������0��15��ʮ�����Ƶļ�����������16��1������ʮ������16��ʮ����������10����ʮ���Ƶ�17��ʮ����������11���Դ����ƣ�ʮ���Ƶ�30��ʮ����������1E��
��������һ���Ǹ�������������ʾ��ʮ�����Ƶ���ʽ��
�����ʽ
�����������һ���Ǹ�����a����ʾҪת��������0<=a<=2147483647
�����ʽ
����������������16���Ʊ�ʾ
 * @author ����
 *
 */
public class Basic10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Integer.toHexString(n).toUpperCase());//ֱ��ʹ��Integer�µķ���ת�������ҿ�ֱ��ʹ��toUpperCase()���ַ������д�дת��
	}
}