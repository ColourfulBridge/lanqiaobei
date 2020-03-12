package practice1;
//字符串-2
public class P03 {
	public static void main(String[] args) {
		String str="abcdefghijklmn";
		
//		判断字符串的开头和结尾
		System.out.println("判断字符串是否以ab开头:"+str.startsWith("ab"));
		System.out.println("判断字符串是否以cb开头:"+str.startsWith("cd"));
		//设置从字符串的索引开头判断
		System.out.println("判断字符串是否从下标2开始以cb开头:"+str.startsWith("cd",2));
		//结尾是没有从索引下标开始的
		System.out.println("判断字符串是否开始以cb结尾:"+str.endsWith("mn"));
		
		//判断字符串是否相等
		String str1="abcdef";
		System.out.println("判断str和str1两个字符串是否相等:"+str.equals(str1));
		String str2="ABCDEF";
		System.out.println("判断str1和str2是否相等"+str1.equals(str2));
		System.out.println("判断str1和str2忽略大小写时是否相等"+str1.equalsIgnoreCase(str2));
		
		//按字典序比较两个字符串(大了>0，等于=0，小于<0)
		System.out.println("str和str1两个长度不同的比较："+str.compareTo(str1));
		System.out.println("str1和str2两个长度相同的比较："+str1.compareTo(str2));
		System.out.println("str1和str2两个长度相同忽略大小写的比较："+str1.compareToIgnoreCase(str2));
		
		//字母大小写转换
		System.out.println("str1转化为大写："+str1.toUpperCase());
		System.out.println("str1:"+str1);
		System.out.println("str2转化为小写："+str2.toLowerCase());
		System.out.println("str2:"+str2);
		
	}
}
