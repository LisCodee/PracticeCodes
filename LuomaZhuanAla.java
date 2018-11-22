package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
  *  将一个罗马字符串转化为其对应值的阿拉伯数字
  *  I: 1	V:5 	X:10 	L:50	C:100	D:500	M:1000
  *  左减右加（如IV:4		VI:6)
  * @author 1376417539
  *
  */
public class LuomaZhuanAla {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		String key = new String();
		Scanner sc = new Scanner(System.in);
		key = sc.nextLine();
		char luoma[] = key.toCharArray();
		int sum = 0;
		for(int i = 0;i<luoma.length;i++) {
			if(i!=luoma.length-1) {
				if((int) map.get(luoma[i]) < (int) map.get(luoma[i+1])) {
					sum -= (int) map.get(luoma[i]);
				}
				else {
					sum += (int) map.get(luoma[i]);
				}
			}
			else {
				sum += (int) map.get(luoma[i]);
			}
		}
		System.out.println(sum);
	}
}
