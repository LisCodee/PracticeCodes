package test;

import java.util.ArrayList;
/**
 * 100以内数的分解
 * @author 1376417539
 *
 */
public class FenJie {
	static int n = 100;

	/**
	 * 
	 * @param i 需要分解的数
	 * @param sushu 素数容器
	 */
	static void fenjie(int i,ArrayList sushu) {			//非素数分解方法（递归）
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
			if(sushu.contains(i))								//如果是素数，则直接输出1*这个数
				System.out.println(i + " = " + "1" + " * " + i);
			else {							//否则进行分解
				System.out.print(i + " = ");
				fenjie(i,sushu);			
			}
		}
	}
}