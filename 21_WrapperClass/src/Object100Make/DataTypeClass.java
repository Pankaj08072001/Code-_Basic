package Object100Make;

public class DataTypeClass {
	public static void main(String[] args) {
		Byte b1 = new Byte("10");
		Byte b2 = new Byte("20");
		
		System.out.println("b1.equals(b2) :- "+(b1.equals(b2))); // false
		Byte b3 = new Byte("10");
		System.out.println("b1.equlas(b3) :- " + (b1.equals(b3))); // true
		
		Short s1 = new Short ("10");
		Short s2 = new Short ("10");

		System.out.println("s1.compareTo(s2) :- "+(s1.compareTo(s2))); // 0
		
		Short s3 = new Short ("11");
		System.out.println("s1.compareTo(s3) :- "+(s1.compareTo(s3))); // -1 
		
		Short s4 = new Short ("9");
		System.out.println("s1.compareTo(s4) :- "+(s1.compareTo(s4))); // 1
		
		System.out.println("********************For Interger class ******************");
		String s = Integer.toOctalString(10);
		System.out.println("s1 :- "+s);// 12
		
		String s0 = Integer.toHexString(10);
		System.out.println("s1 :- "+s0);// a
		
		Integer i1 = new Integer ("10");
		Integer i2 = new Integer ("10");

		System.out.println("i1.compareTo(i2) :- "+(i1.compareTo(i2))); // 0
		
		Integer i3 = new Integer ("11");
		System.out.println("i1.compareTo(i3) :- "+(i1.compareTo(i3))); // -1 
		
		Integer i4 = new Integer ("9");
		System.out.println("i1.compareTo(i4) :- "+(i1.compareTo(i4))); // 1
		
		int i5 = Integer.parseInt("20");
		System.out.println("i1 :- "+i5);
		
		
		Long l1 = new Long (10);
		Long l2 = new Long (20);
		
		Long l3 = l1+l2;
		
		System.out.println("l1 == l3 :- "+(l1 == l3)); // false
		System.out.println("l2 == l3 :- "+(l2 == l3)); // false
	}
}
