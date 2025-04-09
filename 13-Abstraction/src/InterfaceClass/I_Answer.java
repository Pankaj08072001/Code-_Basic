package InterfaceClass;

interface Maths
  {
	int length = 5;
	int breath = 6;
	
	void area();
	
	void square();
	
	void cube();
  }

	class I_Answer implements Maths {
		@Override
		public void area() {
		System.out.println("Area : " + length * breath);
		}

		@Override
		public void square() {
		System.out.println("Square : " + (length * length));
		
	    }

	    @Override
	    public void cube() {
		System.out.println("Cube : " + (breath * breath * breath ));
		
	    }
	    
	    I_Answer(){
	    	System.out.println("I am const:");
	    }
        public static void main(String[] args) {
        	I_Answer I = new I_Answer();
        	I.area();
        	I.cube();
        	I.square();
       }	
  }

