package lambdaexpression;
import java.util.ArrayList;
import java.util.function.Consumer;
public abstract class implementconsumer implements Consumer{
	public static void main(String[] args) {
		ArrayList <String> a= new ArrayList<String>();
		a.add("sona");
		a.add("mona");
		a.add("priya");
		a.add("sonali");
		a.forEach(new Consumer<String>() {

			@Override
			public void accept(String a) {
			System.out.println(a);
				
			}
			
		});
	}

	}



