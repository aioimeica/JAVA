package practice_all;

public class prac36to40 {
	public static void prac_36(){
//36��	һ�����100�׸��������£�ÿ����غ󣬷�����ԭ�߶ȵ�һ�룬�����£��ٷ�����������10����غ󷴵���ߣ�
		double a=100;
		int i=0;
		while(i<10){
			a=a/2;
			i++;
		}
		System.out.println(a);
	}
	
	
	public static void prac_37(){
		//37��	��1020�����ϣ���һ������һ����������Ժ�ÿ����ʣ�µ�һ����������ʼ����������꣬���̼���
		int b=1020;
		int a=0;
		for(;b>0;a++){
			b=b/2-2;
		}
		System.out.println(a);
	}

	
	public static void prac_38(){
		//38��	��һ�������100��200֮�䣩������ֳ�4�����һ��������飬���2�������
		//���ֳ�7�����һ�飬���3����������ֳ�9�����һ�飬���5�������������������
		for(int a=100;a<=200;a++){
			if(a%4==2&&a%7==3&&a%9==5)
				System.out.println(a);
		}
	}
	
	
	public static void prac_39(){
		//39��	���10��100֮��ÿλ���ĳ˻�����ÿλ���ĺ͵���
		for(int a=10;a<100;a++){
			int g=a%10;
			int s=a/10;
			if(g*s>g+s)
				System.out.println(a);
			
		}
	}
	
	public static void prac_40(){
		//40��	��s=a+aa+aaa+aaaa+aaaaa��ֵ������a�ǽ��ռ��������1~9�е�ĳ�����֡�
		//���磺����2���س�����2+22+222+2222+22222��ֵ
		int a=2;
		int b=a;
		int sum=a;
		for(int i=1;i<=4;i++){
			a=10*a+b;
			sum+=a;
		}
		System.out.println(sum);
	}
}
