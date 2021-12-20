package bankdetails;

import java.util.ArrayList;
import java.util.Scanner;

class BankDetails {

	static String Name;
	static Long withdraw;
	static double balance = 0;
	static double amount;
	static ArrayList<String> list1 = new ArrayList<>();
	static ArrayList<Double> list2 = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void Account() {
		System.out.println("Enter Account holder name : ");
		Name = sc.next();
		list1.add(Name);
		list2.add(balance);
	}

	public void display() {
		System.out.println("Name of account holder name is : " + Name);
		// System.out.println("your deposit balance is :" + balance);
		System.out.println(" Your last withdraw was : " + withdraw);
		System.out.println("Current balance is : " + balance + "\n\n");
	}

	public void deposit() {

		System.out.println("Enter the deposit amount : ");
		double amount = sc.nextDouble();
		balance = balance + amount;

	}

	public void withdraw() {

		System.out.println("Enter the amount you want to withdrawn :");
		withdraw = sc.nextLong();
		if (balance >= withdraw) {
			balance = balance - withdraw;
		} else {

			System.out.println(Name + " you can not withdraw amount in your account " + withdraw);
			System.out.println("your balance is: " + balance);
		}
	}

	public void addaccount() {
		System.out.println("Enter the number account users :");
		int u1 = sc.nextInt();
		for (int i = 0; i < u1; i++) {
			Account();
			deposit();
			withdraw();
			display();
			balance = 0;
		}
		// amount = 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankDetails ban = new BankDetails();
		ban.addaccount();
		// ban.Account();
//		ban.deposit();
//		ban.withdraw();
//		ban.display();

	}

}