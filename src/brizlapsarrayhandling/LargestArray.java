package brizlapsarrayhandling;
//3) Java Program to print the largest element in an array
public class LargestArray {
     public static void main(String args[]) {
    	 int arr[]= {12,23,33,444,55,33,44,3};
    	 int max=0;
    	 for(int i=0;i<arr.length;i++) {
    			 if(arr[i]>max) {
    				 max=arr[i];
    			 }
    	 }
    	 System.out.println("Largest Number are="+max);
    	
     }
}
