package enumeration;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyonwritearray extends Thread {

	static CopyOnWriteArrayList<String> l
		= new CopyOnWriteArrayList<String>();

	public void run()
	{
		// Child thread trying to
		// add new element in the
		// Collection object
		l.add("D");
	}

	public static void main(String[] args)
		throws InterruptedException
	{
		l.add("A");
		l.add("B");
		l.add("c");


		copyonwritearray  t = new copyonwritearray ();
		t.run();

		Thread.sleep(1000);


		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			String s = (String)itr.next();
			System.out.println(s);
			Thread.sleep(1000);
		}
		System.out.println(l);
	}
}


