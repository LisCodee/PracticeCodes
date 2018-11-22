package test;

import java.util.Scanner;

public class Shuixianhua {
	public static void main(String[] args) {
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		s = sc.next();
		char a[] = s.toCharArray();
		for(int i = 0;i<a.length;i++) {
			if(a[i]>'9'||a[i]<'0') {		//如果输入的不是一个整数，则输出输入错误
				System.out.println("Input Error!");
				return;
			}
		}
		int i,j;
		for(j = a.length-1,i = 0;i<a.length/2;i++,j--) {	//从头和尾同时开始比较，一直到中间的一个或两个数
			if(a[i] != a[j]) {			//如果有一个不相等，则输入不是
				System.out.println("不是一个水仙花数！");
				return;
			}
		}			//如果结束的i值大于等于数组长度的1/2，则说明是一个水仙花数
		if(i>=a.length/2)
			System.out.println("是一个水仙花数。");
	}
	/**
	 * output1：
	 * 请输入一个整数：
	 * 123.321
	 * Input Error!
	 * 
	 * output2:
	 * 请输入一个整数：
	 * 123321
 	 * 是一个水仙花数。 
	 */
}
