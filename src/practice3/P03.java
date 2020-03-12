package practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//动态数组
public class P03 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();// 定义动态数组
		// 数组的添加元素
		list.add(10);
		list.add(1, 20);
		list.add(1, 30);// 向指定的坐标位置添加元素

		// for循环遍历(效率中等）
		for (int item : list) {
			System.out.print(item + " ");
		}
		System.out.println();

		// 迭代器遍历(效率最低)
		Iterator<Integer> it = list.iterator();// 获取集合list的迭代器
		while (it.hasNext()) {
			System.out.print(it.next() + " ");// 输出数组的内容
		}
		System.out.println();

		// 索引值遍历(效率最高)
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");// 输出数组内容
		}
		System.out.println();

		// 排序方法
		Collections.sort(list);

		// 修改某索引下的值
		list.set(2, 100);

		// 删除指定位上的元素
		list.remove(2);

		// 删除指定的元素
		list.remove((Object) 20);// 集合里包含的都是Object类型的数据

		// 判断集合是否包含某个元素
		System.out.println("判断list是否包含20" + list.contains(20));

		// 清空集合
		list.clear();

		// 判断集合是否为空
		System.out.println("判断集合是否为空" + list.isEmpty());
		
		//转化为数组(常用）
		Integer[] arr=list.toArray(new Integer[0]);
		for(Integer item:arr)
		{
			System.out.print(item+" ");
		}
		System.out.println();
		
		//转化为数组(便于理解)
		Integer[] arr1=new Integer[list.size()];
//		arr1=list.toArray();object不能向子类转换
		list.toArray(arr1);
		for(Integer item:arr1)
		{
			System.out.print(item+" ");
		}
	}
}
