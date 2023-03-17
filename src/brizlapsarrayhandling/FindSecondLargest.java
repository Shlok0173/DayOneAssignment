package brizlapsarrayhandling;

public class FindSecondLargest {
         public static void main(String args[]) {
        	 int arr[]= {12,11,34,55,5,67};
        	 int largest=arr[0];
        	 for(int i=0;i<arr.length;i=i+2) {
        		 for(int j=i+1;j<arr.length;j++) {
        		 if(arr[i]>largest) {
        			 largest=arr[i];
        			 arr[i]=arr[j];
        			 arr[j]=largest;
        		 }
        		 }
        		 
        	 }
        	 System.out.println(largest);
         }
}
