package test;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		int n;
		System.out.println("输入三角形的阶数：");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[][] = new int [n][n];
		for(int i = 0;i<a.length;i++) {
			a[i][0] = 1;
		}
		for(int i = 1;i<a.length;i++) {
			for(int j = 1;j<i+1;j++) {
				a[i][j] = a[i-1][j-1] + a[i-1][j];
			}
		}
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<i+1;j++) {
				System.out.print(a[i][j]  + "     ");
			}
			System.out.println();
		}
		
	}
	/**
	 * output:
	 * 输入三角形的阶数：
	 * 4
	 * 1     
 	 * 1     1     
	 * 1     2     1     
	 * 1     3     3     1     
	 */

}
