package basic;

/*
 * ��������
����153��һ���ǳ��������������������ÿλ���ֵ������ͣ���153=1*1*1+5*5*5+3*3*3���������������������������λʮ��������
�����ʽ
��������С�����˳�����������������λʮ��������ÿ����ռһ�С�
 */
public class Basic7 {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int j=0;j<10;j++)
			{
				if(Math.pow((double)i, 3.00)+Math.pow((double)j, 3.00)>999)
				{
					break;
				}
				for(int k=0;k<10;k++)
				{
					if(Math.pow((double)i, 3.00)+Math.pow((double)j, 3.00)+Math.pow((double)k, 3.00)>999)
					{
						break;
					}
					if(Math.pow((double)i, 3.00)+Math.pow((double)j, 3.00)+Math.pow((double)k, 3.00)==i*100+j*10+k)
					{
						System.out.println(i*100+j*10+k);
					}
				}
			}
		}
	}
}
