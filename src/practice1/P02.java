package practice1;

//字符串-1
public class P02 {
	public static void main(String[] args) {
		// 创建字符串
		String str = "123453421";// 字面量
		String str1 = new String("1234567");// 字符串对象

		// 字符串查找字串索引
//		int n=str.indexOf("34");
		int n = str1.indexOf("34");
		System.out.println("34在str中的下标:" + n);
		int lastn = str.lastIndexOf("34");
		System.out.println("34在str最后一个下标：" + lastn);
		//也可查找单个字符
		System.out.println("字符3在str中的下标："+str.indexOf('3'));
		System.out.println("从下标3开始找字符3:"+str.indexOf('3', 3));//第二个3在下标为5的位置

		// 获取指定索引位置的字符
		System.out.println("str中下标为2的字符：" + str.charAt(2));

		// 获取指定索引范围的子字符串
		System.out.println("下标在3-6的子串：" + str.substring(3, 6));
		System.out.println("截取从下标3开始的字串：" + str.substring(3));

		// 去除字符串的空格
		String str3 = "    hello world! ";
		System.out.println("去除空格前" + str3 + ",长度：" + str3.length());
		System.out.println("去除空格后" + str3.trim() + ",长度：" + str3.trim().length());
		// trim()，不改变str本身，而是返回了改变后的字符串副本

		// 字符串替换
		// replace不改变字符串本身，而是将替换后的字符副本返回,并且替换是将字符串中满足条件的全部替换，可使用正则表达式
		System.out.println("str替换字符3为字符0后：" + str.replace('3', '0'));
		// 可以用字符串替换字符串
		System.out.println("str替换字符串34为字符串00后：" + str.replace("34", "00"));
		System.out.println("str替换字符34为字符88后：" + str.replaceAll("34", "88"));
		// 两边的字符串可以不相等
		System.out.println("str替换字符3为字符0后：" + str.replace("34", "0"));
		System.out.println("str替换字符3为字符0后：" + str.replace("34", "0"));
		//可以仅替换符合条件的第一个元素
		System.out.println("替换str的第一个34为000000:"+str.replaceFirst("34", "000000"));
		
	}

}
