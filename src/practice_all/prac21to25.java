package practice_all;

public class prac21to25 {

	public static void prac_21(){
		//21��	��1��100���ۼӺ͡�
		int sum=0;
		for(int a=1;a<=100;a++){
			sum+=a;
		}
		System.out.println(sum);
	}
	
	public static void prac_22(){
		//22��	��1000���������ܱ�5�����������ĺ�
		int sum=0;
		for(int a=1;a<=1000;a++){
			if(a%5==0)
				sum+=a;
			
		}
		System.out.println(sum);
	}
	
	public static void prac_23(){
		//23��	��10�Ľ׳�
		int j=1;
		for(int a=1;a<=10;a++){
			j*=a;
		}
		System.out.println(j);
	}
	
	public static void prac_24(){
		//24��	���26��СдӢ����ĸ
		
		for(char ch='a';ch<='z';ch++){
			System.out.print(ch+" ");
		}
	}
	
	public static void prac_25(){
		//25��	ͳ��1000���������ܱ�7����������
		for(int a=1;a<=1000;a++)
		{
			if(a%7==0)
				System.out.print(a+" ");
		}
	}
}
