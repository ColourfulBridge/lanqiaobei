package basic;

import java.util.Scanner;

/**
 * ��������
 * ���Ĵ�����һ��������ַ��������������Ҷ��ʹ����������һ���ġ�С������Ϊ���Ĵ����������ġ����ڸ���һ����������һ���ǻ��ĵģ�����������ٵĽ�������ʹ�øô����һ�������Ļ��Ĵ���
 * �����Ķ����ǣ������������ڵ��ַ� ����mamad ��һ�ν��� ad : mamda �ڶ��ν��� md : madma �����ν��� ma : madam
 * (���ģ�������)
 *  �����ʽ ��һ����һ������N����ʾ���������ַ����ĳ���(N <= 8000) �ڶ�����һ���ַ���������ΪN.ֻ����Сд��ĸ �����ʽ
 * ������ܣ�������ٵĽ��������� �������Impossible �������� 5 mamad ������� 3
 *
 */
public class Basic19 {
	public static void main(String[] args) {
		//������ȷ���ڽ���==�����ƶ�
		//����
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		
		//���޳�Impossible�����
		//����Ϊ��������>=2�����
		int[] arr=new int[26];//26��Сд��ĸ�ĸ���
		for(int i=0;i<n;i++)
		{
			arr[str.charAt(i)-'a']++;
		}
		//�鿴�Ƿ��г���һ������������
		int count=0;
		for(int i=0;i<26;i++)
		{
			if(arr[i]%2!=0)
				count++;
		}
		//���ֱ��Impossible
		if(count>1)
		{
			System.out.println("Impossible");
		}
		else {
			System.out.println(getCount(str));
		}
	}
	
	public static int getCount(String str)
	{
		//�ų��˶�������������
		if(str.length()==1||str.length()==0)
			return 0;
		
		//ÿ�ζԿ�ͷ���ַ�ƥ���ƶ����Ѵ��ұ�����һ��������ַ��ƶ���ĩβ�ǵ�����õķ�����
		char ch=str.charAt(0);
		//���ȶ�����������⴦��
		StringBuffer sb=new StringBuffer(str);
		int lastindex=str.lastIndexOf(ch);
		if(lastindex==0)//Ҳ���ǿ�ͷ�ַ�ֻ��һ��
		{
			//������������ַ��ģ����������ٵģ�����smmnn->smnnm->mnsnm
			int count=sb.length()/2;
			sb.deleteCharAt(0);
			return count+getCount(sb.toString());
		}
		else {
			//�൱�ڰѸ��ַ��ƶ�����ĩβ
			int count=str.length()-1-lastindex;
			sb.deleteCharAt(lastindex);
			sb.deleteCharAt(0);
			return count+getCount(sb.toString());
		}
	}
}
