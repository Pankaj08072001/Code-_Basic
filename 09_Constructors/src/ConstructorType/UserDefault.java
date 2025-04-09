package ConstructorType;
class Demo {
	int id ;
	String name;
//user define default const. used to set the default value in btn multiply value
	Demo(){ 
		System.out.println("default user constructor");
	}
	
	Demo(int id , String name){ // parameter const.
	this.id= id; // The this keyword refers to the current object in a method or constructor.
	this.name = name;	
	}
}

public class UserDefault {
public static void main(String[] args) {
	Demo d = new Demo(101,"pankaj");
	Demo d1 = new Demo();
	System.out.println(d.id);
	System.out.println(d.name);
}
}
/* Main Used to constructor to asign the value Instance variable . 
 * 
 * The most common use of the this keyword is to eliminate 
 * the confusion between class attributes and parameters with the same name 
 * 
 * when const not present in the program then compiler create itself by default const.
 * 
 * when create more the one const. then this is called const overloading 
 * */