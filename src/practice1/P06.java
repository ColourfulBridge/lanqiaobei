package practice1;
//字符串-5
public class P06 {
	public static void main(String[] args) {
		//字符串数组与字符串之间的转换
		String str="hahhaha";
		char[] chs= {'a','b','c','d','e','f'};
		//字符串-->字符数组
		char[] chs_str=str.toCharArray();
		for(char ch:chs)
		{
			System.out.print(ch+" ");
		}
		
		//字符数组-->字符串
		String str_chs=new String(chs);
		System.out.println("字符数组chs全部转化为字符串："+str_chs);
		String str_chs_1=new String(chs,2,4);//从下标2开始取4个字符转换
		System.out.println("字符数组chs部分转化为字符串："+str_chs_1);
		
		
		//字节数组与字符串的之间的转换
		//字符串-->字节数组
		byte[] bs=str.getBytes();
		for(byte b:bs)
		{
			System.out.print(b+" ");
		}
		System.out.println();
		
		//字节数组-->字符串
		String str_bs=new String(bs);
		String str_bs1=new String(bs,2,4);//从下标2开始取4个字节转换
		System.out.println("字节数组bs全部转化为字符串："+str_bs);
		System.out.println("字节数组bs部分转化为字符串："+str_bs1);
		
	}
}
