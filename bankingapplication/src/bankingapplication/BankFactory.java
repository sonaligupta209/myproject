package bankingapplication;

abstract class BankFactory{
	public String getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		return "new Saving Account";
	}
	public String getNewCurrentAcc(int accNo,String accNm, float accBal, float creditLimit) {
		return "Current Account";
	}
}

 class MMBankFactory extends BankFactory {
	private int getMinbal=300;

	public String getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		return "Saving Account(Account Number :"+accNo+" | Account Name : "+accNm+" | Account Balance : "+accBal+" | Minimum Balance is :"+getMinbal+" | Is salary Account : "+isSalaried+")";

	}
	public String getNewCurrentAcc(int accNo,String accNm, float accBal, float creditLimit) {
		return "Current Account(Account Number :"+accNm+" | Account Name : "+accNm+" | Account Balance : "+accBal+" | Credit Limit Balance is :"+creditLimit+")";

	}

	public static void main(String[] args) {
		MMBankFactory mmb= new MMBankFactory();
		System.out.println(mmb.getNewCurrentAcc(555, "SAM", 15000, 20000));
		System.out.println(mmb.getNewSavingAcc(3456, "Sam", 15000, true));
		
	}

}
