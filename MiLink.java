package test;

import java.util.Scanner;

public class MiLink {
	public static void main(String[] args) {
		int k,n,num = 0,i=0,j=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("��������k��N��");
		k = sc.nextInt();
		n = sc.nextInt();
		String N = Integer.toBinaryString(n);		//������תΪ�������ַ���
		char a[] = N.toCharArray();
		for(i = a.length-1,j=0;i>=0;i--,j++) 
				num += (int) ((int) (a[i]-48) * Math.pow(k,j));		//������ASCII���ֵΪ48
		System.out.println(num);
	}
	/**
	 * output��
	 * ��������k��N��
	 * 3 100
	 * 981
	 */
}
