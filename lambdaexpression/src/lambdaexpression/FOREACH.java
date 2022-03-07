package lambdaexpression;

import java.util.List;
import java.util.ArrayList;
import java.io.*;

// forEACH FUNCTION USED FOR LIST ITERATION
public class FOREACH {
	public static void main(String[] args) {
		ArrayList <String> a= new ArrayList<String>();
		a.add("sona");
		a.add("mona");
		a.add("priya");
		a.forEach(str->System.out.println(str));
	}

}
