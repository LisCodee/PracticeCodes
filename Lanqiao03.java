package test;

import java.util.Scanner;
import java.util.Stack;

public class Lanqiao03 {
	  public static void main(String[] args) {
	         Scanner input = new Scanner(System.in);
	         String strA = input.next();
	         String strB = input.next();
	         input.close();
	         game(strA, strB);
	    }
	 
	    private static void game(String strA, String strB) {
	        Stack<String> stack = new Stack<String>();
	        while(true){
	            while(true){
	                String a = strA.substring(0, 1); 
	                strA = strA.substring(1);  
	                String temp = isWin(stack, a, strA);  
	                if(temp.equals(strA)){  
	                    break;
	                }else{
	                    strA = temp;    
	                }
	            }
	            if(strA.length() == 0 ){   
	                break;
	            }
	            while(true){
	                String b = strB.substring(0, 1);
	                strB = strB.substring(1);
	                String temp = isWin(stack, b, strB);
	                if(temp.equals(strB)){
	                    break;
	                }else{
	                    strB = temp;
	                }
	            }
	            if(strB.length() == 0){
	                break;
	            }
	        }

	        if(strA.length() > strB.length()){   
	            System.out.println(strA);
	        }else{
	            System.out.println(strB);
	        }
	    }

	    private static String isWin(Stack stack, String a, String str) {
	        if(stack.search(a)>0){   //如果存在和a一样的牌
	            str += a;    
	            while(true){
	                String temp = (String)stack.pop();   
	                str += temp;    
	                if(temp.equals(a)){   
	                    break;
	                }
	            }
	        }else{
	            stack.push(a);   
	        }
	        return str;   
	    }

}
