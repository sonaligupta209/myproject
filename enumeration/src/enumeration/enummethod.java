package enumeration;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class enummethod {
	public static void main(String args[])

	{
		Vector<Integer> vector=new Vector();
		vector.add(1);
		vector.add(12);
		vector.add(1);
		vector.add(13);
		
		Enumeration<Integer> elements=vector.elements();
		while(elements.hasMoreElements())
		{
			Integer n=elements.nextElement();
			System.out.print(n);
			
			
		}
		
			
			System.out.println(vector);
		
	}
}