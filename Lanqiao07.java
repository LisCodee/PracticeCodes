package test;

import java.util.Scanner;

public class Lanqiao07 {
	public static void main(String[] args) {
		int n,flag = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		while(panduan(arr)==false) {
			arr = add(arr);
			flag++;
		}
		System.out.println(flag);
		
	}
	
	

	private static int[] add(int[] arr) {
		int Max = searchMax(arr);
		for(int i =0;i<arr.length;i++) {
			if(i == Max)
				continue;
			arr[i]++;
		}
		return arr;
	}

	

	private static boolean panduan(int[] arr) {
		int a = arr[0],i = 1;
		for( ;i<arr.length;i++) {
			if(arr[i] == a)
				continue;
			else
				return false;
		}
		if(i == arr.length) {
			return true;
		}
		return false;
	}

	private static int searchMax(int[] arr) {
		int max = arr[0];
		int i =0;
		int Max_flag = 0;
		for(;i<arr.length;i++) {
			if(arr[i]<=max)
				continue;
			else {
				max = arr[i];
				Max_flag = i;
			}
		}
		return Max_flag;
	}
	

}
