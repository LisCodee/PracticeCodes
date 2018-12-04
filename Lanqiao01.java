package test;

import java.util.Scanner;

public class Lanqiao01 {
	public static int distance(int N, int a, int b){
        int i1 = 0; // a的行数
        int i2 = 0; // b的行数
        int j1 = 0; // a的列数
        int j2 = 0; // b的列数
        
        if(a%N != 0) i1 = a/N;
        else i1 = a/N-1;
        if(b%N != 0) i2 = b/N;
        else i2 = b/N-1;

        if(i1%2!=0) j1 = a-i1*N-1;
        else j1 = (i1+1)*N-a;
        if(i2%2!=0) j2 = b-i2*N-1;
        else j2 = (i2+1)*N-b;
        
        int distance = Math.abs(i1-i2) + Math.abs(j1-j2);
        return distance;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(distance(N, a, b));
        scanner.close();
    }
}
