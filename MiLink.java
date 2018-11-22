package test;

import java.util.Scanner;

public class MiLink {
	public static void main(String[] args) {
		int k,n,num = 0,i=0,j=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("依次输入k和N：");
		k = sc.nextInt();
		n = sc.nextInt();
		String N = Integer.toBinaryString(n);		//将此数转为二进制字符串
		char a[] = N.toCharArray();
		for(i = a.length-1,j=0;i>=0;i--,j++) 
				num += (int) ((int) (a[i]-48) * Math.pow(k,j));		//数字与ASCII码差值为48
		System.out.println(num);
	}
	/**
	 * output：
	 * 依次输入k和N：
	 * 3 100
	 * 981
	 */
}
