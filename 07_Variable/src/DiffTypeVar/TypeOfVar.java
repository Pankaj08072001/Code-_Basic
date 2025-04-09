package DiffTypeVar;
class IMV{
	static int num3= 7;  // Static variable always declare with static keyword .
	
	int num1 = 5; // Instance variable because they are used outside the method. 
	int num2 = 10;
	public int sum() {
		System.out.println(num1+num2);
	return 0;	
	}
}
public class TypeOfVar {
public static void main(String[] args) {
	int n = 5;			    // n is Local variable because    
	System.out.println(n);  // they are used inside the block.
	
	IMV i = new IMV();   //for call instance variable must have create obj of that class .
	i.sum();             // Method call
	
	System.out.println(IMV.num3);  // Static variable call with class name 
}
}
/* Quest.  Type of Variable?
 * 1 . variable declared inside the body of the method is called local variable.   
 * 2 . Instance variable declared inside the class but outside the body of the method. 
 * 3 . static variable that is declared as static is called a static variable. 
 *     It cannot be local. You can create a single copy of the static variable 
 *     and share it among all the instances of the class. 
 *     Memory allocation for static variables happens only once 
 *     when the class is loaded in the memory.
 * */
