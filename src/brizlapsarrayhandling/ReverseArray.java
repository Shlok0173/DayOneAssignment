package brizlapsarrayhandling;
//6) Java Program to print the elements of an array in reverse order
public class ReverseArray {
            public static void main(String args[]) {
            	int arr[]= {1,2,3,4,5,6,7,8,9};
            	System.out.println("print originaal array");
            	for(int i=0;i<arr.length;i++) {
            		System.out.print(arr[i]+" ");
            	}
            	int temp=0;
            	for(int i=0;i<arr.length;i++) {
            		for(int j=i+1;j<arr.length;j++) {
            		 temp=arr[j];
            		 arr[j]=arr[i];
            		 arr[i]=temp;
            		}
            		System.out.println();
            		System.out.print(arr[i]+ " ");
            		
            		
            	}
            }
}
