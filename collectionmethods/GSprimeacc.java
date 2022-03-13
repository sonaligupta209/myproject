package shopingapplication;

import java.util.Scanner;

public class SHOPACC {
	private int accno;
	private String accname;
	private float charges;
public void setAccno(int accno){
this.accno=accno;
}
public int getAccno() {
	return getAccno();
}
public void setAccname(String accname){
this.accname=accname;
}
public String getAccname() {
	return accname;
}
public void setCharges(float charges){
this.charges=charges;
}
public float getCharges() {
	return charges;
}
public void bookproduct() {
	System.out.println("Enter the product name and productno");
	Scanner sc=new Scanner(System.in);
 String	productname=sc.nextLine();
	int productno=sc.nextInt();
	System.out.println("Enter the product name"+productname);
	System.out.println("Enter the product no"+productno);
}
public void items(float charges) {
	this.setCharges(charges);
}
public String toString()
{
	String User="Accountnumber="+getAccno()+"Accountname="+getAccname()+"productcharges="+getCharges();
	return User;
}
}
/*prime user account
  prime class ********************* 
 */
abstract class primeacc extends SHOPACC{
	private boolean isprime;
	public static final int deliverycharge;
	
	public void setAccno(int accno) {
	super.setAccno(accno);
	}
	public int getAccno() {
		return getaccno;
	}
	super.setAccname(String accname);
	super.getAccname();
	super.setCharges(float charges);
	super.getCharges();
	}
	public void setIsprime(boolean isprime) {
		this.isprime=isprime;
	}
	public boolean getIsprime() {
		return isprime;
	}
	public void setDeliverycharges(int deliverycharge){
		this.deliverycharge=100;
	}
	public int getDeliverycharges() {
		return deliverycharge;
	}
	public void bookproduct() {
		super.bookproduct();
	}
	public String toString()
	{
		String User1="Accountnumber="+getAccno()+"Accountname="+getAccname()+"productcharges="+getCharges()+"ISPRIME="+getIsprime()+"Deliverycahrge="+getDeliverycharges;
		return User1;
	}
}
/*concrete class main classsss
 * ******8888888
 */
public class GSprimeacc extends primeacc{
	public static void main (String[] args) {
		GSprimeacc USER=new GSprimeacc();
		USER.bookproduct();
		USER.toString();
	}

}
