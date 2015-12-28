package practice_all;
import java.util.*;

public class prac31to35 {

	public static void prac_31(){
		//31、	编写程序读入整数并求它们的总和与平均值。输入0时程序结束
		Scanner input=new Scanner(System.in);
		int sum=0;
		int a=1;
		System.out.println("请输入数字");
		
		for(;true;a++){
			int b=input.nextInt();
			sum+=b;
			if(b==0)
				break;
		}
		System.out.println("总和是："+sum);
		System.out.println("平均数是："+(double)(sum/(a-1)));
	}
	
	public static void prac_32(){
		//32、	用while循环，求n的平方大于12000的最小数n。
		int n=1;
		while(n*n<=12000){
			n++;
		}
		System.out.println(n);
	}
	
	
	public static void prac_33(){
		//33、	求1+1/2+1/3+…+1/n>10，n的值至少为多大
		int i=1;
		double sum=0;
		while(sum<=10){
			sum=sum+(double)1/i;
			i++;
		}
		System.out.println(i);
	}
		
		public static void prac_34(){
			//34、	本金10000元存入银行，年利率千分之3，每过1年，本金和利息作为新的本金，5年后，总共有多少钱
			int j=1;
			double i=10000, n=3/1000;
			while(j<=5){
				i=i*n+i;
				j++;
			}
			System.out.println(i);
		}
		
		
		public static void prac_35(){
//35、	斐波那契数列的第1和第2个数分别为1和1，从第三个数开始，
//每个数等于其前两个数之和（1,1,2,3,5,8,13….）.编写一个程序输出斐波那契数列中的前20个数。
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

