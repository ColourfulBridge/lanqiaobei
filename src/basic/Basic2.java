package basic;

/*问题描述
对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
00000
00001
00010
00011
00100
请按从小到大的顺序输出这32种01串。
输入格式
本试题没有输入。
输出格式
输出32行，按从小到大的顺序每行一个长度为5的01串。 
样例输出
00000
00001
00010
00011
<以下部分省略> */
public class Basic2 {
	public static void main(String[] args) {
		int[] a= {0,1};//另一种数组遍历方式
		
		for(int i:a)
			for(int j:a)
				for(int k:a)
					for(int l:a)
						for(int m:a)
						{
							System.out.printf("%d%d%d%d%d\n",i,j,k,l,m);//输出一组数，用printf
						}
	}
}
