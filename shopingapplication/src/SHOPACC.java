
import java.util.Scanner;

abstract class SHOPACC {
	private int accno;
	private String accname;
	private float charges;
	public SHOPACC(int accno,String accname,float charges) {
		this.accno=accno;
		this.accname=accname;
		this.charges=charges;
	}
public void setAccno(int accno){
this.accno=accno;
}
public int getAccno() {
	return accno;
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

	System.out.println("Enter the product name");
	String	productname=sc.nextLine();
	System.out.println("Enter the product no");
	int productno=sc.nextInt();
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
	public static final int deliverycharge=100;
	public primeacc(int accno,String accname,float charges,boolean isprime, int deliverycharge)
	{
		super(accno,accname,charges);
	
			this.isprime=isprime;
		    
	 }
	
	
		
	  

	
	
	public void bookproduct() {
		super.bookproduct();
	}
	public String toString()
	{
		String User1="Accountnumber="+getAccno()+"Accountname="+getAccname()+"productcharges="+getCharges()+"ISPRIME="+isprime +"deliverycharge"+deliverycharge;
		return User1;
	}

}
/*concrete class main classsss
 * ******8888888
 */
 class GSprimeacc extends primeacc{
public GSprimeacc(int accno, String accname, float charges, boolean isprime) {
		super(accno, accname, charges, isprime,deliverycharge);

		int deliverycharges=super.deliverycharge;
		
	}


public static void main(String[] args) {
	GSprimeacc gsp =new GSprimeacc(6222, "Sonali", 45, true);
	//GSPrimeAcc prime = new GSPrimeAcc(655, "sam", 500, true);
	////PrimeAcc s1=new GSPrimeAcc(2,"sam", 123, true);
	///s1.toString();
	gsp.toString();
	gsp.bookproduct();
	//prime.toString();
	//System.out.println(s1.toString());
	//System.out.println(prime.toString());
	System.out.println(gsp.toString());
}

}

	
	


