package practice_all;
import java.util.*;
public class prac51to55 {
public static void prac_51(){
	//51、	定义一个长度为10的整型数组，其值为{21,45,38,66,73,14,55,99,85,10}，并将其每个元素全部输出显示
	int[] a={21,45,38,66,73,14,55,99,85,10};
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
	}
}


public static void prac_52(){
//52、	定义一个长度为10的整型数组，其值为{21,45,38,66,73,14,55,99,85,10}，
	//并将其每个元素逆序输出显示
	int[] a={21,45,38,66,73,14,55,99,85,10};
	for(int i=a.length-1;i>=0;i--){
		System.out.print(a[i]+" ");
	}
}


public static void prac_53(){
	//53、	定义一个长度为10的整型数组，其值为{21,45,38,66,73,14,55,99,85,10}，求其最大值
	int[] a={21,45,38,66,73,14,55,99,85,10};
	Arrays.sort(a);
	System.out.println(a.length-1);
}


public static void prac_54(){
	//54、	定义一个长度为10的整型数组，其值为{21,45,38,66,73,14,55,99,85,10}，求其最小值
	int[] a={21,45,38,66,73,14,55,99,85,10};
	Arrays.sort(a);
	System.out.println(a[0]);
}


public static void prac_55(){
	//55、	定义一个长度为10的整型数组，其值为{21,45,38,66,73,14,55,99,85,10}，求数组元素的和
	int[] a={21,45,38,66,73,14,55,99,85,10};
	int sum=0;
	for(int i=0;i<a.length;i++){
		sum+=a[i];
	}
	System.out.println(sum);
}
}
