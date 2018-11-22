package test;

import java.util.Scanner;

public class Shuju {
	public static void main(String[] args	) {
		double d,a;
		Scanner sc = new Scanner(System.in);
		d = sc.nextDouble();
		a = sc.nextDouble();
		double num;
		num = d * Math.sin(Math.PI*(a/360));
		System.out.println(num);
	}

}
