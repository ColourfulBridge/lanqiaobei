package basic;

import java.util.Scanner;

/**
��������
���������������ɴ�д��ĸ��Сд��ĸ��ɵ��ַ���(���Ƚ���1��10֮��)������֮��Ĺ�ϵ������4�����֮һ��
����1�������ַ������Ȳ��ȡ����� Beijing �� Hebei
����2�������ַ�������������ȣ�������Ӧλ���ϵ��ַ���ȫһ��(���ִ�Сд)������ Beijing �� Beijing
����3�������ַ���������ȣ���Ӧλ���ϵ��ַ����ڲ����ִ�Сд��ǰ���²��ܴﵽ��ȫһ�£�Ҳ����˵���������������2�������� beijing �� BEIjing
����4�������ַ���������ȣ����Ǽ�ʹ�ǲ����ִ�СдҲ����ʹ�������ַ���һ�¡����� Beijing �� Nanjing
��������ж�����������ַ���֮��Ĺ�ϵ�����������е���һ�࣬������������ı�š�
�����ʽ
�����������У�ÿ�ж���һ���ַ���
�����ʽ
��������һ�����֣������������ַ����Ĺ�ϵ���
��������
BEIjing
beiJing 
 * @author ����
 *
 */
public class Basic15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		if(str1.length()==str2.length())
		{
			if(str1.equals(str2))
			{
				System.out.println(2);
			}else if(str1.equalsIgnoreCase(str2))
			{
				System.out.println(3);
			}else {
				System.out.println(4);
			}
		}else {
			System.out.println(1);
		}
	}
}
