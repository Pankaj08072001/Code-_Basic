package Pratics;

    class Same {
	private final int pnkj;
	Same(int num ){
		pnkj= num;
		System.out.println("Consturct caling :" +num);
	}
	
	private static final int n;
	static {
		n = 25;
		System.out.println("Static block calling :" + n+1);
	    }
	final int z ;
	{
		z = 15;
		System.out.println(z);
	}
	
	final void meth() {
		System.out.println("I am final method");
	    }
    } 

    public class Test1 extends Same {
    	Test1(int num) {
	    	super(num);
		    System.out.println("I am child class const");
	     }

   public static void main(String[] args) {
	  Test1 t = new Test1(6);
	  t.meth();
	  System.out.println();

	  }
 }
