package prac_add;

public class add106to110 {
	public static void add_106(){
//		106、	猴子吃桃问题：
//		107、	猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个；
//		第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。
//		到第10天早上想再吃时，只剩下一个桃子了。求第一天共摘了多少？
		double n=1;
		for(int i=0;i<9;i++){
			n=(n+1)*2;
		}System.out.println(n);

	}
	
	
	public static void add_108(){
//		108、	打印图案
//		                1
//		            1	2	1
//		        1	2	4	2	1
//		    1	2	4	8	4	2	1
//		1	2 	4	8	16	8	4	2	1
		for(int i=1;i<=5;i++){
			for(int k=0;k<=2*(5-i);k++){
				System.out.print(" ");
				}

			for(int j=0;j<=i-1;j++){
				 System.out.print((int)Math.pow(2, j)+" ");
				 if(j>=i-1){
					 for(int l=j;l>=1;l--){
						 System.out.print((int)Math.pow(2, l-1)+" ");
					 }
				 }
				 
			}
			
			System.out.println();
		}
	}
}
