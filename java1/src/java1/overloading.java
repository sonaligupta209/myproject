package java1;

public class overloading {
	

 void display(int a,int b) {
	System.out.println("sum of number"+(a+b));
}
void display(int a,int b,int c) {
	System.out.println("sum of number"+(a+b+c));
	
}
void display(int a,int b,int c,int d) {
	System.out.println("sum of number"+(a+b+c+d));
}

public static void main(String[] args) {
	overloading o = new overloading();
	o.display(20,69 );
	o.display(034, 560, 670);
	o.display(349, 350, 45540, 560);
}
}