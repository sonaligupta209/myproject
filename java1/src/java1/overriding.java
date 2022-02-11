
package java1;
public class overriding {
	 

	    void show() 

	    { 

	        System.out.println("Parent's show()"); 

	    } 
	} 

	  
	// Inherited class 

	class Child extends overriding { 

	    // This method overrides show() of Parent 

	    @Override

	    void show() 

	    { 

	        System.out.println("Child's show()"); 

	    } 
	} 

	  
	// Driver class 

	class Main { 

	    public static void main(String[] args) 

	    { 

	        // If a Parent type reference refers 

	        // to a Parent object, then Parent's 

	        // show is called 

	        overriding obj1 = new overriding(); 

	        obj1.show(); 

	  

	        

	        Child obj2 = new Child(); 

	        obj2.show(); 

	    } 
	} 


