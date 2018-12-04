package test;

import java.util.Scanner;

public class LanQiao02 {

	public static void main(String[] args) {
		int num[] = new int[100];
		Scanner sc = new Scanner(System.in);
		int i = 0;
		for(;i<num.length;i++) {
			num[i] = sc.nextInt();
			if(num[i] == -1) {
				break;
			}
		}
		sc.close();
		int len = i;
		for(int j = 0;j<=len-1;j++) {
			int sum = HappyChange(num[j]);
			while(sum>10) {
				 sum = HappyChange(sum);
			 }
			if(sum == 1) {
				System.out.println("true");
			}
			else {
				if(sum < 10 && sum != 1) {
					System.out.println("false");
					return;
				}
			}
		}
		

	}

	private static int HappyChange(int sum) {
		int num = 0;
		String str = Integer.toString(sum);
		char arr[] = str.toCharArray();
		for(int k = 0;k<arr.length;k++) {
			 num += (int) Math.pow((int)(arr[k]-48), 2); 
		}
		return num;
	}
}

