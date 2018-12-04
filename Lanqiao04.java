package test;

import java.util.Scanner;

public class Lanqiao04 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		int answer1,answer2;
		if(a>b) {
			answer1 = a - b;
			answer2 = 360 - answer1;
			if(Math.abs(answer1)>Math.abs(answer2)) {
				System.out.println(answer2);
			}
			else if(Math.abs(answer1)<Math.abs(answer2)) {
				System.out.println(answer1);
			}
			else {
				if(answer1>0)
					System.out.println(answer1);
				else if(answer2>0)
					System.out.println(answer2);
			}		
		}
		else {
			answer1 = b - a;
			answer2 = answer1 - 360;
			if(Math.abs(answer1)>Math.abs(answer2)) {
				System.out.println(answer2);
			}
			else if(Math.abs(answer1)<Math.abs(answer2)) {
				System.out.println(answer1);
			}
			else {
				if(answer1>0)
					System.out.println(answer1);
				else if(answer2>0)
					System.out.println(answer2);
			}	
		}
		sc.close();
	}

}
