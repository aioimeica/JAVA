package prac_add;

public class add106to110 {
	public static void add_106(){
//		106��	���ӳ������⣺
//		107��	���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬������񫣬�ֶ����һ����
//		�ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ�����Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ����
//		����10���������ٳ�ʱ��ֻʣ��һ�������ˡ����һ�칲ժ�˶��٣�
		double n=1;
		for(int i=0;i<9;i++){
			n=(n+1)*2;
		}System.out.println(n);

	}
	
	
	public static void add_108(){
//		108��	��ӡͼ��
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
