package practice1;
//字符串-3
public class P04 {
	public static void main(String[] args) {
		//字符串分割(分割条件可使用正则表达式）
		String str="a,b,c,d,e,f,g";
		String str1="00si00ma00guang00za00gang00";
		String str2="si00ma00guang00za00gang00";
		String[] splitStr=str.split(",");
		String[] splitStr1=str1.split("00");
		String[] splitStr1_1=str1.split("00",4);//限制拆分次数为4
		String[] splitStr2_1=str1.split("00",4);//限制拆分次数为4//即拆分为3块
		for(String item:splitStr) {
			System.out.println(item);
		}
		
		for(String item:splitStr1) {
			System.out.println(item);
		}
		
		for(String item:splitStr1_1) {
			System.out.println(item);
		}
		
		for(String item:splitStr2_1) {
			System.out.println(item);
		}
	}
}
