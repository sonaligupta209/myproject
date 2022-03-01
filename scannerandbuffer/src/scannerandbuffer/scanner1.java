package scannerandbuffer;
import java.util.Scanner;
public class scanner1 {
	
public static void main(String[]agrs)
	{
 Scanner sc=new Scanner(System.in);
 
 System.out.print("enter integer");
 int a=sc.nextInt();
 
 System.out.print("enter string");
 String b =sc.nextLine();
 System.out.printf("You have entered:- " + a
         + " and name as " + b);
 
}
}