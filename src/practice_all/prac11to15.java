package practice_all;

public class prac11to15 {
public static void prac_11(){
	//11、	从键盘输入三个数a,b,c,将a,b,c按从大到小的顺序输出
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
	//12、	两个整数比较大小，输出较大值。
	int a=1,b=2;
	if(a>b)
		System.out.println(a);
	else
		System.out.println(b);
}

public static void prac_13(){
	//13、	三个整数比较大小，输出最大值
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
	//14、	铁路托运行李规定：行李重不超过50公斤的，
	//托运费按每公斤。0.15元计费，如超50公斤，超过部分每公斤加收0.10元。编一程序完成自动计费工作。
	int a=54;
	double b=0;
	if(a>=50)
		b=0.15*50+0.1*(a-50);
	else
		b=0.15*a;
}

public static void prac_15(){
	//15、	判断某个整数是否为水仙花数。（水仙花数是一个三位数，该数各位的立方和等于  该数本身。
	//例如153是一个水仙花数，因为153 = 1^3 + 5^3 + 3^3）
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
