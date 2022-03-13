package bankingapplication;

abstract class CurrentAcc extends BankAcc{
	private final float creditLimit=2000; 
	public float getCredit(float creditLimit) {
		return creditLimit;
	}

	public CurrentAcc(int accNo, float accBal, String accNm, float creditLimit) {
		super(accNo, accBal, accNm);
		this.getCredit(creditLimit);
	} 
	public void withdraw(float amount) {
		System.out.println("your withdraw amount :"+amount);
	}
	public String toString() {
		return "this is a current Account";
	}

	public float getCreditLimit() {
		return creditLimit;
	}
}

public class MMCurrentAcc extends CurrentAcc{
	
	public MMCurrentAcc(int accNo, float accBal, String accNm, float creditLimit) {
		super(accNo, accBal, accNm, creditLimit);
	}
	public void withdraw(float amount) {
		if (amount>2000) {
			System.out.println("your credit limit is succeeded");
		}else {
		System.out.println("your withdraw amount :"+amount);
	}}
	public String toString() {
		return "current Account(Account Number :"+getAccNo()+" | Account Name : "+getAccNm()+" | Account Balance : "+getAccBal()+" | Credit Limit Balance is :"+getCreditLimit()+")";

	}

	public static void main(String[] args) {
		MMCurrentAcc mmc =new MMCurrentAcc(211, 15000,"Sam", 2000);
		mmc.withdraw(20000);
		mmc.withdraw(1000);
		mmc.toString();
		System.out.println(mmc.toString());
	}

}
