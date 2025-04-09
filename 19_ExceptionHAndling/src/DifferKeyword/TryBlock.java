package DifferKeyword;

public class TryBlock {
	public static void main(String[] args) {
      try {
    	  int a = 10;
    	  int b = 0;  // 2 then ans is 5, finally block
    	  int c = a/b;
    	  System.out.println(c);
      }
      catch(ArithmeticException e){
    //	  this block only when excute when Exception will rise 
    	  System.out.println("Our exception msg");
      }  
      finally {
    	/*  this block always excute even return statement is present only one condition when call
    	call the System.exit() meth */
    	  System.out.println("compalsary code lick connection closed");
      }
   }
}
