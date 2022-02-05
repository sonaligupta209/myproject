package assingment1;


import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner key = new Scanner(System.in);
        int in = key.nextInt();

        prim(in);
    }

    private static void prim(int in) {//int in is a Scanner var.
        if (in == 2 || in == 3) {

            System.out.println(in + " is a prime number");
        } else if (in == 5 || in == 7) {
            System.out.println(in + " is a prime number");
        } else if (in % 2 == 0 || in % 3 == 0) {
            System.out.println(in + " is not a prime number.");
        } else if (in % 5 == 0 || in % 7 == 0) {
            System.out.println(in + " is not a prime number.");
        } else {
            System.out.println(in + " is a prime number.");
        }
    }

}
