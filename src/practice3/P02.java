package practice3;

import java.util.Arrays;

import com.sun.tools.javac.util.ArrayUtils;

//数组2
public class P02 {
	public static void main(String[] args) {
		String[] arr= {"wang","zhao","zhu","lin","sun"};
		
		//检查数组中是否包含一个元素
		System.out.println("查看arr中是否包含zhu:"+Arrays.asList(arr).contains("zhu"));
		
		//万能的ArrayUtils
		//连接两个数组
//		String[] str_all=ArrayUtils.addAll(arr,new String[] {"zhang","shen"});
		
		//数组反转
//		String[] arr_reverse=ArrayUtils.
		
		//从数组中移除某个元素
		
		//java打印数组
		int[] arr2= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr2));//可以很顺利的打印
		double[] arr3= {2.34,4.56,7.89,5.78};
		System.out.println(Arrays.toString(arr3));
		//字符串数组没用
		
		for(int n:arr2)
		{
			System.out.print(n+",");
		}
		System.out.println();
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+",");
		}
		System.out.println();
		
		System.out.println(Arrays.asList(arr2));//没用
		System.out.println(Arrays.asList(arr));//字符串数组有用
		
		//定位元素位置
		System.out.println("找到arr中zhu的位置："+Arrays.binarySearch(arr, "zhu"));//有用
		System.out.println("找到arr2中4的位置："+Arrays.binarySearch(arr2, 4));//有用
		
		System.out.println("找到arr中zhu的位置："+Arrays.asList(arr).indexOf("zhu"));
		System.out.println("找到arr2中4的位置："+Arrays.asList(arr2).indexOf(4));//对于List的找字符串之外的都没有用//，没用
	}
}
