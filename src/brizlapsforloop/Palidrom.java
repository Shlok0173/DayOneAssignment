package brizlapsforloop;

import java.util.Scanner;

//3. Write a Program to find Palindrome Number
//eg. Input n=121 then after reverse output is same 121 then it is a palindrome.
//eg. Input n=321 then after reverse output is not same it's 123 then it is not a palindrome number.
public class Palidrom {
	  
	   
       public static void main(String args[]) {
    	   int n=131;
    	   int rem=0;
    	   int rev=0; 
    	   for(int i=0;i<=n;i++) {
    		   rem=n%10;
    		   rev=rev*10+rem;
    		   n=n/10;
    	   }
    	   System.out.println(rev);
    	   if(rev==n) {
    		   System.out.println("Number Are Palidrom");
    	   }else {
    		   System.out.println("Number Are Not Palidrom");
    	   }
}
}
