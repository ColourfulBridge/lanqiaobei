package basic;

import java.util.Scanner;

/**
 * ��������
�����Ӽ�������һ��������8λ������ʮ���������ַ���������ת��Ϊ����ʮ�������������
����ע��ʮ���������е�10~15�ֱ��ô�д��Ӣ����ĸA��B��C��D��E��F��ʾ��
 * @author ����
 *
 */
public class Basic11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(Long.valueOf(str, 16));//�����һ����,99999999��λ��ʱ���Ѿ�����Integer�����Χ�˻�Long����
		//���������ʱ��ע��ȡֵ�����Χ
	}
}
