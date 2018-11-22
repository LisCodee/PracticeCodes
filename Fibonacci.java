package test;

import java.util.Scanner;

public class Fibonacci {
	static int digui(int n) {
		if(n == 1||n == 2) {
			return 1;
		}else {			
			return digui(n-1) + digui(n-2);
		}
	}
	
	public static void main(String[] args) {
		int n,num;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		long start=System.currentTimeMillis(); //获取开始时间
		num = digui(n)%10007;
		System.out.println(num);
	    long end=System.currentTimeMillis(); //获取结束时间	 
	    System.out.println("程序运行时间： "+(end-start)+"ms"); 

	}
	/**
	 * output:
	 * 40
	 * 2573
 	 * 程序运行时间： 359ms
	 */

}

