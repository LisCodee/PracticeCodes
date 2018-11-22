package test;

import java.util.Scanner;

public class Fibonacci2 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		long start = System.currentTimeMillis();
		int a[] = new int[n+1];
		a[1] = a[2] = 1;
		if(n == 1||n == 2) {
			System.out.println(a[1]);
		}else {
			for(int i = 3;i<=n;i++) {
				a[i] = a[i-1] + a[i-2];
			}			
			System.out.println(a[n]%10007);
		}
		long end = System.currentTimeMillis();
		System.out.println("运行时间：" + (start-end) + "ms");
	}
	/**
	 * output:
	 * 40
	 * 2573
	 * 运行时间：0ms
	 */

}
