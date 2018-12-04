package test;

import java.text.NumberFormat;
import java.util.Scanner;

public class Lanqiao06 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		String str[] = new String[n];
		for(int i = 0;i<str.length;i++) {
			str[i] = sc.next();
		}
		int right = 0;
		for(int i = 0;i<str.length;i++) {
			char arr[] = str[i].toCharArray();
			for(int j = 1;j<arr.length;j++) {
				char tmp = arr[0];
				if(tmp == arr[j])
					right++;
			}
		}
		double score =(double) right/(double)n;
		NumberFormat nt = NumberFormat.getPercentInstance();
		nt.setMinimumFractionDigits(2);
		System.out.println(nt.format(score));
		sc.close();
	}

}
