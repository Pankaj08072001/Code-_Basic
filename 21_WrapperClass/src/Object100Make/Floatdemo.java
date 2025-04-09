package Object100Make;

public class Floatdemo {
	public static void main(String[] args) {
	      Float f1 = new Float(10.67f);
	      Float f2 = new Float(23.45f);
	      Float f3 = f1 + f2;
	      System.out.println("f1 == f3 :- " + (f1 == f3)); // false
	      System.out.println("f2 == f3 :- " + (f2 == f3)); // false
//****************************************
	      Double d1 = newDouble(12.34);
	      Double d2 = newDouble(45.67);
	      Double d3 = d1 + d2;
	      System.out.println("d1 == d3 :- " + (d1 == d3));
	      System.out.println("d2 == d3 :- " + (d2 == d3));
   }
}