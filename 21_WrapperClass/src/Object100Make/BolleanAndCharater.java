package Object100Make;

public class BolleanAndCharater {
	public static void main(String[] args) {
	      Boolean boolean1 = new Boolean(true);
	      Boolean boolean2 = new Boolean(false);
	      System.out.println("boolean1 :- " + boolean1);
	      System.out.println("boolean2 :- " + boolean2);
	      Boolean boolean3 = new Boolean("true");
	      Boolean boolean4 = new Boolean("false");
	      Boolean boolean5 = new Boolean(null);
	      Boolean boolean6 = new Boolean("abc");
	      System.out.println("boolean3 :- " + boolean3);
	      System.out.println("boolean4 :- " + boolean4);
	      System.out.println("boolean5 :- " + boolean5);
	      System.out.println("boolean6 :- " + boolean6);
	      
//*********************************************************
	      Character character1 = new Character('A');
	      System.out.println("character1 :- " + character1);
	      System.out.println("Character.MIN_VALUE in Hexadecimal:- \\u" +
	         Integer.toHexString(Character.MIN_VALUE | 0x10000).substring(1));
	      System.out.println("Character.MIN_VALUE in Decimal :- " + (int) Character.MIN_VALUE);
	      System.out.println("Character.MAX_VALUE in Hexadecimal:- \\u" +
	         Integer.toHexString(Character.MAX_VALUE | 0x10000).substring(1));
	      System.out.println("Character.MAX_VALUE in Decimal :- " + (int) Character.MAX_VALUE);
	      System.out.println("Character.SIZE :- " + Character.SIZE);
	      System.out.println("Character.BYTE :- " + Character.BYTES);
	      Character character2 = Character.valueOf('V');
	      System.out.println("charcter2 :- " + character2);
	      char c1 = character2.charValue();
	      System.out.println("c1 :- " + c1);
	      System.out.println("character1.hashCode() :- " + character1.hashCode());
	      System.out.println("Having different char value :- " + character1.equals(character2));
	      Character character3 = new Character('V');
	      System.out.println("Having same char value :- " + character2.equals(character3));
	      System.out.println("A[65] - V[86] :- " + character1.compareTo(character2));
	      System.out.println("V[86] - A[65] :- " + character2.compareTo(character1));
	      System.out.println("V[86] - V[86] :- " + character2.compareTo(character3));
	   }
}
