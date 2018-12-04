package test;

public class str01 {
	public static void main(String[] args	) {
		int num = 31;
		for(int i = 0;i<=num;i++) {
			String str = Integer.toBinaryString(i);
			if(str.length()!=5) {
				for(int j = 0;j<5-str.length();j++)
					System.out.print(0);
			}
			System.out.println(str);
		}
	}

}
