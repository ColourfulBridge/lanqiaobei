package practice1;
//�ַ���-4
public class P05 {
public static void main(String[] args) {
	String str="123456";
	
	//��ȡ�ַ�������
	System.out.println("str�ĳ���"+str.length());
	
	//�����ַ����ĺϲ�
	String str1="123";
	String str2="456";
	System.out.println("�ϲ��ַ���str1��str2:"+str1.concat(str2));
	System.out.println("str1:"+str1);//ֻ�ǽ��ϲ���ĸ������أ���δ�ı�ԭ�����ַ���
	System.out.println("str2:"+str2);
	
	//�ж��ַ������Ƿ����ĳЩ�ִ�
	System.out.println("�ж�str���Ƿ����34"+str.contains("34"));
	
	//�����ַ���
	System.out.println("����1��str"+str.repeat(1));
	System.out.println("����3��str"+str.repeat(3));
	
	//���ַ���ת������Ӧ����ֵ
	//int��
	int n=Integer.parseInt(str);
	System.out.println("ת��Ϊint��:"+n);
	//long��
	long ln=Long.parseLong(str);
	System.out.println("ת��Ϊlong�ͣ�"+ln);
	//double��
	double d1=Double.parseDouble(str);
	System.out.println("ת��Ϊdouble��:"+d1);
	double d2=Double.valueOf(str);
	System.out.println("ת��Ϊdouble��:"+d2);
	
}
}
