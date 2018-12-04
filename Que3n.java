package test;

import java.util.Scanner;

public class Que3n {
	public static void main(String[] args) {
		int i ,j;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		j = sc.nextInt();
		long start = System.currentTimeMillis();
		System.out.println(i + " " + j + " " + getCirLen(i,j));
		long ends = System.currentTimeMillis();
		System.out.println("运行时间是" + (ends-start) + "ms");
		sc.close();
	}
	private static int getCirLen(int i,int j) {
		int CirLen = 0;
		for(int k = i;k<=j;k++	) {
			int tmp = k,flag = 0;
			while(tmp!=1) {
				if(tmp%2 == 0)
					tmp /=2;
				else
					tmp = tmp*3+1;
				flag++;
			}
			if(CirLen<++flag)
				CirLen = flag;
		}
		return CirLen;
	}
}
