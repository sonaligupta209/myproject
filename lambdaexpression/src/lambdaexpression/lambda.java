package lambdaexpression;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
 
interface demo{
	void print(Integer a,String b);
}
abstract class lambda implements demo{
	 static void fun(demo d, Integer a,String b) {
		 d.print(a, b);
	
		}
	 public static void main(String[]args) {
		 fun((a, b)
	                -> System.out.println(a+ " " + b),
	            10, "sona");
	 
	 }
}