package practice2;
//�ַ�����չ1
public class P01 {
	public static void main(String[] args) {
		//����
		StringBuffer sb=new StringBuffer();
		//��ӵ����ݽ�β��
		sb.append("abc").append(true).append(34);
		//��ָ��������Ϊ������ӵ���֪����ָ��indexλ�ã����ظ���
		StringBuffer sb1=sb.insert(1,"qq");
		//ɾ��,ָ����ʼ�ͽ���λ��
		sb1.delete(0, 2);
		//ɾ��ָ��λ��
		sb.deleteCharAt(1);//ɾ���±�Ϊ1���ַ�
		//��ȡ����λ�õ�ֵ����ȡ����
		for(int i=0;i<sb1.length();i++)
		{
			System.out.print(sb1.charAt(i)+" ");
		}
		System.out.println();
		//�ҳ��ַ�����һ�γ��ֵ�λ��
		System.out.println("c�ַ���һ�γ��ֵ�λ�ã�"+sb1.indexOf("c"));
		System.out.println("ct�Ӵ���һ�γ��ֵ�λ�ã�"+sb1.indexOf("ct"));
		System.out.println("ct�Ӵ����һ�γ��ֵ�λ�ã�"+sb1.lastIndexOf("ct"));//����ָ�����ĸ��±꿪ʼ
		//��ȡ���ַ���
		System.out.println("��Χ��1-3�����ַ���:"+sb1.substring(1, 3));
		System.out.println("��Χ��1֮������ַ���:"+sb1.substring(1));
		//�滻�޸�
		sb.replace(1, 4, "java");//�滻��Χ��
		sb.setCharAt(7, 'm');//�޸ĵ����ַ�
		for(int i=0;i<sb1.length();i++)
		{
			System.out.print(sb1.charAt(i)+" ");
		}
		System.out.println();
		//��ת
		sb.reverse();
		for(int i=0;i<sb1.length();i++)
		{
			System.out.print(sb1.charAt(i)+" ");
		}
		System.out.println();
		//ת��Ϊ�ַ���
		String str=sb1.toString();
		System.out.println(str);
	}
}
