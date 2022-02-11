package java1;



class p{
	void get(){
		System.out.println("Thise is a most super class");
	}
	void dis(){
		System.out.println("Thise is a most super class method invoked by child class object");
	}
}

class b extends p{
	void get(){
		System.out.println("Thise is a super class");
	}
}

public class inheritance extends b  {
	void get(){
		System.out.println("Thise is a child class");
			}
	public static void main(String[] args) {
		inheritance obj  = new inheritance();
		obj.get();
		b obj1 = new b();
		obj1.get();
		p obj2=new p();
		obj2.get();
		obj.dis();
	
		


	}

}