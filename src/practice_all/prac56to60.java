package practice_all;

import java.util.Arrays;

public class prac56to60 {
	public static void prac_56(){
//56��	����һ������Ϊ10���������飬��ֵΪ{21,45,38,66,73,14,55,99,85,10}��������Ԫ�ص�ƽ��ֵ
		int[] a={21,45,38,66,73,14,55,99,85,10};
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		double avg=sum/a.length;
		System.out.println(avg);
		
	}
	
	
	public static void prac_57(){
	//57��	�붨��һ��2��3�е�int���͵����飬��ֵΪ{{1,2,3}��{2,4,6}}������ÿ��Ԫ��ȫ�������ʾ
		int[][] a={{1,2,3},{2,4,6}};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void prac_58(){
		int sum=0;
		int[][] a={{1,2,3},{2,4,6}};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				sum+=a[i][j];
			}
		}
		System.out.println(sum);
	}
	
	
	
	public static void prac_59(){
		//59��	�붨��һ��4��4�е�int���͵����飬��Խ�����Ԫ�صĺ�
		int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int sum=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+"\t");
				if(i+j==a.length-1||i==j){
					sum+=a[i][j];
				}
			}
			System.out.println();
		}
		System.out.println(sum);
	}
	
	
	public static void prac_60(){
		//60��	����һ������Ϊ10���������飬��ֵΪ{21,45,38,66,73,14,55,99,85,10}��
		//����Ԫ�ش�С�����˳�������ʾ
		int[] a={21,45,38,66,73,14,55,99,85,10};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
