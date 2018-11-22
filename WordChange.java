package test;

import java.util.Scanner;

public class WordChange {
	public static void main(String[] args) {
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("ÊäÈëÒ»¸ö×Ö·û´®£º");
		s = sc.next();
		char a[] = s.toCharArray();
		for(int i = 0;i<a.length;i++) {
			if(a[i] >= 'a'&&a[i] <= 'z') {
				a[i] = (char) (a[i] - 32);
				continue;
			}
			if(a[i] >= 'A'&&a[i] <= 'Z') {
				a[i] = (char) (a[i] + 32);
				continue;
			}
		}
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

}
