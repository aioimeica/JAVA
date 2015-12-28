package prac_add;
import java.util.*;
public class add101to105 {
	public static void add_101(){
//		101、	打印图形
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
//		102、	打印金字塔数字图形
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
		//103、	求下面数列的前20项的和：2/1、3/2、5/3、8/5、13/8。。。
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
//		104、	求s=a+aa+aaa+aaaa+a...aa的值。其中a是接收键盘输入的1~9中的某个数字。
//				几个数相加是通过接收键盘输入的一个n来确定。
//				例如：输入2，5按回车则就是求2+22+222+2222+22222的值。
		Scanner in=new Scanner(System.in);
		System.out.println("请输入");
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
//		105、	编程：桌上放了8袋花生，第1袋花生的数目是1颗，第2袋花生的数目是1*2颗，
//		第3袋花生的数目是1*2*3颗，以此类推，那么第N袋花生的数目是1*2*3*。
//		*N颗，但是其中的第6袋花生已经被人拿走，那么剩下的花生总数是多少？
		int a=1;int sum=0;
		for(int i=1;i<=8;i++){
			if(i==6)
				continue;
			a*=i;
			sum+=a;
		}System.out.println(sum);
	}
	
	
	
}
