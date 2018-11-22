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
		long start=System.currentTimeMillis(); //��ȡ��ʼʱ��
		num = digui(n)%10007;
		System.out.println(num);
	    long end=System.currentTimeMillis(); //��ȡ����ʱ��	 
	    System.out.println("��������ʱ�䣺 "+(end-start)+"ms"); 

	}
	/**
	 * output:
	 * 40
	 * 2573
 	 * ��������ʱ�䣺 359ms
	 */

}

