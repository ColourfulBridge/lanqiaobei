package basic;

import java.util.Scanner;

/**
 ��������
����ƽ�������������Σ����ǵı�ƽ����ֱ������ϵ��X���Y�ᡣ����ÿ�����Σ����Ǹ�������һ����Զ�������꣬����������������εĽ��������
�����ʽ
����������������У�ÿ������һ�����Ρ�
������ÿ���У��������ε�һ����Զ�������꣬ÿ��������궼����������ֵ������10^7��ʵ����ʾ��
�����ʽ
�������������һ��ʵ����Ϊ���������������С������λ��
��������
1 1 3 3
2 2 4 4
�������
1.00
 *
 */
public class Basic18 {
	public static void main(String[] args) {
		//������
		double[][] points=new double[2][4];
		
		//��������
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
				points[i][j]=sc.nextDouble();//���밴��ʽ��
		}
		sc.close();
		
		//���ཻ�߽�
		//��߽�����ֵ���ұ߽����Сֵ���ϱ߽����Сֵ���±߽�����ֵ
		double left_border=Math.max(Math.min(points[0][0], points[0][2]), Math.min(points[1][0], points[1][2]));
		double right_border=Math.min(Math.max(points[0][0], points[0][2]), Math.max(points[1][0], points[1][2]));
		double up_border=Math.min(Math.max(points[0][1], points[0][3]), Math.max(points[1][1], points[1][3]));
		double down_border=Math.max(Math.min(points[0][1], points[0][3]), Math.min(points[1][1], points[1][3]));
		
		//�����߽�С���ұ߽磬�����ϱ߽�С���±߽�ʱ���ཻ���β����ڣ�Ҳ�����������β��ཻ
		if(left_border>right_border||up_border<down_border)
			System.out.println("0.00");
		else {
			double length=right_border-left_border;
			double height=up_border-down_border;
			System.out.println(String.format("%.2f",length*height));//�Ա���С������λ�ĸ�ʽ���
		}
	}
}

