package practice_all;

public class prac6to10 {
	public static void prac_6(){
//6��	��֪Բ�İ뾶����Բ�������
	double r=2.5;
	double s=r*r*3.1415;
	System.out.print(s);
	}
	
	public static void prac_7(){
		//7��	��֪��İ뾶������ı������
		double r=2.5;
		double s=4*3.14*r*r;
		System.out.println(s);
	}
	
	public static void prac_8(){
		//8��	��֪һ�������ε����߱߳��ֱ�Ϊa,b,c�����ú��׹�ʽ�������ε�����������ѣ�
		int a=3,b=4,c=5;
		double p=(a+b+c)/2.0;
		double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println(s);
	}
	
	public static void prac_9(){
		//9��	������ƽ���͵�������
		int a=2,b=3;
		double c=Math.sqrt(a*a+b*b);
		System.out.println(c);
	}
	
	public static void prac_10(){
		//10��	����һ��ʱ����������������������2Сʱ 17��30����ڶ�����
		
		int h=2,m=17,s=30;
		int s2=h*3600+m*60+s;
		System.out.println(s2);
	}
}
