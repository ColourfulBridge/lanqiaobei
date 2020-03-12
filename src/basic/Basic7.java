package basic;

/*
 * 问题描述
　　153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
输出格式
　　按从小到大的顺序输出满足条件的三位十进制数，每个数占一行。
 */
public class Basic7 {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int j=0;j<10;j++)
			{
				if(Math.pow((double)i, 3.00)+Math.pow((double)j, 3.00)>999)
				{
					break;
				}
				for(int k=0;k<10;k++)
				{
					if(Math.pow((double)i, 3.00)+Math.pow((double)j, 3.00)+Math.pow((double)k, 3.00)>999)
					{
						break;
					}
					if(Math.pow((double)i, 3.00)+Math.pow((double)j, 3.00)+Math.pow((double)k, 3.00)==i*100+j*10+k)
					{
						System.out.println(i*100+j*10+k);
					}
				}
			}
		}
	}
}
