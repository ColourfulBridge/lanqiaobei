package begin;
//Fibonacci���еĵ��ƹ�ʽΪ��Fn=Fn-1+Fn-2������F1=F2=1��
//��n�Ƚϴ�ʱ��FnҲ�ǳ�������������֪����Fn����10007�������Ƕ��١�
/*�����ʽ
�������һ������n��
�����ʽ
���һ�У�����һ����������ʾFn����10007��������*/ 
//���ݹ�ģ��Լ��
//1 <= n <= 1,000,000��
import java.util.Scanner;

public class Begin4 {
	public static void main(String[] args) {
		int[] f=new int[1000001];//��֪����ģʱ�����Ȳ������
		f[1]=f[2]=1;
		for(int i=3;i<=1000000;i++)
		{
			f[i]=(f[i-1]+f[i-2])%10007;//�Ӽ������㲻Ӱ����������
		}
		Scanner sc=new Scanner(System.in);
		System.out.println(f[sc.nextInt()]);
		sc.close();
	}
	
}
