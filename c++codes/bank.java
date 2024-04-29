import java.util.Scanner;
class Bank{
	String name;
	long AcNum;
	String bankname;
	long balance;
	long amount;
	void setCustomerName(String name){
		this.name=name;
	}
	void setCustomerAccNum(long AcNum){
		this.AcNum=AcNum;
	}
	void setCustomerBankName(String bankname){
		this.bankname=bankname;
	}
	void setCustomerBalance(long balance){
		this.balance=balance;
	}
	void Amount(long amount){
		this.amount=amount;
	}
	void printcustomerData(){
		System.out.println("Name of customer is--->"+name);
		System.out.println("Account Number of customer is--->"+Acnum);
		System.out.println("bank Name--->"+bankname);
		System.out.println("balance of customer is--->"+balance);
		System.out.println("Amount is-->"+amount);
	}
	void debit(){
		System.out.println(amount+" Amount is debitted from your account");
	}
	void credit(){
		System.out.println(amount+" Amount is creditied in your account");
	}
	public static void main(String args[]){
		Bank b=new Bank();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter customer name");
		String name=sc.nextLine();
		b.setCustomerName(name);
		
		System.out.println("enter customer Account number");
		long Acnum=Long.parseLong(sc.nextLine());
		b.setCustomerAccNum(Acnum);
		
		System.out.println("enter bank name");
		String bankname=sc.nextLine();
		b.setCustomerBankName(bankname);
		
		System.out.println("enter customer balance");
		long balance=Long.parseLong(sc.nextLine());
		b.setCustomerBalance(balance);
		
		System.out.println("enter amount");
		long amount=Long.parseLong(sc.nextLine());
		b.Amount(amount);
		System.out.println("\n");
		b.printcustomerData();
		System.out.println("\n");
		if(balance>2000){
			b.debit();
		}
		else
		{
			b.credit();
		}
		
	}
}
