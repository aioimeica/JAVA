package practice_all;

public class prac1to5 {
	public static void prac_1(){
		//1、	将华氏温度转化成摄氏温度。公式为：C=（5/9）*(F-32)，其中F为华氏温度，C为摄氏温度。
		//请根据给定的华氏温度输出对应的摄氏温度。（易）
		int f=52;
		double c=(5.0/9)*(f-32);
		System.out.println(c);
	}
	
	public static void prac_2(){
		//2、	根据观察，蟋蟀的鸣叫频率与温度有关，具体的公式为T=（c+40）/10.其中，c代表蟋蟀每分钟鸣叫数，T代表华氏温度。
		//请根据蟋蟀每分钟的鸣叫数输出相应的华氏温度。（易）
		int c=50;
		int T=(c+40)/10;
		System.out.println(T);
	}

	public static void prac_3(){
		//3、	任意输入一个三位数，求这个数每个位上的数。如整数932，个位为2、十位为3、百位为9.
		int a=123;
		int b=a/100;
		int s=a/10%10;
		int g=a%10;
		System.out.println("这个数的个位数是"+g+" "+"十位数是"+s+" "+"百位数是"+b);
	}
	
	public static void prac_4(){
		//4、	编写程序，定义一个三位整数，求其各位数字之和。如整数932，各位数字之和为14. 
		int a=123;
		int b=a/100;
		int s=a/10%10;
		int g=a%10;
		int sum=g+s+b;
		System.out.println(sum);
	}
	
	public static void prac_5(){
		//5、	编程实现两个整数交换位置，例如：int x = 6,y = 9，交换后 x = 9，y = 6。
		int x=6,y=9;
		int z=y;
		y=x;
		x=z;
		System.out.println("x="+x+"y="+y);
	}
	

}
