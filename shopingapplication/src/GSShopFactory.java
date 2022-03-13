

abstract class ShopFactory{
	public String getNewprimeacc (int accno,String accname,float charges,boolean isPrime) {
		return "primeacc(Account No: "+ accno +" | Account Name : "+accname+" | Charges: "+charges+" | "+isPrime+")";

		
	}
	public String getNewnormalacc (int accno,String accname,float charges,int deliveryCharges) {
		return "normalacc(Account No: "+ accno +" | Account Name : "+accname+" | Charges: "+charges+" | Delivery charges : "+deliveryCharges+")";

		
	}
}

public class GSShopFactory extends ShopFactory {
	public String getNewprimeacc(int accno,String accname,float charges,boolean isPrime,int deliverycharge)  {
		return "primeacc(Account No: "+ accno +" | Account Name : "+accname+" | Charges: "+charges+" | "+isPrime+")";

		
	}
	public String getnormalacc (int accno,String accname,float charges,float deliveryCharges) {
	
		return "normalacc(Account No: "+ accno +" | Account Name : "+accname+" | Charges: "+charges+" | Delivery charges : "+deliveryCharges+")";

	}

	public static void main(String[] args) {
		
		GSShopFactory gssf = new GSShopFactory();
		//gssf.getNewPrimeAcc(234, "sam", 200, true);
		System.out.println(gssf.getNewnormalacc(2110812, "sonali", 100, 50));
		System.out.println(gssf.getNewprimeacc(234, "sona", 200, true));

	}

}
