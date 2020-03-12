package practice1;
//字符串-4
public class P05 {
public static void main(String[] args) {
	String str="123456";
	
	//获取字符串长度
	System.out.println("str的长度"+str.length());
	
	//两个字符串的合并
	String str1="123";
	String str2="456";
	System.out.println("合并字符串str1和str2:"+str1.concat(str2));
	System.out.println("str1:"+str1);//只是将合并后的副本返回，并未改变原来的字符串
	System.out.println("str2:"+str2);
	
	//判断字符串中是否包含某些字串
	System.out.println("判断str中是否包含34"+str.contains("34"));
	
	//复制字符串
	System.out.println("复制1遍str"+str.repeat(1));
	System.out.println("复制3遍str"+str.repeat(3));
	
	//把字符串转化成相应的数值
	//int型
	int n=Integer.parseInt(str);
	System.out.println("转化为int型:"+n);
	//long型
	long ln=Long.parseLong(str);
	System.out.println("转化为long型："+ln);
	//double型
	double d1=Double.parseDouble(str);
	System.out.println("转化为double型:"+d1);
	double d2=Double.valueOf(str);
	System.out.println("转化为double型:"+d2);
	
}
}
