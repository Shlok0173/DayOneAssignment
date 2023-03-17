package brizlapsday1problem;

public class SumOfArgs {
      public static void main(String args[]) {
    	  int sum=0,count=0,number;
    	  for(int i=0;i<args.length;i++) {
    		  try {
    	   number=Integer.parseInt(args[i]);
    	   sum=sum+number;
    		  }
    		  catch(NumberFormatException e) {
    			  count++;
    		  }
      }
    	  System.out.println("sum of valid integer"+sum);
    	  System.out.println("Count of invalid integers:"+count);
} 
}
