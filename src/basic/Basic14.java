package basic;

import java.awt.SecondaryLoop;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *��������
��������һ������Ϊ��λ��ʱ��t��Ҫ���á�<H>:<M>:<S>���ĸ�ʽ����ʾ���ʱ�䡣<H>��ʾʱ�䣬<M>��ʾ���ӣ���<S>��ʾ�룬���Ƕ���������û��ǰ���ġ�0�������磬��t=0����Ӧ����ǡ�0:0:0������t=3661���������1:1:1����
�����ʽ
��������ֻ��һ�У���һ������t��0<=t<=86399����
�����ʽ
�������ֻ��һ�У����ԡ�<H>:<M>:<S>���ĸ�ʽ����ʾ��ʱ�䣬���������š�
��������
0
�������
0:0:0
��������
5436
�������
1:30:36
 * @author ����
 *
 */
public class Basic14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int h=t/3600;
		int m=(t%3600)/60;
		int s=t%60;
		System.out.println(h+":"+m+":"+s);
	}
}
