package MethodOverloading;

//Java Example: Compile Time Polymorphism is also methods overloading.
/* Compile-time polymorphism is also known as static polymorphism and it is implemented by
   method overloading.
*/
	class Overloading {
	public int addition(int x, int y) {
	 return x + y;
	}

	public int addition(int x, int y, int z) {
	 return x + y + z;
	}

	public double addition(double x, double y) {
	return x + y;
	}

    public static void main(String[] args) {
    	Overloading  number = new Overloading();

        int res1 = number.addition(444, 555);
        System.out.println("Addition of two integers: " + res1);

        int res2 = number.addition(333, 444, 555);
        System.out.println("Addition of three integers: " + res2);

        double res3 = number.addition(10.15, 20.22);
        System.out.println("Addition of two doubles: " + res3);
    }
 }