package prac_add;
import java.util.*;
public class add101to105 {
	public static void add_101(){
//		101��	��ӡͼ��
//	   1
//	  222
//	 33333
//	4444444
//	 33333
//    222
//	   1
		for(int i=1;i<=4;i++){
			for(int k=0;k<=3-i;k++){
				System.out.print(" ");
				}

			for(int j=1;j<=i;j++){
				 System.out.print(i);
			}
			System.out.println();
		}
		for(int i=3;i>=0;i--){
			for(int k=1;k<=4-i;k++){
				System.out.print(" ");
				}

			for(int j=1;j<=i;j++){
				 System.out.print(i+" ");
			}
			System.out.println();
		}

	}
	
	
	public static void add_102(){
//		102��	��ӡ����������ͼ��
//		   1	
//		  121
//		 12321
//		1234321
//		 12321
//		  121
//		   1
		for(int i=1;i<=4;i++){
			for(int k=0;k<=3-i;k++){
				System.out.print(" ");
				}

			for(int j=1;j<=i;j++){
				 System.out.print(j);
				 if(j==i){
					 for(int l=j;l>1;l--){
						 System.out.print(l-1);
					 }
				 }
				 
			}
			
			System.out.println();
		}
		for(int i=3;i>=0;i--){
			for(int k=1;k<=4-i;k++){
				System.out.print(" ");
				}

			for(int j=1;j<=i;j++){
				 System.out.print(j);
				 if(j==i){
					 for(int l=j;l>1;l--){
						 System.out.print(l-1);
					 }
				 }
			}
			System.out.println();
		}
		
	}
	
	
	
	public static void add_103(){
		//103��	���������е�ǰ20��ĺͣ�2/1��3/2��5/3��8/5��13/8������
		int a=1,b=2,c;
		double d=0,sum=0;
		for(int i=1;i<=20;i++){
			c=a+b;
			d=(double)b/a;
			sum=sum+d;
			a=b;
			b=c;
		}
		System.out.println(sum);
	
	}
	
	
	
	public static void add_104(){
//		104��	��s=a+aa+aaa+aaaa+a...aa��ֵ������a�ǽ��ռ��������1~9�е�ĳ�����֡�
//				�����������ͨ�����ռ��������һ��n��ȷ����
//				���磺����2��5���س��������2+22+222+2222+22222��ֵ��
		Scanner in=new Scanner(System.in);
		System.out.println("������");
		int a=in.nextInt();
		int n=in.nextInt();
		int b=a;
		int s=0;
		for(int i=0;i<n;i++){
			s+=a;
			a=10*a+b;
		}
		System.out.println(s);
	}
	
	
	public static void add_105(){
//		105��	��̣����Ϸ���8����������1����������Ŀ��1�ţ���2����������Ŀ��1*2�ţ�
//		��3����������Ŀ��1*2*3�ţ��Դ����ƣ���ô��N����������Ŀ��1*2*3*��
//		*N�ţ��������еĵ�6�������Ѿ��������ߣ���ôʣ�µĻ��������Ƕ��٣�
		int a=1;int sum=0;
		for(int i=1;i<=8;i++){
			if(i==6)
				continue;
			a*=i;
			sum+=a;
		}System.out.println(sum);
	}
	
	
	
}
