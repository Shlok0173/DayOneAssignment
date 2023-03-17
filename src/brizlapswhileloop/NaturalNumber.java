package brizlapswhileloop;
//1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
public class NaturalNumber {
       public static void main(String args[]) {
    	   int num=5;
    	   int sum=0;
    	   int i=1;
    	   while(i<num) {
    		   sum=sum+i;
    		   i++;
    		 
    	   }
    	   System.out.println(sum);
       }
}
