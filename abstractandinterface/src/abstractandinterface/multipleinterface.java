package abstractandinterface;

 interface FirstInterface {
	  public void myMethod(); // interface method
	}

	interface SecondInterface {
	  public void myMethod(); // interface method
	}

	class multipleinterface implements FirstInterface,SecondInterface {
	  public void myMethod() {
	    System.out.println("Some text..");
	  }
	  
	  
	}

	class Main {
	  public static void main(String[] args) {
		  multipleinterface myObj = new multipleinterface();
	    myObj.myMethod();
	  
	  }
	}