package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream("D:\\Learnjava\\Shorted.java");
		byte b[] = fis.readAllBytes();
		String s = new String(b);
	    System.out.println(s);
//	    System.out.println(fis.available());
//	    fis.close();
//	    System.out.println(fis.available());
	    s +=  "Hello Every one this is my first ";
	    FileOutputStream fos = new FileOutputStream("d:\\LearnJava\\Demo.java");
	    byte [] b2 = s.getBytes();
	    fos.write(b2);
	    System.out.println("Done");
	    }
}
