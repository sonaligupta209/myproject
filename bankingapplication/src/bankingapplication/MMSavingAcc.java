package bankingapplication;
abstract class BankAcc{
	private int accNo;
	private float accBal;
	private String accNm;
	public int getAccNo() {
		return accNo;
	}
	public void setaccNo(int accNo) {
		this.accNo = accNo;
	}
	public float getaccBal() {
		return getaccBal();
	}
	public void setaccBal(int accBal) {
		this.setaccBal(accBal);
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setaccBal(float accBal) {
		this.accBal = accBal;
	}
	public BankAcc(int accNo,float accBal,String accNm) {
		this.setaccNo(accNo);
		this.setaccBal(accBal);
		this.setAccNm(accNm);
	}
	public void withdraw (float amount) {
		System.out.println(amount);
	}
	public void deposite (float d_amount) {
		System.out.println(d_amount);
	}
	public String toString() {
		return "hello sam";
	}
	
}
abstract class SavingAcc extends BankAcc{
	private boolean isSalaried=true;
	private static final float MINBAL=300;
	public SavingAcc(int accNo, float accBal, String accNm, boolean isSalaried) {
		super(accNo, accBal, accNm);
		this.setSalaried(isSalaried);
	}
	public void withdraw(float amount) {
		System.out.println("withdraw amount :"+amount);
	}
	public String toString() {
		return "saving acount";
	}
	public boolean isSalaried() {
		return isSalaried;
	}
	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
	public static float getMinbal() {
		return MINBAL;
	}
}
public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accNo, float accBal, String accNm, boolean isSalaried) {
		super(accNo, accBal, accNm, isSalaried);
	}
	public void withdraw(float amount) {
		if(amount<300) {
			System.out.println("you cant withdraw amount you dont have minimum amount");
		}else {
		System.out.println("withdraw amount :"+amount);
	}
		
	}
	public String toString() {
		return "Saving Account(Account Number :"+getAccNo()+" | Account Name : "+getAccNm()+" | Account Balance : "+getAccBal()+" | Minimum Balance is :"+getMinbal()+" | Is salary Account : "+isSalaried()+")";
		
	}
	public static void main(String[] args) { 
		MMSavingAcc mms = new MMSavingAcc(44444, 400, "Sam",true);
		mms.toString();
		mms.withdraw(200);
		mms.withdraw(500);
		System.out.println();
		System.out.println(mms.toString());
	}

}
