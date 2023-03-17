package brizlapsarrayhandling;
//Java Program to print the smallest element in an array
public class Smallest {
        public static void main(String args[]) {
        	int arr[]= {1,2,3,42,444,222,11,4};
        	int min=arr[0];
        	for(int i=0;i<arr.length;i++) {
        		if(arr[i]<min) {
        			min=arr[i];
        		}
        	}
        	System.out.println("Smallest Number= "+min);
        }
}
