package practice_all;

public class prac26to30 {
	public static void prac_26(){
		//26、	统计1000以内所有能被2整除又能被5整除的数
		for(int i=1;i<=1000;i++){
			if(i%5==0&&i%2==0){
				System.out.println(i);
			}
		}
	}
	
	public static void prac_27(){
		//27、	打印100以内所有能被3整除的数，每5个数打印一行
		int b=0;
		for(int a=1;a<=100;a++){
			if(a%3==0){
			System.out.print(a+" ");
			b++;
			if(b%5==0)
				System.out.println();
			}
		}
	}
	
	
	public static void prac_28(){
		//28、	判断某个整数是否为素数。（素数是一个大于1且只能被1和它本身整除的整数）
		int b=13,c=0;
		for(int a=2;a<b;a++){
			if(b%a==0)
				c++;
		}
		if(c>0)
			System.out.println("no");
		else
			System.out.println("yes");
	}
	
	public static void prac_29(){
		//29、	判断某个整数是否为完全数。（完全数：所有小于该
		//数本身的因子之和等于该数本身，例如6是一个完全数，因为，6=1+2+3）
		int a=10,sum=0;
		for(int b=1;b<a;b++){
			if(a%b==0)
				sum+=b;
		}
		if(a==sum)
			System.out.println("yes");
		else
			System.out.println("no");
	}
	
	public static void prac_30(){
		//30、	输出1000以内的所有水仙花数。（水仙花数是一个三位数，
		//该数各位的立方和等于该数本身。例如153是一个水仙花数，因为153 = 13 + 53 + 33）
		for(int a=100;a<1000;a++){
			int b=a/100;
			int s=a/10%10;
			int g=a%10;
			if(a==b*b*b+s*s*s+g*g*g)
				System.out.println(a);
			
		}
	}
}
