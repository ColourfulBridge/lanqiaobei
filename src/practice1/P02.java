package practice1;

//�ַ���-1
public class P02 {
	public static void main(String[] args) {
		// �����ַ���
		String str = "123453421";// ������
		String str1 = new String("1234567");// �ַ�������

		// �ַ��������ִ�����
//		int n=str.indexOf("34");
		int n = str1.indexOf("34");
		System.out.println("34��str�е��±�:" + n);
		int lastn = str.lastIndexOf("34");
		System.out.println("34��str���һ���±꣺" + lastn);
		//Ҳ�ɲ��ҵ����ַ�
		System.out.println("�ַ�3��str�е��±꣺"+str.indexOf('3'));
		System.out.println("���±�3��ʼ���ַ�3:"+str.indexOf('3', 3));//�ڶ���3���±�Ϊ5��λ��

		// ��ȡָ������λ�õ��ַ�
		System.out.println("str���±�Ϊ2���ַ���" + str.charAt(2));

		// ��ȡָ��������Χ�����ַ���
		System.out.println("�±���3-6���Ӵ���" + str.substring(3, 6));
		System.out.println("��ȡ���±�3��ʼ���ִ���" + str.substring(3));

		// ȥ���ַ����Ŀո�
		String str3 = "    hello world! ";
		System.out.println("ȥ���ո�ǰ" + str3 + ",���ȣ�" + str3.length());
		System.out.println("ȥ���ո��" + str3.trim() + ",���ȣ�" + str3.trim().length());
		// trim()�����ı�str�������Ƿ����˸ı����ַ�������

		// �ַ����滻
		// replace���ı��ַ����������ǽ��滻����ַ���������,�����滻�ǽ��ַ���������������ȫ���滻����ʹ��������ʽ
		System.out.println("str�滻�ַ�3Ϊ�ַ�0��" + str.replace('3', '0'));
		// �������ַ����滻�ַ���
		System.out.println("str�滻�ַ���34Ϊ�ַ���00��" + str.replace("34", "00"));
		System.out.println("str�滻�ַ�34Ϊ�ַ�88��" + str.replaceAll("34", "88"));
		// ���ߵ��ַ������Բ����
		System.out.println("str�滻�ַ�3Ϊ�ַ�0��" + str.replace("34", "0"));
		System.out.println("str�滻�ַ�3Ϊ�ַ�0��" + str.replace("34", "0"));
		//���Խ��滻���������ĵ�һ��Ԫ��
		System.out.println("�滻str�ĵ�һ��34Ϊ000000:"+str.replaceFirst("34", "000000"));
		
	}

}
