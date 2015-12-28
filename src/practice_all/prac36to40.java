package practice_all;

public class prac36to40 {
	public static void prac_36(){
//36、	一个球从100米高自由落下，每次落地后，反弹回原高度的一半，再落下，再反弹。求它第10次落地后反弹多高？
		double a=100;
		int i=0;
		while(i<10){
			a=a/2;
			i++;
		}
		System.out.println(a);
	}
	
	
	public static void prac_37(){
		//37、	有1020个西瓜，第一天卖掉一半多两个，以后每天卖剩下的一半多两个，问几天后可以卖完，请编程计算
		int b=1020;
		int a=0;
		for(;b>0;a++){
			b=b/2-2;
		}
		System.out.println(a);
	}

	
	public static void prac_38(){
		//38、	有一堆零件（100到200之间），如果分成4个零件一组的若干组，则多2个零件；
		//若分成7个零件一组，则多3个零件；若分成9个零件一组，则多5个零件。求这堆零件总数
		for(int a=100;a<=200;a++){
			if(a%4==2&&a%7==3&&a%9==5)
				System.out.println(a);
		}
	}
	
	
	public static void prac_39(){
		//39、	输出10至100之间每位数的乘积大于每位数的和的数
		for(int a=10;a<100;a++){
			int g=a%10;
			int s=a/10;
			if(g*s>g+s)
				System.out.println(a);
			
		}
	}
	
	public static void prac_40(){
		//40、	求s=a+aa+aaa+aaaa+aaaaa的值。其中a是接收键盘输入的1~9中的某个数字。
		//例如：输入2按回车，求2+22+222+2222+22222的值
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
