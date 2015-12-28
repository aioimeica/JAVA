package practice_all;

public class prac6to10 {
	public static void prac_6(){
//6、	已知圆的半径，求圆的面积。
	double r=2.5;
	double s=r*r*3.1415;
	System.out.print(s);
	}
	
	public static void prac_7(){
		//7、	已知球的半径，求球的表面积。
		double r=2.5;
		double s=4*3.14*r*r;
		System.out.println(s);
	}
	
	public static void prac_8(){
		//8、	已知一个三角形的三边边长分别为a,b,c，利用海伦公式求三角形的面积。（较难）
		int a=3,b=4,c=5;
		double p=(a+b+c)/2.0;
		double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println(s);
	}
	
	public static void prac_9(){
		//9、	求两数平方和的算术根
		int a=2,b=3;
		double c=Math.sqrt(a*a+b*b);
		System.out.println(c);
	}
	
	public static void prac_10(){
		//10、	给定一段时间求出它的秒数。（如计算2小时 17分30秒等于多少秒
		
		int h=2,m=17,s=30;
		int s2=h*3600+m*60+s;
		System.out.println(s2);
	}
}
