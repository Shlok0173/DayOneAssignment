package brizlapsifelse;

import java.util.Scanner;

//  Read a Number 1,10,100,1000 and display unit, ten hundred
public class UnitTenHundred {
         public static void main(String args[]) {
        	Scanner sc=new Scanner(System.in) ;
        	 int unit=0;
        	 int tenhundred=0;
        	 int num=sc.nextInt();
        	 if(num%10==0) {
        		 System.out.println("Unit");
        	 }else if(num%1000==0){
        		 System.out.println("ten hundred");
        	 }
        	 else {
        		 System.out.println("invalid");
        	 }
         }
}
