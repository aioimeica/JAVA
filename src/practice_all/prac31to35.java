package practice_all;
import java.util.*;

public class prac31to35 {

	public static void prac_31(){
		//31��	��д������������������ǵ��ܺ���ƽ��ֵ������0ʱ�������
		Scanner input=new Scanner(System.in);
		int sum=0;
		int a=1;
		System.out.println("����������");
		
		for(;true;a++){
			int b=input.nextInt();
			sum+=b;
			if(b==0)
				break;
		}
		System.out.println("�ܺ��ǣ�"+sum);
		System.out.println("ƽ�����ǣ�"+(double)(sum/(a-1)));
	}
	
	public static void prac_32(){
		//32��	��whileѭ������n��ƽ������12000����С��n��
		int n=1;
		while(n*n<=12000){
			n++;
		}
		System.out.println(n);
	}
	
	
	public static void prac_33(){
		//33��	��1+1/2+1/3+��+1/n>10��n��ֵ����Ϊ���
		int i=1;
		double sum=0;
		while(sum<=10){
			sum=sum+(double)1/i;
			i++;
		}
		System.out.println(i);
	}
		
		public static void prac_34(){
			//34��	����10000Ԫ�������У�������ǧ��֮3��ÿ��1�꣬�������Ϣ��Ϊ�µı���5����ܹ��ж���Ǯ
			int j=1;
			double i=10000, n=3/1000;
			while(j<=5){
				i=i*n+i;
				j++;
			}
			System.out.println(i);
		}
		
		
		public static void prac_35(){
//35��	쳲��������еĵ�1�͵�2�����ֱ�Ϊ1��1���ӵ���������ʼ��
//ÿ����������ǰ������֮�ͣ�1,1,2,3,5,8,13��.��.��дһ���������쳲����������е�ǰ20������
			int a=1,b=1,c=0;
			System.out.print(a+" "+b+" ");
			for(int i=1;i<=18;i++){
				c=a+b;
				a=b;
				b=c;
				System.out.print(c+" ");
				
			}
		}
	}

