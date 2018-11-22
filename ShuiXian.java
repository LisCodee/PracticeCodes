package test;

import java.util.Scanner;

public class ShuiXian {
	public static void main(String[] args) {
		int num,sum = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		String str = Integer.toString(num);
		char s[] = str.toCharArray();
		for(int i = 0;i<s.length;i++) {
			sum += Math.pow((s[i]-48), 3);
		}
		if(sum == num) {
			System.out.println("是一个水仙花数！");
		}else {
			System.out.println("不是一个水仙花数！");
		}
	}
	/**
	 * output:
	 * 153
	 * 是一个水仙花数！
	 */

}
