package UseOfFinal;
/* Final variables: When a variable is declared as final, its value cannot be changed once 
 it has been initialized. This is useful for declaring constants or other values that 
 should not be modified.
* Final methods: When a method is declared as final, it cannot be overridden by a subclass. 
  This is useful for methods that are part of a class’s public API and should not be modified
 by subclasses.
* Final classes: When a class is declared as final, it cannot be extended by a subclass. This 
is useful for classes that are intended to be used as is and should not be modified or 
extended.
* Initialization: Final variables must be initialized either at the time of declaration or in 
the constructor of the class. This ensures that the value of the variable is set and cannot 
be changed.
* Performance: The use of a final can sometimes improve performance, as the compiler can 
optimize the code more effectively when it knows that a variable or method cannot be changed.
* Security: The final can help improve security by preventing malicious code from modifying 
  sensitive data or behavior.
 */
	// Java Program to demonstrate Different
	// Ways of Initializing a final Variable

	// Main class 
final class Final {
	  
	    // a final variable
	    // direct initialize
	    final int THRESHOLD = 5;
	    
	    // a blank final variable
	    final int CAPACITY;
	    
	    // another blank final variable
	    final int  MINIMUM;
	    
	    // a final static variable PI
	    // direct initialize
	    static final double PI = 3.141592653589793;
	    
	    // a  blank final static  variable
	    static final double EULERCONSTANT;
	    
	    // instance initializer block for 
	    // initializing CAPACITY
	    {
	        CAPACITY = 25;
	    }
	    
	    // static initializer block for 
	    // initializing EULERCONSTANT
	    static{
	        EULERCONSTANT = 2.3;
	    }
	    
	    // constructor for initializing MINIMUM
	    // Note that if there are more than one
	    // constructor, you must initialize MINIMUM
	    // in them also
	    public Final () 
	    {
	        MINIMUM = -1;
	    }
	        
	}
