package test;

import java.util.Scanner;

public class SuShu {
	public static void main(String[] args) {
		int n,sum = 2;
		System.out.println("����һ��������(>2):");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 3;i<=n;i++) {
			int j = 2;
			for(;j<=i/2;j++) {
				if(i%j == 0)
					break;
			}
			if(j > i/2)
				sum += i;
		}
		System.out.println(sum);
	}
	/**
	 * output:
	 * ����һ��������(>2):
	 * 100
	 * 1060
	 */
}
