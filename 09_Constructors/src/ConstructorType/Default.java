package ConstructorType;

public class Default {
	      int id;
		  String name;

		  // constructor is special function
		  Default() {
		    System.out.println("Constructor Called:");
		    name ="pankaj";

		  }

     public static void main(String[] args) {
    	 // constructor is invoked while creating an object of the Default class
		 Default obj = new Default();
		 System.out.println("The name is " + obj.name);
		 }
	}

