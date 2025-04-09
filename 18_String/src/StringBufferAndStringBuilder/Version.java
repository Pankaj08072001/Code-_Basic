package StringBufferAndStringBuilder;

public class Version {
    public static void main(String[] args) {
//    	StringBuffer s1 = new StringBuffer("Hello"); // 1.5version
//		StringBuffer s2 = s1.append("JTC");
//
//		System.out.println("s1 :- "+s1);
//		System.out.println("s2 :- "+s2);
//		System.out.println("s1 == s2 :- "+(s1 == s2));
		
//		System.out.println("**********************************");
//		StringBuffer s1 = new StringBuffer();
//		System.out.println("s1.capacity :- "+s1.capacity());// 16
//
//		StringBuffer s2 = new StringBuffer(20);
//		System.out.println("s2.capacity :- "+s2.capacity());// 20
//
//		StringBuffer s3 = new StringBuffer("JTC");
//		System.out.println("s3.capacity :- "+s3.capacity());// 19
//		
		
		StringBuffer s1 = new StringBuffer();
		System.out.println("s1.capacity :- "+s1.capacity());// 16
		System.out.println("s1.length :- "+s1.length()); // 0
		
		s1.append("1234567890111213");
		System.out.println("s1.capacity :- "+s1.capacity());// 16
		System.out.println("s1.length :- "+s1.length()); // 16

		s1.append("14");
		System.out.println("s1.capacity :- "+s1.capacity());// 34
		System.out.println("s1.length :- "+s1.length()); // 18

		s1.append("1516171819202122232425");
		System.out.println("s1.capacity :- "+s1.capacity());// 70
		System.out.println("s1.length :- "+s1.length()); // 40

		s1.append("1234567890123456789012345678901");
		System.out.println("s1.capacity :- "+s1.capacity());// 142
		System.out.println("s1.length :- "+s1.length()); // 71

	}
}
