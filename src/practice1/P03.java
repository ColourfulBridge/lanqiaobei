package practice1;
//�ַ���-2
public class P03 {
	public static void main(String[] args) {
		String str="abcdefghijklmn";
		
//		�ж��ַ����Ŀ�ͷ�ͽ�β
		System.out.println("�ж��ַ����Ƿ���ab��ͷ:"+str.startsWith("ab"));
		System.out.println("�ж��ַ����Ƿ���cb��ͷ:"+str.startsWith("cd"));
		//���ô��ַ�����������ͷ�ж�
		System.out.println("�ж��ַ����Ƿ���±�2��ʼ��cb��ͷ:"+str.startsWith("cd",2));
		//��β��û�д������±꿪ʼ��
		System.out.println("�ж��ַ����Ƿ�ʼ��cb��β:"+str.endsWith("mn"));
		
		//�ж��ַ����Ƿ����
		String str1="abcdef";
		System.out.println("�ж�str��str1�����ַ����Ƿ����:"+str.equals(str1));
		String str2="ABCDEF";
		System.out.println("�ж�str1��str2�Ƿ����"+str1.equals(str2));
		System.out.println("�ж�str1��str2���Դ�Сдʱ�Ƿ����"+str1.equalsIgnoreCase(str2));
		
		//���ֵ���Ƚ������ַ���(����>0������=0��С��<0)
		System.out.println("str��str1�������Ȳ�ͬ�ıȽϣ�"+str.compareTo(str1));
		System.out.println("str1��str2����������ͬ�ıȽϣ�"+str1.compareTo(str2));
		System.out.println("str1��str2����������ͬ���Դ�Сд�ıȽϣ�"+str1.compareToIgnoreCase(str2));
		
		//��ĸ��Сдת��
		System.out.println("str1ת��Ϊ��д��"+str1.toUpperCase());
		System.out.println("str1:"+str1);
		System.out.println("str2ת��ΪСд��"+str2.toLowerCase());
		System.out.println("str2:"+str2);
		
	}
}
