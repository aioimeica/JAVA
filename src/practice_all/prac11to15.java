package practice_all;

public class prac11to15 {
public static void prac_11(){
	//11��	�Ӽ�������������a,b,c,��a,b,c���Ӵ�С��˳�����
	int a=2,b=7,c=6;
	if(a>b){
			if(b>c)
				System.out.println(a+" "+b+" "+c);
			if(b<c){
				if(a>c)
					System.out.println(a+" "+c+" "+b);
				else
					System.out.println(c+" "+a+" "+b);
			}
	}
	if(a<b){
		if(a>c)
			System.out.println(b+" "+a+" "+c);
		if(a<c){
			if(b>c)
				System.out.println(b+" "+c+" "+a);
			else
				System.out.println(c+" "+b+" "+a);
			
		}
			
	}
}

public static void prac_12(){
	//12��	���������Ƚϴ�С������ϴ�ֵ��
	int a=1,b=2;
	if(a>b)
		System.out.println(a);
	else
		System.out.println(b);
}

public static void prac_13(){
	//13��	���������Ƚϴ�С��������ֵ
	int a=1,b=2,c=3;
	int max=0;
	if(a>b)
		max=a;
	else
		max=b;
	if(max>c)
		max=max;
	else
		max=c;
	System.out.println(max);
}

public static void prac_14(){
	//14��	��·��������涨�������ز�����50����ģ�
	//���˷Ѱ�ÿ���0.15Ԫ�Ʒѣ��糬50�����������ÿ�������0.10Ԫ����һ��������Զ��Ʒѹ�����
	int a=54;
	double b=0;
	if(a>=50)
		b=0.15*50+0.1*(a-50);
	else
		b=0.15*a;
}

public static void prac_15(){
	//15��	�ж�ĳ�������Ƿ�Ϊˮ�ɻ�������ˮ�ɻ�����һ����λ����������λ�������͵���  ��������
	//����153��һ��ˮ�ɻ�������Ϊ153 = 1^3 + 5^3 + 3^3��
	int a=153;
	int g=a%10;
	int s=a/10%10;
	int b=a/100;
	if(a==g*g*g+b*b*b+s*s*s)
		System.out.println("yes");
	else
		System.out.println("no");
}
}
