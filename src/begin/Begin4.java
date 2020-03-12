package begin;
//Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
//当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
/*输入格式
输入包含一个整数n。
输出格式
输出一行，包含一个整数，表示Fn除以10007的余数。*/ 
//数据规模与约定
//1 <= n <= 1,000,000。
import java.util.Scanner;

public class Begin4 {
	public static void main(String[] args) {
		int[] f=new int[1000001];//已知最大规模时可以先测算出来
		f[1]=f[2]=1;
		for(int i=3;i<=1000000;i++)
		{
			f[i]=(f[i-1]+f[i-2])%10007;//加减乘运算不影响最终余数
		}
		Scanner sc=new Scanner(System.in);
		System.out.println(f[sc.nextInt()]);
		sc.close();
	}
	
}
