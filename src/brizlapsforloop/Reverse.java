package brizlapsforloop;
//1. 2. Write a Program to reverse the integer number eg. Input n=231 reverse is 132
public class Reverse {
     public static void main(String args[]) {
    	 int num=132;
    	 int rem=0;
    	 int rev=0;
    	 for(int i=0;i<=num;i++) {
    		 rem=num%10;
    		 rev=rev*10+rem;
    		 num=num/10;
    	 }
    	 System.out.println(rev);
     }
}
