package practice4;

import java.text.DecimalFormat;

//数据格式化
public class P01 {
	public static void main(String[] args) {
		//DecimalFormat format方法
		//0占位符
		//比实际数字多，不足的地方用0不上
		System.out.println(new DecimalFormat("00.00").format(3.14));
		System.out.println(new DecimalFormat("0.000").format(3.14));
		System.out.println(new DecimalFormat("00.000").format(3.14));
		//比实际数字少，整体部分不改动，小数部分四舍五入
		System.out.println(new DecimalFormat("0.000").format(13.146));
		System.out.println(new DecimalFormat("00.00").format(13.146));
		System.out.println(new DecimalFormat("0.00").format(13.146));
		
		//#占位符
		//比实际位数多，不变
		System.out.println(new DecimalFormat("##.##").format(3.14));
		System.out.println(new DecimalFormat("#.###").format(3.14));
		System.out.println(new DecimalFormat("##.###").format(3.14));
		//比实际数字少，整体部分不改动，小数部分四舍五入
		System.out.println(new DecimalFormat("#.###").format(13.146));
		System.out.println(new DecimalFormat("##.##").format(13.146));
		System.out.println(new DecimalFormat("#.##").format(13.146));
		
	}
}
