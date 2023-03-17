package brizlapsarrayhandling;
//2) Java Program to find the frequency of each element in the array
public class Frequency {
       public static void main(String args[] ) {
             int arr[]= {1,2,3,4,2,1,3,2,1,2,3,2,4};
             int count=1;
             int move=-1;
     	  for(int i=0;i<arr.length;i++) {
    		  for(int j=i+1;j<arr.length;j++) {
    			  if(arr[i]==arr[j]) {
    				  count++;
    				  arr[i]=move;
    			  }
    			 
    		  }
    		  
    		      if(arr[i]!=move) {
    			  arr[i]=count;
    		  }
    		  
    	  }
     	     for(int i=0;i<arr.length;i++) {
     	    	 System.out.println(arr[i]);
     		 
     	  }
       }
}
