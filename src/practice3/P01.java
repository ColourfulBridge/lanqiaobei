package practice3;

import java.util.Arrays;

//数组1
public class P01 {
	public static void main(String[] args) {
		//数组声明
		int arr1[];
		int[] arr2;//推荐
		
		//数组初始化
		int[] arr=new int[] {1,2,3,4,5};
		int[] arr3= {1,2,3,4,5};
		
		//遍历数组
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		for(int x:arr)
		{
			System.out.print(x+"\t");
		}
		System.out.println();
		
		//Arrays类的静态方法
		
		//1.fill方法填充数组
		int[] arr_fill=new int[10];//定义
		Arrays.fill(arr_fill, -1);//把arr_fill全部填充-1
		Arrays.fill(arr, 0, 4, 100);//填充arr数组前4个为100
		for(int x:arr_fill)
		{
			System.out.print(x+"\t");
		}
		System.out.println();
		for(int x:arr)
		{
			System.out.print(x+"\t");
		}
		System.out.println();
		
		//2.sort排序方法
		Arrays.sort(arr);//对数组全部元素排序
		Arrays.sort(arr,2,4);//对数组的指定范围内的元素排序
		Arrays.parallelSort(arr);//当数据量较大时，parallelSort的性能更高
		
		//3.copyOf复制数组
		int[] arr_copy=Arrays.copyOf(arr3, 3);//复制的数组+返回数组的长度
		int[] arr_copy1=Arrays.copyOf(arr3, 10);
		for(int item:arr_copy)
		{
			System.out.print(item+"\t");
		}
		System.out.println();
		for(int item:arr_copy1)
		{
			System.out.print(item+"\t");
		}
		System.out.println();
		int[] arr_copy2=Arrays.copyOfRange(arr3, 1, 4);
		for(int item:arr_copy2)
		{
			System.out.print(item+"\t");
		}
		System.out.println();
		
		//4.检查数组中是否包含一个元素(暂时只知道可以判断是否包含一个字符串元素)s
		System.out.println("arr_copy2中是否包含3:"+Arrays.asList(arr_copy2).contains(3));//查看arr3数组中是否包含4
	}
}
