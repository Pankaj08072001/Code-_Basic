package Pratics;

class pankaj{
private int x ; 
private int y;
 
  pankaj(int n , int m ){
	x = n;
	y = m;
}
public void setData() {
	System.out.println(x);
	System.out.println(y);
}

}
class Test {
public static void main(String[] args) {
	pankaj t = new pankaj(5,6);
      t.setData();
}
}