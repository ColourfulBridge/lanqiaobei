package basic;

import java.util.Scanner;

/*��������
����һ����ݣ��ж���һ���ǲ������ꡣ
���������֮һ����ʱ����һ�������꣺
1. �����4�ı���������100�ı�����
2. �����400�ı�����
��������ݶ��������ꡣ
�����ʽ
�������һ������y����ʾ��ǰ����ݡ�
�����ʽ
���һ�У������������������꣬�����yes���������no�� 
˵����������ָ�������һ���ַ�����Ϊ��������籾���yes����no������Ҫ�ϸ��������и����Ĵ�Сд��д���Сд�����÷֡� 
1990 <= y <= 2050��*/
public class Basic1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		sc.close();
		if(year%4==0&&year%100!=0)
			System.out.println("yes");
		else if(year%400==0)
			System.out.println("yes");
		else {
			System.out.println("no");
		}
	}
}
