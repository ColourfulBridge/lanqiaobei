package basic;

import java.util.Scanner;

/**
 问题描述
　　平面上有两个矩形，它们的边平行于直角坐标系的X轴或Y轴。对于每个矩形，我们给出它的一对相对顶点的坐标，请你编程算出两个矩形的交的面积。
输入格式
　　输入仅包含两行，每行描述一个矩形。
　　在每行中，给出矩形的一对相对顶点的坐标，每个点的坐标都用两个绝对值不超过10^7的实数表示。
输出格式
　　输出仅包含一个实数，为交的面积，保留到小数后两位。
样例输入
1 1 3 3
2 2 4 4
样例输出
1.00
 *
 */
public class Basic18 {
	public static void main(String[] args) {
		//点数组
		double[][] points=new double[2][4];
		
		//输入数组
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
				points[i][j]=sc.nextDouble();//输入按格式输
		}
		sc.close();
		
		//求相交边界
		//左边界的最大值，右边界的最小值，上边界的最小值，下边界的最大值
		double left_border=Math.max(Math.min(points[0][0], points[0][2]), Math.min(points[1][0], points[1][2]));
		double right_border=Math.min(Math.max(points[0][0], points[0][2]), Math.max(points[1][0], points[1][2]));
		double up_border=Math.min(Math.max(points[0][1], points[0][3]), Math.max(points[1][1], points[1][3]));
		double down_border=Math.max(Math.min(points[0][1], points[0][3]), Math.min(points[1][1], points[1][3]));
		
		//如果左边界小于右边界，或者上边界小于下边界时，相交矩形不存在，也就是两个矩形不相交
		if(left_border>right_border||up_border<down_border)
			System.out.println("0.00");
		else {
			double length=right_border-left_border;
			double height=up_border-down_border;
			System.out.println(String.format("%.2f",length*height));//以保留小数点两位的格式输出
		}
	}
}

