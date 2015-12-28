package practice_all;

public class prac21to25 {

	public static void prac_21(){
		//21、	求1到100的累加和。
		int sum=0;
		for(int a=1;a<=100;a++){
			sum+=a;
		}
		System.out.println(sum);
	}
	
	public static void prac_22(){
		//22、	求1000以内所有能被5整除的整数的和
		int sum=0;
		for(int a=1;a<=1000;a++){
			if(a%5==0)
				sum+=a;
			
		}
		System.out.println(sum);
	}
	
	public static void prac_23(){
		//23、	求10的阶乘
		int j=1;
		for(int a=1;a<=10;a++){
			j*=a;
		}
		System.out.println(j);
	}
	
	public static void prac_24(){
		//24、	输出26个小写英文字母
		
		for(char ch='a';ch<='z';ch++){
			System.out.print(ch+" ");
		}
	}
	
	public static void prac_25(){
		//25、	统计1000以内所有能被7整除的数。
		for(int a=1;a<=1000;a++)
		{
			if(a%7==0)
				System.out.print(a+" ");
		}
	}
}
