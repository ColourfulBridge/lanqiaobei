package practice2;
//字符串扩展1
public class P01 {
	public static void main(String[] args) {
		//定义
		StringBuffer sb=new StringBuffer();
		//添加到数据结尾处
		sb.append("abc").append(true).append(34);
		//将指定数据作为参数添加到已知数据指定index位置，返回副本
		StringBuffer sb1=sb.insert(1,"qq");
		//删除,指定开始和结束位置
		sb1.delete(0, 2);
		//删除指定位置
		sb.deleteCharAt(1);//删除下标为1的字符
		//获取索引位置的值，获取长度
		for(int i=0;i<sb1.length();i++)
		{
			System.out.print(sb1.charAt(i)+" ");
		}
		System.out.println();
		//找出字符串第一次出现的位置
		System.out.println("c字符第一次出现的位置："+sb1.indexOf("c"));
		System.out.println("ct子串第一次出现的位置："+sb1.indexOf("ct"));
		System.out.println("ct子串最后一次出现的位置："+sb1.lastIndexOf("ct"));//可以指定从哪个下标开始
		//获取子字符串
		System.out.println("范围在1-3的子字符串:"+sb1.substring(1, 3));
		System.out.println("范围在1之后的子字符串:"+sb1.substring(1));
		//替换修改
		sb.replace(1, 4, "java");//替换范围内
		sb.setCharAt(7, 'm');//修改单个字符
		for(int i=0;i<sb1.length();i++)
		{
			System.out.print(sb1.charAt(i)+" ");
		}
		System.out.println();
		//反转
		sb.reverse();
		for(int i=0;i<sb1.length();i++)
		{
			System.out.print(sb1.charAt(i)+" ");
		}
		System.out.println();
		//转化为字符串
		String str=sb1.toString();
		System.out.println(str);
	}
}
