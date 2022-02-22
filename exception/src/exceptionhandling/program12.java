package exceptionhandling;

public class program12 
 {
public static void main (String[] args) {
try{
System.out.println(4/0);
}catch(Exception e)
{
System.out.println(e);
}
finally
{
System.out.println("finally executed");
}
System.out.println("end");
}
}

