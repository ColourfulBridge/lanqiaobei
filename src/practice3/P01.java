package practice3;

import java.util.Arrays;

//����1
public class P01 {
	public static void main(String[] args) {
		//��������
		int arr1[];
		int[] arr2;//�Ƽ�
		
		//�����ʼ��
		int[] arr=new int[] {1,2,3,4,5};
		int[] arr3= {1,2,3,4,5};
		
		//��������
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
		
		//Arrays��ľ�̬����
		
		//1.fill�����������
		int[] arr_fill=new int[10];//����
		Arrays.fill(arr_fill, -1);//��arr_fillȫ�����-1
		Arrays.fill(arr, 0, 4, 100);//���arr����ǰ4��Ϊ100
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
		
		//2.sort���򷽷�
		Arrays.sort(arr);//������ȫ��Ԫ������
		Arrays.sort(arr,2,4);//�������ָ����Χ�ڵ�Ԫ������
		Arrays.parallelSort(arr);//���������ϴ�ʱ��parallelSort�����ܸ���
		
		//3.copyOf��������
		int[] arr_copy=Arrays.copyOf(arr3, 3);//���Ƶ�����+��������ĳ���
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
		
		//4.����������Ƿ����һ��Ԫ��(��ʱֻ֪�������ж��Ƿ����һ���ַ���Ԫ��)s
		System.out.println("arr_copy2���Ƿ����3:"+Arrays.asList(arr_copy2).contains(3));//�鿴arr3�������Ƿ����4
	}
}
