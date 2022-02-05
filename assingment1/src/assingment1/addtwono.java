package assingment1;

import java.util.Scanner;
public class addtwono
{
public static void main(String[] args)
{
int a, b, sum;
Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number: ");
a = sc.nextInt();
System.out.println("Enter Second Number: ");
b = sc.nextInt();
sc.close();
sum = a + b;
System.out.println("Sum of these numbers: "+sum);
}
}


