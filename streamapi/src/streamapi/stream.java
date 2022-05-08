package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class stream {
public static void main (String[] args) { 
	
	//filter()
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(9);
	al.add(4);
	al.add(20);
	al.add(10);
	al.add(5);
	
System.out.println("element before filter "+al);
	
List<Integer> li=al.stream()
.filter(i->i%2==0)
.collect(Collectors.toList());

System.out.println("element after filter "+li);

//map()
List<Integer> l=al.stream()
.map(i->i+6)
.collect(Collectors.toList());

System.out.println("element after map "+l);

	
}
}
