package practice_all;

public class prac16to20 {

	public static void prac_16(){
		//16、	判断某年是否为闰年。（闰年的条件是：该年的年号能被4整除
		//且不能被100整除，或该年的年号能被400整除，则该年是闰年，否则不是闰年。）
		int a=2015;
		if(a%4==0&&a%100!=0||a%400==0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
	
	public static void prac_17(){
		//17、	求下列函数中y的值
		int x=10,y=0;
		if(x>0)
			y=3*x+5;
		if(x<0)
			y=x-2;
		else
			y=10;
		System.out.println(y);
			
	}
	
	public static void prac_18(){
		//18、	根据某同学的成绩，判定其成绩的等级。（90~100分为“优秀”，80~89为“良好”
		//，70~79为“中等”，60~69为“及格”，60分以下为“不及格”。）
		int a=98;
		if(a<=100&&a>=90)
			System.out.println("优秀");
		if(a<90&&a>=80)
			System.out.println("良好");
		if(a<80&&a>=70)
			System.out.println("中等");
		if(a<70&&a>=60)
			System.out.println("及格");
		if(a<60&&a>=0)
			System.out.println("不及格");
		else
			System.out.println("输入有误");
	}
	
	public static void prac_19(){
		//19、	某超市为了促销，规定：购物不足50元的按原价付款，超过50不足100的按九折付款
		//，超过100元的，超过部分按八折付款。编一程序完成超市的自动计费的工作。
		double a=156;
		if(a<50)
			a=a;
		if(a>=50&&a<100)
			a=a*0.9;
		if(a>100)
			a=100+(a-100)*0.8;
		System.out.println(a);
	}
	
	public static void prac_20(){
		//20、	编写一个程序，功能是从键盘输入1—4中的某一个数字，
		//由电脑打印出其对应的季节的英语名称。spring summer autumn winter（较难）
		int a=3;
		switch(a){
		case 1:System.out.println("spring");break;
		case 2:System.out.println("summer");break;
		case 3:System.out.println("autumn");break;
		case 4:System.out.println("winter");break;
		default :System.out.println("输入有误");
		
		}
	}
	
	
}
