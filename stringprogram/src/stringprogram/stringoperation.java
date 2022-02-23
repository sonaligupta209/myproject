package stringprogram;

public class stringoperation {
public static void main(String[] args) {
	//1st way to declare string
	String s1="hello";
	System.out.println("ist way:"+s1);
	//2nd way to declare string
	String s2=new String("world");
	
	System.out.println("2nd way:"+s2);

	//lenght of string
	System.out.println("lenght of first string:"+s2.length());
	
	//
	String s3=s1.concat(s2);
	System.out.println("concatenation:"+s3);
	if(s1==s2)
	{
		System.out.println("equal");
	}
	else
	{
		System.out.println("not equal");
	}
}
}
