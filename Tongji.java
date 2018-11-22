package test;

import java.util.Scanner;

public class Tongji {
	public static void main(String[] args) {
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("输入字符串：");
		s = sc.nextLine();
		char str[] = s.toCharArray();
		int word = 0,num = 0,other = 0;
		for(int i = 0;i<str.length;i++) {
			if((str[i]>='a'&&str[i]<='z')||(str[i]>='A'&&str[i]<='Z')) {
				if(i<str.length-1) {
					if(str[i+1] == ' '||str[i+1] == '.'||str[i+1] == '!') {
						word++;
					}					
				}else
					if(i == str.length-1) {
						word++;
					}
			}else
				if(str[i]>='0'&&str[i]<='9') {
					num++;
				}
				else {
					other++;
				}
		}
		System.out.println("单词有" + word +"个");
		System.out.println("数字有" + num +"个");
		System.out.println("其他字符有" + other +"个");
	}
	/**
	 * output:
	 * 输入字符串：
	 * i am 13 years old.
	 * 单词有4个
	 * 数字有2个
	 * 其他字符有5个
	 */
}
