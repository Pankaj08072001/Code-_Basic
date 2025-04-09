package Pratics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class QuestF {
	public static void main(String[] args)throws Exception {
		File fis = new File("F:\\new fd\\Pankaj.txt");
		System.out.println( fis.isFile());
		FileInputStream Fis = new FileInputStream("D:\\Learnjava\\EvenOdd.java");
		byte b [] = Fis.readAllBytes();
		String s = new String (b);
		//System.out.println(s);
		s +="\n\n pankaj\nHimanshu";
		FileOutputStream fos = new FileOutputStream("D:\\ram\\Hello.txt");
		byte [] b2 = s.getBytes();
		fos.write(b2);
		System.out.println("done");
		
		
	}
}
