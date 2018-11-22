package test;

import java.util.Scanner;

public class LeetCodeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int [n];
		nums[0] = 2;
		nums[1] = 7;
		nums[2] = 11;
		nums[3] = 15;
		int target = 9;
		for(int i = 0;i<nums.length;i++) {
			for(int j = i;j<nums.length;j++) {
				if(nums[i] + nums[j] == target) {
					System.out.println("[" + i + "," + j + "]");
				}
			}
		}
	}
}
