package practice1;

import java.io.BufferedInputStream;
import java.io.StringBufferInputStream;
import java.util.Scanner;

//�������
public class P01 {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		Scanner sc=new Scanner(new BufferedInputStream(System.in));//�����ٶȸ��죬������ʱ����
//		int n=sc.nextInt();
//		System.out.println("����"+n);
//		double n1=sc.nextDouble();
//		System.out.println("����"+n1);
//		float n2=sc.nextFloat();
//		System.out.println("����"+n2);
//		String str=sc.next();//�����ܿո�
		String str=sc.nextLine();//����\n��ֹͣ��ȡ����˿��Զ��ո�
		
		System.out.println("�ַ���"+str);
		
		//����һ��֮�󣬿���һֱ����
		while(sc.hasNextLine())
		{
			System.out.println("�����"+sc.nextLine());
		}
		
		
	}

}
