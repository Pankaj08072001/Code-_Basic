package ConstructorType;
class Test{
	Test(){
		this(4.2f);
		System.out.println("default");
	}
	Test(int a){
		System.out.println("Integer const");
	}
    Test(float a){
    	this("");
    	System.out.println("float const");
	}
    Test(String name){
    	this(7);
    	System.out.println("String const");
	}
}
public class ThisKused {
public static void main(String[] args) {
	Test t1 = new Test(4);
}
}
