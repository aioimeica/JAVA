package practice_all;

public class prac1to5 {
	public static void prac_1(){
		//1��	�������¶�ת���������¶ȡ���ʽΪ��C=��5/9��*(F-32)������FΪ�����¶ȣ�CΪ�����¶ȡ�
		//����ݸ����Ļ����¶������Ӧ�������¶ȡ����ף�
		int f=52;
		double c=(5.0/9)*(f-32);
		System.out.println(c);
	}
	
	public static void prac_2(){
		//2��	���ݹ۲죬�������Ƶ�����¶��йأ�����Ĺ�ʽΪT=��c+40��/10.���У�c������ÿ������������T�������¶ȡ�
		//�������ÿ���ӵ������������Ӧ�Ļ����¶ȡ����ף�
		int c=50;
		int T=(c+40)/10;
		System.out.println(T);
	}

	public static void prac_3(){
		//3��	��������һ����λ�����������ÿ��λ�ϵ�����������932����λΪ2��ʮλΪ3����λΪ9.
		int a=123;
		int b=a/100;
		int s=a/10%10;
		int g=a%10;
		System.out.println("������ĸ�λ����"+g+" "+"ʮλ����"+s+" "+"��λ����"+b);
	}
	
	public static void prac_4(){
		//4��	��д���򣬶���һ����λ�����������λ����֮�͡�������932����λ����֮��Ϊ14. 
		int a=123;
		int b=a/100;
		int s=a/10%10;
		int g=a%10;
		int sum=g+s+b;
		System.out.println(sum);
	}
	
	public static void prac_5(){
		//5��	���ʵ��������������λ�ã����磺int x = 6,y = 9�������� x = 9��y = 6��
		int x=6,y=9;
		int z=y;
		y=x;
		x=z;
		System.out.println("x="+x+"y="+y);
	}
	

}
