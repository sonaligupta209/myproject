package lambdaexpression;
import java.util.function.Consumer;
import java.util.ArrayList;

class OUTER1 {
	public static ArrayList<String> a;

	void new1(){
	ArrayList <String> a= new ArrayList<String>();
	}

static abstract  class  inner implements Consumer {
	 void addelement()
	 {
		 ArrayList <String> a= new ArrayList<String>();
		a.add("sona");
		a.add("sona");
		
	 }
   
      public void accept( String a) {
		System.out.println(a);
		
	}
				
}


}
public class OUTER {
	 
 
    public static void main(String[] args)
    {
  	  OUTER1 x = new OUTER1();
    	 OUTER1.inner nestedObject =x.new OUTER1.inner();
    	 nestedObject.addelement();
         

      
    	//  OUTER1 x = new OUTER1();
 
       // x.new1();
    }
}