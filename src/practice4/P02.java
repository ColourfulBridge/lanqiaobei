package practice4;
//进制转化
public class P02 {
	public static void main(String[] args) {
		//十进制转换到其它进制
		String str1=Integer.toHexString(100);//十进制转化为十六进制
		String str2=Integer.toOctalString(100);//十进制转化为八进制
		String str3=Integer.toBinaryString(100);//十进制转化为二进制
		String str4=Integer.toString(100, 7);//十进制转化成任意进制,转化的数+转化的进制
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		//其它进制转化为十进制
		int n1=Integer.valueOf("FFFF", 16);//十六进制转化为十进制
		int n2=Integer.valueOf("776", 8);//8进制转化为10进制
		int n3=Integer.valueOf("0101", 2);//2进制转化为十进制
		int n4=Integer.valueOf("101", 7);//7进制转化为十进制/任意进制转化为十进制
		
		//其它进制转化为其它进制
		//七进制到八进制
		String n=Integer.toString(Integer.valueOf("345", 7), 8);
	}
}
