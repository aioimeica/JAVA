package practice_all;
import java.util.*;
public class prac51to55 {
public static void prac_51(){
	//51��	����һ������Ϊ10���������飬��ֵΪ{21,45,38,66,73,14,55,99,85,10}��������ÿ��Ԫ��ȫ�������ʾ
	int[] a={21,45,38,66,73,14,55,99,85,10};
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
	}
}


public static void prac_52(){
//52��	����һ������Ϊ10���������飬��ֵΪ{21,45,38,66,73,14,55,99,85,10}��
	//������ÿ��Ԫ�����������ʾ
	int[] a={21,45,38,66,73,14,55,99,85,10};
	for(int i=a.length-1;i>=0;i--){
		System.out.print(a[i]+" ");
	}
}


public static void prac_53(){
	//53��	����һ������Ϊ10���������飬��ֵΪ{21,45,38,66,73,14,55,99,85,10}���������ֵ
	int[] a={21,45,38,66,73,14,55,99,85,10};
	Arrays.sort(a);
	System.out.println(a.length-1);
}


public static void prac_54(){
	//54��	����һ������Ϊ10���������飬��ֵΪ{21,45,38,66,73,14,55,99,85,10}��������Сֵ
	int[] a={21,45,38,66,73,14,55,99,85,10};
	Arrays.sort(a);
	System.out.println(a[0]);
}


public static void prac_55(){
	//55��	����һ������Ϊ10���������飬��ֵΪ{21,45,38,66,73,14,55,99,85,10}��������Ԫ�صĺ�
	int[] a={21,45,38,66,73,14,55,99,85,10};
	int sum=0;
	for(int i=0;i<a.length;i++){
		sum+=a[i];
	}
	System.out.println(sum);
}
}
