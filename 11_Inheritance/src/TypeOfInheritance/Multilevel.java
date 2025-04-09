package TypeOfInheritance;
/* One parent class and one child class and child contain sub-child class... is multilevel
 * inheritance. extends keyword use for inherid  parent class .
 *
 * Why java not Supports multiple inheritance ?
 * Due to ambiguity. 
 * 
 * */

class Student {
	int reg_no;

	void getNo(int no) {
		reg_no = no;
	}

	void putNo() {
		System.out.println("registration number= " + reg_no);
	}
}

// intermediate sub class
class Marks extends Student {
	float marks;

	void getMarks(float m) {
		marks = m;
	}

	void putMarks() {
		System.out.println("marks= " + marks);
	}
}

// derived class
class Sports extends Marks {
	float score;

	void getScore(float scr) {
		score = scr;
	}

	void putScore() {
		System.out.println("score= " + score);
	}
}

public class Multilevel {
	public static void main(String args[]) {
		Sports ob = new Sports();
		ob.getNo(987);
		ob.putNo();    // Display.
		ob.getMarks(78);
		ob.putMarks(); // Display.
		ob.getScore(68.7f);
		ob.putScore(); // Display. 
	}
}
