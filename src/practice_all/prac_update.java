package practice_all;
import java.util.*;
public class prac_update {
	public static void up_1(){
		//1、	请定义4个整型变量，并打印输出这4个变量的加、减、乘、除后的结果
		int a=1,b=2,c=3,d=4;
		int sum=a+b+c+d;
		int j=a-b-c-d;
		int cheng=a*b*c*d;
		double shang=(double)a/b/c/d;
		System.out.println("和："+sum);
		System.out.println("差："+j);
		System.out.println("积："+cheng);
		System.out.println("商："+shang);
	}
	
	public static void up_6(){
		//6、	求空间两点之间的距离。（提示：空间一点（x,y,z），可由三个实数来描述
		int x1=0,y1=2,z1=5;
		int x2=5,y2=5,z2=5;
		double d=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)+(z2-z1)*(z2-z1));
		System.out.println(d);
	}
	
	public static void up_17(){
		//17、	输入一个小于100000的数字，判断他的位数
		int a=455565;
		int b=a;
		int num=0;
		for(int i=0;true;i++){
			if(a<10){
				num=0;
				break;}
			b=b/10;
			num++;
			if(b<10&&b>0)
				break;
		}
		System.out.println(num+1);
	}
	
	
	
	public static void up_19(){
		//19、	编写程序解方程 ax+b=0
		int a=5,b=4;
		double x=0;
		x=-(double)b/a;
		System.out.println(x);
	}
	
	
	
	public static void up_20(){
		//20、	判断输入的三个整数a,b,c能够构成三角形的三边
		int a=3,b=4,c=5;
		if(a+b>c||a+c>b||b+c>a)
			System.out.println("能");
		else
			System.out.println("不能");
	}
	
	
	public static void up_21(){
//		21、	编写程序解方程ax2+bx+c=0
		int a=1,b=4,c=2;
		double d=b*b-4*a*c;
		double x1=0,x2=0;
		if(d>0){
			x1=(double)((-b)+Math.sqrt(d))/(2*a);
			x2=(double)((-b)-Math.sqrt(d))/(2*a);
			System.out.println("该一元二次方程有两个解；分别是x1="+x1+"  "+"x2="+x2);
		}
		else if(d==0){
			x1=x2=(double)-b/(2*a);
		System.out.println("该一元二次方程有且只有一个解，x="+x1);}
		else
			System.out.println("该一元二次方程无解");
	}
	
	public static void up_23(){
//		23、	设计一个简单的计算器程序，要求根据用户从键盘输入的表达式： 
//		   操作数1  运算符op   操作数2 
//		计算并输出表达式的值，设定的运算符为（+）、（-）、（*）、（/）、（%）。(难
		System.out.println("请输入");
		Scanner in=new Scanner(System.in);
		double a=in.nextDouble();
		String b=in.next();
		double c=in.nextDouble();
		if(b.equals("+"))
		System.out.println(a+"+"+c+"="+(a+c));
		if(b.equals("-"))
			System.out.println(a+"-"+c+"="+(a-c));
		if(b.equals("*"))
			System.out.println(a+"*"+c+"="+(a*c));
		if(b.equals("/"))
			System.out.println(a+"/"+c+"="+(a/c));
		if(b.equals("%"))
			System.out.println(a+"%"+c+"="+(a%c));
	}
	
	
	public static void up_24(){
		//24、	从键盘输入一个数m，判断它是否能被从键盘输入的a和b整除。
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		int a=input.nextInt();
		int b=input.nextInt();
		if(a%m==0&&b%m==0)
			System.out.println("yes");
		else
			System.out.println("no");
		
	}
	
	public static void up_25(){
		//25、	判断一个整数是不是偶数
		int a=10;
		if(a%2==0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
	
	
	
	public static void up_26(){
		//26、	判断一个数是不是奇数
		int a=10;
		if(a%2==0)
			System.out.println("no");
		else
			System.out.println("yes");
	}
	
	
	
	public static void up_27(){
		//27、	编写一个程序，功能是从键盘输入一个整数，判断它是否二位数，如果是，就打印它。（易）
		Scanner in=new Scanner(System.in);
		System.out.println("请输入");
		int a=in.nextInt();
		if(a>=10&&a<100){
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}
	
	
	
	public static void up_28(){
		//28、	从键盘读入一个数，判断它的正负。是正数，则输出"+"，是负数，则输"-"
		Scanner in=new Scanner(System.in);
		System.out.println("请输入");
		int a=in.nextInt();
		if(a>0)
			System.out.println("+");
		else
			System.out.println("-");
	}
	
	
	
	public static void up_30(){
//30、	编写一个程序，功能是从键盘输入1—12中的某一个数字，由电脑打印出其对应的月份的英语名称。January 
//February March April May June July August September Ocotober 
		//November December
		Scanner in=new Scanner(System.in);
		System.out.println("请输入");
		int a=in.nextInt();
		switch(a){
		case 1:System.out.println("January");
		break;
		case 2:System.out.println("February");
		break;
		case 3:System.out.println("March");
		break;
		case 4:System.out.println("April");
		break;
		case 5:System.out.println("May");
		break;
		case 6:System.out.println("June");
		break;
		case 7:System.out.println("July");
		break;
		case 8:System.out.println("August");
		break;
		case 9:System.out.println("September");
		break;
		case 10:System.out.println("Ocotober");
		break;
		case 11:System.out.println("November");
		break;
		case 12:System.out.println("December");
		break;
		default:System.out.println("输入有误");
		break;
		}
	}
	
	
	public static void up_34(){
		//34、	求1到100之间的所有偶数的和。
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%2==0)
				sum+=i;
		}
		System.out.println(sum);
	}
	
	
	public static void up_35(){
		//34、	求1到100之间的所有奇数的和。
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%2!=0)
				sum+=i;
		}
		System.out.println(sum);
	}
	
	
	
	public static void up_59(){
		//59、	打印图形（难）
//		A
//		BBB
//		CCCCC
//		DDDDDDD
//		EEEEEEEEE
		
		for(char ch1='A';ch1<='E';ch1++){
			for(int a=1;a<=2*(ch1-'A')+1;a++)
				System.out.print(ch1+" ");
			System.out.println();
			}
	}
	
	
	public static void up_62(){
		//62、	打印100以内的所有素数，每5个数打印一行。（素数是一个大于1且只能被1和它本身整除的整数）
		int j=1;
		System.out.print(2+" ");
		for(int a=3;a<=100;a++){
		for(int i=2;i<a;i++){
			if(a%i==0){
				break;
			}
			if(i==a-1){
				System.out.print(a+" ");
				j++;
				if(j%5==0)
					System.out.println();
			}
		}
	}
	}
	
	
	public static void up_63(){
		
		//63、	求前50个素数的和。（素数是一个大于1且只能被1和它本身整除的整数）
		int num=1,sum=2;
		for(int a=3;true;a++){
		for(int i=2;i<a;i++){
			if(a%i==0){
				break;
			}
			if(i==a-1){
				num++;
				sum+=i;
			}
		}
		if(num>50)
			break;
	}
		System.out.println(sum);
	}
	
	public static void up_64(){
		//64、	判断101~200之间有多少个素数，并输出所有素数。（素数是一个大于1且只能被1和它本身整除的整数）
		int num=0;
		for(int a=101;a<=200;a++){
			for(int i=2;i<a;i++){
				if(a%i==0){
					break;
				}
				if(i==a-1){
					System.out.print(a+" ");
					num++;
				}
			}
		}
		System.out.println("101~200之间一共有"+num+"个素数");
	}
	
	
	
	
	public static void up_65(){
		//65、	求100以内的所有素数的和
		int sum=2;
		for(int a=3;a<=100;a++){
		for(int i=2;i<a;i++){
			if(a%i==0){
				break;
			}
			if(i==a-1)
				sum+=a;
		}
	}
		System.out.println(sum);
	}
	
	
	public static void up_66(){
//		66、	统计1000以内完全数的个数。
		int num=0;
		int sum=0;
		for(int a=2;a<=1000;a++){
		for(int i=1;i<a;i++){
			if(a%i==0)
				sum+=i;
		}
		if(sum==a){
			num++;
		}
		sum=0;
	}
		System.out.println(num);
	}
	
	
	public static void up_67(){
//		67、	编程实现打印（难）
//		 *
//		***
//	   *****
//	  *******
// 	 *********
		for(int i=0;i<5;i++){
			for(int k=0;k<=4-i;k++){
				System.out.print(" ");
				}

			for(int j=0;j<=i;j++){
				 System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void up_68(){
//		68、	编程实现打印（难）
//		 1
//		222
//	   33333
//	  4444444
//	 555555555
		for(int i=1;i<=5;i++){
			for(int k=0;k<=5-i;k++){
				System.out.print(" ");
				}

			for(int j=1;j<=i;j++){
				 System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void up_69(){
		//69、	计算1000以内完全数的和。
		int sum=0;
		int add=0;
		for(int a=2;a<=1000;a++){
		for(int i=1;i<a;i++){
			if(a%i==0)
				sum+=i;
		}
		if(sum==a){
			add+=a;
		}
		sum=0;
	}
		System.out.println(add);
	}
	
	
	
	public static void up_70(){
		//70、	求1+2!+3!+...+20!的和（难）
		int sum=0;
		int sum2=1;
		for(int i=1;i<=20;i++){
			for(int j=1;j<=i;j++){
				sum2=sum2*j;
			}
			sum+=sum2;
		}
		System.out.println(sum);
	}
	
	
	public static void up_72(){
		//72、	请定义一个长度为4的String类型的数组，其值为{a,b,c,d}，并将其每个元素顺序输出
		String[] str1={"a","b","c","d"};
		for(int i=0;i<str1.length;i++){
			System.out.print(str1[i]+" ");
		}
	}
	
	
	public static void up_76(){
		//76、	定义并初始化一个长度为10的整型数组，打印其中的最大数及其位置号。
		int[] a={10,45,38,66,73,14,55,99,85,10};
		int max=a[0];
		int index=0;
		for(int i=0;i+1<a.length;i++){
			if(a[i+1]>max){
				max=a[i+1];
				index=i+1;
			}
		}
		System.out.println("最大数是"+max);
		System.out.println("小标号是"+index);
	}
	
	
	
	public static void up_77(){
		//77、	定义两个长度为4的字符串数组并初始化，合并两个数组并输出合并后的数组。
		String[] a={"a","b","c","d"};
		String[] b={"e","f","g","h"};
		String[] c=new String[8];
		for(int i=0;i<c.length;i++){
			if(i<a.length)
				c[i]=a[i];
			else
				c[i]=b[i-b.length];
		}
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
		
	}
	
	
	public static void up_78(){
		//78、	编写程序，要求输入20个学生的成绩（整数），
		//将这些整数保存到数组中，再输出其中的最低分、最高分及平均分
		int[] a={60,56,78,52,54,65,58,79,85,95,46,76,87,65,88,89,75,64,25,100};
		int max=a[0];
		int min=a[0];
		int sum=0;
		for(int i=0;i+1<a.length;i++){
			if(a[i+1]>max)
				max=a[i+1];
		}
		System.out.println("最高分是："+max);
		for(int i=0;i+1<a.length;i++){
			if(a[i+1]<min)
				min=a[i+1];
		}
		System.out.println("最低分是："+min);
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		System.out.println("平均分是："+(double)sum/a.length);
	}
	
	
	public static void up_79(){
		//79、	编程实现将a数组中第一个元素移动到数组末尾，其余数据依次往前平移一个位置。
		int[] a={1,2,3,4};
		int b=a[0];
		for(int i=0;i+1<a.length;i++){
			a[i]=a[i+1];
		}
		a[a.length-1]=b;
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	
	public static void up_80(){
		//80、	对于已经排好序的数组a（假设数组递增），输入一个测试数据x，如果x存在于数组a中，
		//则把x元素删除，要求数组仍然有序
		System.out.println("请输入");
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int[] a={1,2,3,4};
		int[] b=new int[4];
		int j=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==x){
				j++;
				continue;
			}
			b[i-j]=a[i];
		}
		for(int k=0;k<(b.length-j);k++){
			System.out.print(b[k]+" ");
		}
	}
	
	
	//字符串
	public static void up_81(){
		//81、	编写程序，用你的名字初始化一个字符串，然后在同一行中，
		//把它打印3次，他们之间用空格分隔开，如John John John.。
		String name="aioimeica";
		for(int a=1;a<=3;a++){
			System.out.print(name+" ");
		}
	}
	
	
	public static void up_82(){
		//82、	输入2串密码，判断该两串密码是否一致
		String str1="abc123";
		String str2="abc12";
		System.out.println(str1.equals(str2));
	}
	
	
	public static void up_83(){
		//83、	反向加密：输入任意长度的密码，输出反向的密码
		Scanner in=new Scanner(System.in);
		System.out.println("请输入密码");
		String str1=in.next();
		for(int i=str1.length()-1;i>=0;i--){
			System.out.print(str1.charAt(i));
		}
	}
	
	
	public static void up_84(){
//		84、	输入一字符串，统计该字符串中数字的个数
		String str="abc123";
		int a=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0'&&str.charAt(i)<='9')
				a++;
		}
		System.out.println("有"+a+"个数字");
	}
	
	
	
	public static void up_85(){
		//85、	编写程序，判断用户输入的字符串是否为回文串。
		//（提示：回文字符串是具有回文特性的字符串：即该字符串从左向右读和从右向左读一样，如12321）
		System.out.println("请输入");
		Scanner in=new Scanner(System.in);
		String str1=in.next();
		boolean b=true;
		for(int a=0;a<str1.length();a++){
			if(str1.charAt(a)==str1.charAt(str1.length()-1-a))
				b=true;
			else{
				b=false;
				break;
			}
		}
		if(b==true)
			System.out.println("这是个回文串");
		else
			System.out.println("这不是个回文串");
	}
	
	
	public static void up_86(){
		//86、	编写一个应用程序对输入的字符串进行操作，将其中的小写字母改为相应的大写字母 
		System.out.println("请输入");
		Scanner in=new Scanner(System.in);
		String str1=in.next();
		System.out.println(str1.toUpperCase());
	}
	
	
	
	public static void up_87(){
//		87、	输入一字符串，分别统计字符串中大写字母和小写字母的个数
		System.out.println("请输入");
		Scanner in=new Scanner(System.in);
		String str1=in.next();
		int num1=0,num2=0;
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)>='a'&&str1.charAt(i)<='z')
				num1++;
			if(str1.charAt(i)>='A'&&str1.charAt(i)<='Z')
				num2++;
		}
		System.out.println("小写字母有："+num1);
		System.out.println("大写字母有："+num2);
	}
	
	
	public static void up_88(){
		//88、	输入两个字符串，比较两个字符串的长度，输出较长的字符串。
		//若两个字符串长度相同，则输出第一个字符串 
		System.out.println("请输入");
		Scanner in=new Scanner(System.in);
		String str1=in.next();
		String str2=in.next();
		if(str1.length()>=str2.length())
			System.out.println(str1);
		else
			System.out.println(str2);
	}
	
	
	public static void up_89(){
		//89、	输入一字符串，输出字符串中第一个出现字母a的位置，如没有则输出-1
		System.out.println("请输入");
		Scanner in=new Scanner(System.in);
		String str1=in.next();
		System.out.println(str1.indexOf("a"));
		
	}
	
	
	public static void up_90(){
		//90、	输入一字符串，将字符串中所有hi子串替换成“hello”，输出新字符串
		System.out.println("请输入");
		Scanner in=new Scanner(System.in);
		String str1=in.next();
		System.out.println(str1.replaceAll("hi", "hello"));
		
	}
	
	
	
	//方法
	public static int up_91_1(int a,int b){
		//91、	求三个整数中最大值。（要求：先自定义一个求两数中最大值的方法）
		if(a>b)
			return a;
		else
			return b;
	}
	
	
	
}
