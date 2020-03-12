package basic;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * �������� ����n��ʮ��������������������Ƕ�Ӧ�İ˽�������
 * 
 * �����ʽ ����ĵ�һ��Ϊһ��������n ��1<=n<=10����
 * ������n�У�ÿ��һ����0~9����д��ĸA~F��ɵ��ַ�������ʾҪת����ʮ��������������ÿ��ʮ�����������Ȳ�����100000��
 * 
 * �����ʽ ���n�У�ÿ��Ϊ�����Ӧ�İ˽�����������
 * 
 * ��ע�⡿ �����ʮ��������������ǰ��0������012A�� ����İ˽�����Ҳ������ǰ��0��
 * 
 * �������� 2 39 123ABC
 * 
 * ������� 71 4435274
 * 
 * @author ����
 *
 */
public class Basic12 {
	public static void main(String[] args) {
		// map�������ֵ�����Ƕ��󣬲����ǻ�����������
		Map<String, String> mp = new HashMap<String, String>();// ʮ������ת��map
		mp.put("0", "0000");
		mp.put("1", "0001");
		mp.put("2", "0010");
		mp.put("3", "0011");
		mp.put("4", "0100");
		mp.put("5", "0101");
		mp.put("6", "0110");
		mp.put("7", "0111");
		mp.put("8", "1000");
		mp.put("9", "1001");
		mp.put("A", "1010");
		mp.put("B", "1011");
		mp.put("C", "1100");
		mp.put("D", "1101");
		mp.put("E", "1110");
		mp.put("F", "1111");
		Map<String, String> mp1 = new HashMap<String, String>();// �˽���ת��map
		mp1.put("000", "0");
		mp1.put("001", "1");
		mp1.put("010", "2");
		mp1.put("011", "3");
		mp1.put("100", "4");
		mp1.put("101", "5");
		mp1.put("110", "6");
		mp1.put("111", "7");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		sc.nextLine();// �������ͺ��ַ���֮��Ҫ����һ�����з�
		for (int j = 0; j < n; j++) {
			String haxStr = sc.next();
			StringBuffer eightsb = new StringBuffer();// �˽����ַ���
			StringBuffer sb = new StringBuffer();
			String[] splitHaxStr = haxStr.split("");// ��ÿ���ַ����ֳɵ����ַ���
			for (String str : splitHaxStr) {
				eightsb.append(mp.get(str));
			}
			eightsb.insert(0, "0");
			eightsb.insert(1, "0");
			
			for (int i = eightsb.length() - 1; i >= 2; i -= 3) {
				String str = eightsb.substring(i-2, i+1);
				sb.append(mp1.get(str));
			}
			
			sb.reverse();
			while (sb.indexOf("0") == 0) {
				sb.deleteCharAt(0);
			}
			if (sb.length() == 0)
				System.out.println(0);
			else
				System.out.println(sb.toString());
		}
	}
}
