package practice_all;

public class prac41to45 {

	
	public static void prac_41(){
		//41、	打印5行5列的星号图形
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
	}
	
	public static void prac_42(){
		//42、	打印图形（较难）
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"\t");
			}
			System.out.println();
		}
	}
	
	
	public static void prac_43(){
		//43、	打印字母图形
		for(char ch='A';ch<='E';ch++){
			for(char ch1='A';ch1<=ch;ch1++){
				System.out.print(ch+"\t");
			}
			System.out.println();
		}
	}
	
	public static void prac_44(){
		//44、	打印图形（较难
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
	
	public static void prac_45(){
		//45、	打印字母图形
		for(char ch='A';ch<='E';ch++){
			for(char ch1='A';ch1<=ch;ch1++){
				System.out.print(ch1+"\t");
			}
			System.out.println();
		}

	}
}
