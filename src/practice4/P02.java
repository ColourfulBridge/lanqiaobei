package practice4;
//����ת��
public class P02 {
	public static void main(String[] args) {
		//ʮ����ת������������
		String str1=Integer.toHexString(100);//ʮ����ת��Ϊʮ������
		String str2=Integer.toOctalString(100);//ʮ����ת��Ϊ�˽���
		String str3=Integer.toBinaryString(100);//ʮ����ת��Ϊ������
		String str4=Integer.toString(100, 7);//ʮ����ת�����������,ת������+ת���Ľ���
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		//��������ת��Ϊʮ����
		int n1=Integer.valueOf("FFFF", 16);//ʮ������ת��Ϊʮ����
		int n2=Integer.valueOf("776", 8);//8����ת��Ϊ10����
		int n3=Integer.valueOf("0101", 2);//2����ת��Ϊʮ����
		int n4=Integer.valueOf("101", 7);//7����ת��Ϊʮ����/�������ת��Ϊʮ����
		
		//��������ת��Ϊ��������
		//�߽��Ƶ��˽���
		String n=Integer.toString(Integer.valueOf("345", 7), 8);
	}
}
