package practice_all;

public class prac16to20 {

	public static void prac_16(){
		//16��	�ж�ĳ���Ƿ�Ϊ���ꡣ������������ǣ����������ܱ�4����
		//�Ҳ��ܱ�100����������������ܱ�400����������������꣬���������ꡣ��
		int a=2015;
		if(a%4==0&&a%100!=0||a%400==0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
	
	public static void prac_17(){
		//17��	�����к�����y��ֵ
		int x=10,y=0;
		if(x>0)
			y=3*x+5;
		if(x<0)
			y=x-2;
		else
			y=10;
		System.out.println(y);
			
	}
	
	public static void prac_18(){
		//18��	����ĳͬѧ�ĳɼ����ж���ɼ��ĵȼ�����90~100��Ϊ�����㡱��80~89Ϊ�����á�
		//��70~79Ϊ���еȡ���60~69Ϊ�����񡱣�60������Ϊ�������񡱡���
		int a=98;
		if(a<=100&&a>=90)
			System.out.println("����");
		if(a<90&&a>=80)
			System.out.println("����");
		if(a<80&&a>=70)
			System.out.println("�е�");
		if(a<70&&a>=60)
			System.out.println("����");
		if(a<60&&a>=0)
			System.out.println("������");
		else
			System.out.println("��������");
	}
	
	public static void prac_19(){
		//19��	ĳ����Ϊ�˴������涨�����ﲻ��50Ԫ�İ�ԭ�۸������50����100�İ����۸���
		//������100Ԫ�ģ��������ְ����۸����һ������ɳ��е��Զ��ƷѵĹ�����
		double a=156;
		if(a<50)
			a=a;
		if(a>=50&&a<100)
			a=a*0.9;
		if(a>100)
			a=100+(a-100)*0.8;
		System.out.println(a);
	}
	
	public static void prac_20(){
		//20��	��дһ�����򣬹����ǴӼ�������1��4�е�ĳһ�����֣�
		//�ɵ��Դ�ӡ�����Ӧ�ļ��ڵ�Ӣ�����ơ�spring summer autumn winter�����ѣ�
		int a=3;
		switch(a){
		case 1:System.out.println("spring");break;
		case 2:System.out.println("summer");break;
		case 3:System.out.println("autumn");break;
		case 4:System.out.println("winter");break;
		default :System.out.println("��������");
		
		}
	}
	
	
}
