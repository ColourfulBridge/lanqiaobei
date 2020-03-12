package basic;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 问题描述 给定n个十六进制正整数，输出它们对应的八进制数。
 * 
 * 输入格式 输入的第一行为一个正整数n （1<=n<=10）。
 * 接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。
 * 
 * 输出格式 输出n行，每行为输入对应的八进制正整数。
 * 
 * 【注意】 输入的十六进制数不会有前导0，比如012A。 输出的八进制数也不能有前导0。
 * 
 * 样例输入 2 39 123ABC
 * 
 * 样例输出 71 4435274
 * 
 * @author 张琦
 *
 */
public class Basic12 {
	public static void main(String[] args) {
		// map里面键和值都得是对象，不能是基本数据类型
		Map<String, String> mp = new HashMap<String, String>();// 十六进制转化map
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
		Map<String, String> mp1 = new HashMap<String, String>();// 八进制转化map
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
//		sc.nextLine();// 输入整型和字符串之间要接受一个换行符
		for (int j = 0; j < n; j++) {
			String haxStr = sc.next();
			StringBuffer eightsb = new StringBuffer();// 八进制字符串
			StringBuffer sb = new StringBuffer();
			String[] splitHaxStr = haxStr.split("");// 将每个字符划分成单个字符串
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
