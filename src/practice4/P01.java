package practice4;

import java.text.DecimalFormat;

//���ݸ�ʽ��
public class P01 {
	public static void main(String[] args) {
		//DecimalFormat format����
		//0ռλ��
		//��ʵ�����ֶ࣬����ĵط���0����
		System.out.println(new DecimalFormat("00.00").format(3.14));
		System.out.println(new DecimalFormat("0.000").format(3.14));
		System.out.println(new DecimalFormat("00.000").format(3.14));
		//��ʵ�������٣����岿�ֲ��Ķ���С��������������
		System.out.println(new DecimalFormat("0.000").format(13.146));
		System.out.println(new DecimalFormat("00.00").format(13.146));
		System.out.println(new DecimalFormat("0.00").format(13.146));
		
		//#ռλ��
		//��ʵ��λ���࣬����
		System.out.println(new DecimalFormat("##.##").format(3.14));
		System.out.println(new DecimalFormat("#.###").format(3.14));
		System.out.println(new DecimalFormat("##.###").format(3.14));
		//��ʵ�������٣����岿�ֲ��Ķ���С��������������
		System.out.println(new DecimalFormat("#.###").format(13.146));
		System.out.println(new DecimalFormat("##.##").format(13.146));
		System.out.println(new DecimalFormat("#.##").format(13.146));
		
	}
}
