package Typeof;

public class Data {
public static void main(String[] args) {
//   All are pre-drfine data type  
	byte b1 =2;                   // 1byte       
	short s = 25;                 // 2byte
	int n =2164546;               // 4byte default 
	long l =45l;                  // 8byte
	float f = 45f ;               // 4byte
	double d = 60.;                // 8byte default 
	char c = ' ';                 // 2byte
	boolean  b = false;            // 1bit  default false 
	
// User define data type	
   pankaj p1 = null;    
   pankaj p2= new pankaj();
   System.out.println(p2);
 
 
}
}
//User-define data type 
/* Two type of User-define data-type . 
* 1st is Pre-define data- type like .... Array , String , Scanner..etc
* 2nd is user-define or referenced data-type like...Pankaj ,Aman... etec 
*Store two value only ist is null and second is object of that class.
*must be class present in any package
*/