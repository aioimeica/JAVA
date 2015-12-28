package practice_all;

public class prac46to50 {
	public static void prac_46(){
		//46、	打印九九乘法表，形式如下
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
	
	
	public static void prac_47(){
		//47、	打印九九乘法表，形式如下
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
	
	
	public static void prac_48(){
		//48、	打印100以内的所有素数。（素数是一个大于1且只能被1和它本身整除的整数）（难）
		System.out.print(2+" ");
		for(int a=3;a<=100;a++){
		for(int i=2;i<a;i++){
			if(a%i==0){
				break;
			}
			if(i==a-1)
				System.out.print(a+" ");
		}
	}
}

	
	
	public static void prac_49(){
		//49、	打印1000以内的完全数。（完全数：
		//所有小于该数本身的因子之和等于该数本身，例如6是一个完全数，因为，6=1+2+3）（
		int sum=0;
		for(int a=2;a<=1000;a++){
		for(int i=1;i<a;i++){
			if(a%i==0)
				sum+=i;
		}
		if(sum==a){
			System.out.print(a+" ");
		}
		sum=0;
	}
	}		
	
	public static void prac_50(){
		//50、	求1！+2！+3！+……+10!
		int sum=0;
		int sum2=1;
		for(int i=1;i<=10;i++){
			for(int j=1;j<=i;j++){
				sum2=sum2*j;
			}
			sum+=sum2;
		}
		System.out.println(sum);
	}
}
