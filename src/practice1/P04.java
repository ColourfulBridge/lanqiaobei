package practice1;
//�ַ���-3
public class P04 {
	public static void main(String[] args) {
		//�ַ����ָ�(�ָ�������ʹ��������ʽ��
		String str="a,b,c,d,e,f,g";
		String str1="00si00ma00guang00za00gang00";
		String str2="si00ma00guang00za00gang00";
		String[] splitStr=str.split(",");
		String[] splitStr1=str1.split("00");
		String[] splitStr1_1=str1.split("00",4);//���Ʋ�ִ���Ϊ4
		String[] splitStr2_1=str1.split("00",4);//���Ʋ�ִ���Ϊ4//�����Ϊ3��
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
