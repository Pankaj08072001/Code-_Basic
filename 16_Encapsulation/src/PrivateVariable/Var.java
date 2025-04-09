package PrivateVariable;
class Test {
	private int x ;
	private int y ;
	public void setX(int x ) {
		this.x = x;
		
	}
    public void setY(int y) {
	this.y = y;
	}
	
	public void getX() {
		System.out.println(x);
		
	}
	public void getY() {
		System.out.println(y);
	}
//	void setData(int x , int y){
//		this.x = x;
//		this.y = y ;
//	}
//	
//	void Display () {
//		System.out.println("The value of private x is :" + x);
//		System.out.println("The value of private y is :" + y);
//	}
//	
}
public class Var {
public static void main(String[] args) {
	Test t = new Test ();
	t.setX(10);
	t.setY(5);
	t.getX();
	t.getY();
//	t.Display();
//	t.setData(5, 8);
//	t.Display();
   }
}
