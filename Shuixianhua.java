package test;

import java.util.Scanner;

public class Shuixianhua {
	public static void main(String[] args) {
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������");
		s = sc.next();
		char a[] = s.toCharArray();
		for(int i = 0;i<a.length;i++) {
			if(a[i]>'9'||a[i]<'0') {		//�������Ĳ���һ��������������������
				System.out.println("Input Error!");
				return;
			}
		}
		int i,j;
		for(j = a.length-1,i = 0;i<a.length/2;i++,j--) {	//��ͷ��βͬʱ��ʼ�Ƚϣ�һֱ���м��һ����������
			if(a[i] != a[j]) {			//�����һ������ȣ������벻��
				System.out.println("����һ��ˮ�ɻ�����");
				return;
			}
		}			//���������iֵ���ڵ������鳤�ȵ�1/2����˵����һ��ˮ�ɻ���
		if(i>=a.length/2)
			System.out.println("��һ��ˮ�ɻ�����");
	}
	/**
	 * output1��
	 * ������һ��������
	 * 123.321
	 * Input Error!
	 * 
	 * output2:
	 * ������һ��������
	 * 123321
 	 * ��һ��ˮ�ɻ����� 
	 */
}
