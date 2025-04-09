package Pratics;

	public class DonotChange {
		
	    public static int roundToNextTen(int num) {
	        if (num % 10 == 0) {
	            return num;
	        } else {
	            return num + (10 - (num % 10));
	        }
	    }

	    static int sumRoundedNumbers(int a, int b, int c) {
	    	if (a <= 0 || b <= 0  || c <= 0){
	    		return -1;
	    	}
	    	else {
	        int roundedA = roundToNextTen(a);
	        int roundedB = roundToNextTen(b);
	        int roundedC = roundToNextTen(c);
	        return roundedA + roundedB + roundedC;
	    
	    	}
	    }
	     public static void main(String[] args) {
	        System.out.println(sumRoundedNumbers(61, 25, 34));  // 140
	        System.out.println(sumRoundedNumbers(61, -25, 34)); // -1
	        System.out.println(sumRoundedNumbers(60, 25, 30));  // 120
	    }
     }
