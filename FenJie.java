package test;

import java.util.ArrayList;
/**
 * 100�������ķֽ�
 * @author 1376417539
 *
 */
public class FenJie {
	static int n = 100;

	/**
	 * 
	 * @param i ��Ҫ�ֽ����
	 * @param sushu ��������
	 */
	static void fenjie(int i,ArrayList sushu) {			//�������ֽⷽ�����ݹ飩
		for(int j = 2;j<=n;j++) {
			if(sushu.contains(j))
				if(i%j == 0) {
					int s = i/j;
					if(sushu.contains(s)) {
						System.out.println( j + " * " + s);
						break;
					}							
					else {
						System.out.print( j + " * ");
						fenjie(s,sushu);
						break;
					}
				}
		}	
	}
	public static void main(String[] args) {
		ArrayList sushu = new ArrayList();
		sushu.add(2);
		for(int i = 3;i<=n;i++) {
			int j = 2;
			for(;j<=i/2;j++) {
				if(i%j == 0)
					break;
			}
			if(j > i/2)
				sushu.add(i);
		}
		for(int i = 2;i<=n;i++) {
			if(sushu.contains(i))								//�������������ֱ�����1*�����
				System.out.println(i + " = " + "1" + " * " + i);
			else {							//������зֽ�
				System.out.print(i + " = ");
				fenjie(i,sushu);			
			}
		}
	}
}