package practice_all;

public class prac26to30 {
	public static void prac_26(){
		//26��	ͳ��1000���������ܱ�2�������ܱ�5��������
		for(int i=1;i<=1000;i++){
			if(i%5==0&&i%2==0){
				System.out.println(i);
			}
		}
	}
	
	public static void prac_27(){
		//27��	��ӡ100���������ܱ�3����������ÿ5������ӡһ��
		int b=0;
		for(int a=1;a<=100;a++){
			if(a%3==0){
			System.out.print(a+" ");
			b++;
			if(b%5==0)
				System.out.println();
			}
		}
	}
	
	
	public static void prac_28(){
		//28��	�ж�ĳ�������Ƿ�Ϊ��������������һ������1��ֻ�ܱ�1��������������������
		int b=13,c=0;
		for(int a=2;a<b;a++){
			if(b%a==0)
				c++;
		}
		if(c>0)
			System.out.println("no");
		else
			System.out.println("yes");
	}
	
	public static void prac_29(){
		//29��	�ж�ĳ�������Ƿ�Ϊ��ȫ��������ȫ��������С�ڸ�
		//�����������֮�͵��ڸ�����������6��һ����ȫ������Ϊ��6=1+2+3��
		int a=10,sum=0;
		for(int b=1;b<a;b++){
			if(a%b==0)
				sum+=b;
		}
		if(a==sum)
			System.out.println("yes");
		else
			System.out.println("no");
	}
	
	public static void prac_30(){
		//30��	���1000���ڵ�����ˮ�ɻ�������ˮ�ɻ�����һ����λ����
		//������λ�������͵��ڸ�����������153��һ��ˮ�ɻ�������Ϊ153 = 13 + 53 + 33��
		for(int a=100;a<1000;a++){
			int b=a/100;
			int s=a/10%10;
			int g=a%10;
			if(a==b*b*b+s*s*s+g*g*g)
				System.out.println(a);
			
		}
	}
}
