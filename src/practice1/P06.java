package practice1;
//�ַ���-5
public class P06 {
	public static void main(String[] args) {
		//�ַ����������ַ���֮���ת��
		String str="hahhaha";
		char[] chs= {'a','b','c','d','e','f'};
		//�ַ���-->�ַ�����
		char[] chs_str=str.toCharArray();
		for(char ch:chs)
		{
			System.out.print(ch+" ");
		}
		
		//�ַ�����-->�ַ���
		String str_chs=new String(chs);
		System.out.println("�ַ�����chsȫ��ת��Ϊ�ַ�����"+str_chs);
		String str_chs_1=new String(chs,2,4);//���±�2��ʼȡ4���ַ�ת��
		System.out.println("�ַ�����chs����ת��Ϊ�ַ�����"+str_chs_1);
		
		
		//�ֽ��������ַ�����֮���ת��
		//�ַ���-->�ֽ�����
		byte[] bs=str.getBytes();
		for(byte b:bs)
		{
			System.out.print(b+" ");
		}
		System.out.println();
		
		//�ֽ�����-->�ַ���
		String str_bs=new String(bs);
		String str_bs1=new String(bs,2,4);//���±�2��ʼȡ4���ֽ�ת��
		System.out.println("�ֽ�����bsȫ��ת��Ϊ�ַ�����"+str_bs);
		System.out.println("�ֽ�����bs����ת��Ϊ�ַ�����"+str_bs1);
		
	}
}
