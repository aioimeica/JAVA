package practice_all;
import java.util.*;
public class prac_update {
	public static void up_1(){
		//1��	�붨��4�����ͱ���������ӡ�����4�������ļӡ������ˡ�����Ľ��
		int a=1,b=2,c=3,d=4;
		int sum=a+b+c+d;
		int j=a-b-c-d;
		int cheng=a*b*c*d;
		double shang=(double)a/b/c/d;
		System.out.println("�ͣ�"+sum);
		System.out.println("�"+j);
		System.out.println("����"+cheng);
		System.out.println("�̣�"+shang);
	}
	
	public static void up_6(){
		//6��	��ռ�����֮��ľ��롣����ʾ���ռ�һ�㣨x,y,z������������ʵ��������
		int x1=0,y1=2,z1=5;
		int x2=5,y2=5,z2=5;
		double d=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)+(z2-z1)*(z2-z1));
		System.out.println(d);
	}
	
	public static void up_17(){
		//17��	����һ��С��100000�����֣��ж�����λ��
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
		//19��	��д����ⷽ�� ax+b=0
		int a=5,b=4;
		double x=0;
		x=-(double)b/a;
		System.out.println(x);
	}
	
	
	
	public static void up_20(){
		//20��	�ж��������������a,b,c�ܹ����������ε�����
		int a=3,b=4,c=5;
		if(a+b>c||a+c>b||b+c>a)
			System.out.println("��");
		else
			System.out.println("����");
	}
	
	
	public static void up_21(){
//		21��	��д����ⷽ��ax2+bx+c=0
		int a=1,b=4,c=2;
		double d=b*b-4*a*c;
		double x1=0,x2=0;
		if(d>0){
			x1=(double)((-b)+Math.sqrt(d))/(2*a);
			x2=(double)((-b)-Math.sqrt(d))/(2*a);
			System.out.println("��һԪ���η����������⣻�ֱ���x1="+x1+"  "+"x2="+x2);
		}
		else if(d==0){
			x1=x2=(double)-b/(2*a);
		System.out.println("��һԪ���η�������ֻ��һ���⣬x="+x1);}
		else
			System.out.println("��һԪ���η����޽�");
	}
	
	public static void up_23(){
//		23��	���һ���򵥵ļ���������Ҫ������û��Ӽ�������ı��ʽ�� 
//		   ������1  �����op   ������2 
//		���㲢������ʽ��ֵ���趨�������Ϊ��+������-������*������/������%����(��
		System.out.println("������");
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
		//24��	�Ӽ�������һ����m���ж����Ƿ��ܱ��Ӽ��������a��b������
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
		//25��	�ж�һ�������ǲ���ż��
		int a=10;
		if(a%2==0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
	
	
	
	public static void up_26(){
		//26��	�ж�һ�����ǲ�������
		int a=10;
		if(a%2==0)
			System.out.println("no");
		else
			System.out.println("yes");
	}
	
	
	
	public static void up_27(){
		//27��	��дһ�����򣬹����ǴӼ�������һ���������ж����Ƿ��λ��������ǣ��ʹ�ӡ�������ף�
		Scanner in=new Scanner(System.in);
		System.out.println("������");
		int a=in.nextInt();
		if(a>=10&&a<100){
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}
	
	
	
	public static void up_28(){
		//28��	�Ӽ��̶���һ�������ж������������������������"+"���Ǹ���������"-"
		Scanner in=new Scanner(System.in);
		System.out.println("������");
		int a=in.nextInt();
		if(a>0)
			System.out.println("+");
		else
			System.out.println("-");
	}
	
	
	
	public static void up_30(){
//30��	��дһ�����򣬹����ǴӼ�������1��12�е�ĳһ�����֣��ɵ��Դ�ӡ�����Ӧ���·ݵ�Ӣ�����ơ�January 
//February March April May June July August September Ocotober 
		//November December
		Scanner in=new Scanner(System.in);
		System.out.println("������");
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
		default:System.out.println("��������");
		break;
		}
	}
	
	
	public static void up_34(){
		//34��	��1��100֮�������ż���ĺ͡�
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%2==0)
				sum+=i;
		}
		System.out.println(sum);
	}
	
	
	public static void up_35(){
		//34��	��1��100֮������������ĺ͡�
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%2!=0)
				sum+=i;
		}
		System.out.println(sum);
	}
	
	
	
	public static void up_59(){
		//59��	��ӡͼ�Σ��ѣ�
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
		//62��	��ӡ100���ڵ�����������ÿ5������ӡһ�С���������һ������1��ֻ�ܱ�1��������������������
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
		
		//63��	��ǰ50�������ĺ͡���������һ������1��ֻ�ܱ�1��������������������
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
		//64��	�ж�101~200֮���ж��ٸ������������������������������һ������1��ֻ�ܱ�1��������������������
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
		System.out.println("101~200֮��һ����"+num+"������");
	}
	
	
	
	
	public static void up_65(){
		//65��	��100���ڵ����������ĺ�
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
//		66��	ͳ��1000������ȫ���ĸ�����
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
//		67��	���ʵ�ִ�ӡ���ѣ�
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
//		68��	���ʵ�ִ�ӡ���ѣ�
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
		//69��	����1000������ȫ���ĺ͡�
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
		//70��	��1+2!+3!+...+20!�ĺͣ��ѣ�
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
		//72��	�붨��һ������Ϊ4��String���͵����飬��ֵΪ{a,b,c,d}��������ÿ��Ԫ��˳�����
		String[] str1={"a","b","c","d"};
		for(int i=0;i<str1.length;i++){
			System.out.print(str1[i]+" ");
		}
	}
	
	
	public static void up_76(){
		//76��	���岢��ʼ��һ������Ϊ10���������飬��ӡ���е����������λ�úš�
		int[] a={10,45,38,66,73,14,55,99,85,10};
		int max=a[0];
		int index=0;
		for(int i=0;i+1<a.length;i++){
			if(a[i+1]>max){
				max=a[i+1];
				index=i+1;
			}
		}
		System.out.println("�������"+max);
		System.out.println("С�����"+index);
	}
	
	
	
	public static void up_77(){
		//77��	������������Ϊ4���ַ������鲢��ʼ�����ϲ��������鲢����ϲ�������顣
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
		//78��	��д����Ҫ������20��ѧ���ĳɼ�����������
		//����Щ�������浽�����У���������е���ͷ֡���߷ּ�ƽ����
		int[] a={60,56,78,52,54,65,58,79,85,95,46,76,87,65,88,89,75,64,25,100};
		int max=a[0];
		int min=a[0];
		int sum=0;
		for(int i=0;i+1<a.length;i++){
			if(a[i+1]>max)
				max=a[i+1];
		}
		System.out.println("��߷��ǣ�"+max);
		for(int i=0;i+1<a.length;i++){
			if(a[i+1]<min)
				min=a[i+1];
		}
		System.out.println("��ͷ��ǣ�"+min);
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		System.out.println("ƽ�����ǣ�"+(double)sum/a.length);
	}
	
	
	public static void up_79(){
		//79��	���ʵ�ֽ�a�����е�һ��Ԫ���ƶ�������ĩβ����������������ǰƽ��һ��λ�á�
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
		//80��	�����Ѿ��ź��������a���������������������һ����������x�����x����������a�У�
		//���xԪ��ɾ����Ҫ��������Ȼ����
		System.out.println("������");
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
	
	
	//�ַ���
	public static void up_81(){
		//81��	��д������������ֳ�ʼ��һ���ַ�����Ȼ����ͬһ���У�
		//������ӡ3�Σ�����֮���ÿո�ָ�������John John John.��
		String name="aioimeica";
		for(int a=1;a<=3;a++){
			System.out.print(name+" ");
		}
	}
	
	
	public static void up_82(){
		//82��	����2�����룬�жϸ����������Ƿ�һ��
		String str1="abc123";
		String str2="abc12";
		System.out.println(str1.equals(str2));
	}
	
	
	public static void up_83(){
		//83��	������ܣ��������ⳤ�ȵ����룬������������
		Scanner in=new Scanner(System.in);
		System.out.println("����������");
		String str1=in.next();
		for(int i=str1.length()-1;i>=0;i--){
			System.out.print(str1.charAt(i));
		}
	}
	
	
	public static void up_84(){
//		84��	����һ�ַ�����ͳ�Ƹ��ַ��������ֵĸ���
		String str="abc123";
		int a=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0'&&str.charAt(i)<='9')
				a++;
		}
		System.out.println("��"+a+"������");
	}
	
	
	
	public static void up_85(){
		//85��	��д�����ж��û�������ַ����Ƿ�Ϊ���Ĵ���
		//����ʾ�������ַ����Ǿ��л������Ե��ַ����������ַ����������Ҷ��ʹ��������һ������12321��
		System.out.println("������");
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
			System.out.println("���Ǹ����Ĵ�");
		else
			System.out.println("�ⲻ�Ǹ����Ĵ�");
	}
	
	
	public static void up_86(){
		//86��	��дһ��Ӧ�ó����������ַ������в����������е�Сд��ĸ��Ϊ��Ӧ�Ĵ�д��ĸ 
		System.out.println("������");
		Scanner in=new Scanner(System.in);
		String str1=in.next();
		System.out.println(str1.toUpperCase());
	}
	
	
	
	public static void up_87(){
//		87��	����һ�ַ������ֱ�ͳ���ַ����д�д��ĸ��Сд��ĸ�ĸ���
		System.out.println("������");
		Scanner in=new Scanner(System.in);
		String str1=in.next();
		int num1=0,num2=0;
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)>='a'&&str1.charAt(i)<='z')
				num1++;
			if(str1.charAt(i)>='A'&&str1.charAt(i)<='Z')
				num2++;
		}
		System.out.println("Сд��ĸ�У�"+num1);
		System.out.println("��д��ĸ�У�"+num2);
	}
	
	
	public static void up_88(){
		//88��	���������ַ������Ƚ������ַ����ĳ��ȣ�����ϳ����ַ�����
		//�������ַ���������ͬ���������һ���ַ��� 
		System.out.println("������");
		Scanner in=new Scanner(System.in);
		String str1=in.next();
		String str2=in.next();
		if(str1.length()>=str2.length())
			System.out.println(str1);
		else
			System.out.println(str2);
	}
	
	
	public static void up_89(){
		//89��	����һ�ַ���������ַ����е�һ��������ĸa��λ�ã���û�������-1
		System.out.println("������");
		Scanner in=new Scanner(System.in);
		String str1=in.next();
		System.out.println(str1.indexOf("a"));
		
	}
	
	
	public static void up_90(){
		//90��	����һ�ַ��������ַ���������hi�Ӵ��滻�ɡ�hello����������ַ���
		System.out.println("������");
		Scanner in=new Scanner(System.in);
		String str1=in.next();
		System.out.println(str1.replaceAll("hi", "hello"));
		
	}
	
	
	
	//����
	public static int up_91_1(int a,int b){
		//91��	���������������ֵ����Ҫ�����Զ���һ�������������ֵ�ķ�����
		if(a>b)
			return a;
		else
			return b;
	}
	
	
	
}
