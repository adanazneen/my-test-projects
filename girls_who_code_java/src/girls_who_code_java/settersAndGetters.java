package girls_who_code_java;

public class settersAndGetters {

	public static void main(String[] args) {
//		String argonaut = "som,th,in,g";
//		String a = argonaut.replaceAll(",", "a");
//		System.out.println(a);
//		System.out.println(account1.getid());
//		account1.bankid = 10;
//		System.out.println(account1.getid());
		BankAccount account1 = new BankAccount(1234, 123.45f, "999-55-1235");
		BankAccount accountEVIL = new BankAccount(13475, 0f, "000-00-0000");
//		accountEVIL.currentBalance = account1.currentBalance;
		account1.setBalance(0, 99);
		System.out.println(account1.getbalance());
		System.out.println(accountEVIL.getbalance());

		
	}

}
class BankAccount {
	int bankid = 0;
	private float currentBalance = 0;
	String ssn = ""; //masking next time.
	public BankAccount() {
	}
	public BankAccount (int b, float m, String s) {
		bankid = b;
		currentBalance = m;
		ssn = s;
	}
	public int getid() {
		return bankid;
	}
	public void setBalance(float value, int employeeID) {
		int allowedID = 99;
		if (employeeID == allowedID) {
			currentBalance = value;
		}
		else {
			System.out.println("Access Forbidden.");
		}
	}
	public float getbalance() {
		return currentBalance;
	}
	
}