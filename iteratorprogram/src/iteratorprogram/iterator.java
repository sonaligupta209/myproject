package iteratorprogram;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class iterator {
	void display(List<String> list){
	Iterator <String> obj = list.iterator();
		while(obj.hasNext()){
			System.out.println("Element is :"+obj.next());
		}
	}

	public static void main(String[] args) {
		List<String> oj=new LinkedList<>();
		oj.add("Banana");
		oj.add("mango");
		oj.add("Apple");
		oj.add("Graps");
		System.out.println("Element is :"+oj);
		
		iterator jc= new iterator();
		jc.display(oj);
		
		oj.sort(null);
		System.out.println("Elements are sorted :"+oj);
		oj.remove(2);
		System.out.println("Element is :"+oj);	
		

	}

}
