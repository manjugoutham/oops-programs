package stockaccount;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {

	static String name;
	static String name2;
	private static double sprice;
	private static double NumOfShares;
	static double Balance = 2000;
	private static double total_Balance;
	static double total_val;
	static long numofshearbuy;

	static Scanner scan = new Scanner(System.in);
	static ArrayList<String> stock = new ArrayList<>();
	static ArrayList<Double> shareprice = new ArrayList<>();
	static ArrayList<Double> NumberOfShares = new ArrayList<>();

	static ArrayList<String> list1 = new ArrayList<>();
	static ArrayList<Double> list2 = new ArrayList<>();
	static ArrayList<String> list3 = new ArrayList<>();
	
	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		StockAccount.name = name;
	}

	public static double getSprice() {
		return sprice;
	}

	public static void setSprice(double sprice) {
		StockAccount.sprice = sprice;
	}

	public static double getNumOfShares() {
		return NumOfShares;
	}

	public static void setNumOfShares(double numOfShares) {
		NumOfShares = numOfShares;
	}

	public static void stockdetails() {

		System.out.println("Enter the stock name : ");
		name = scan.next();
		stock.add(name);

		System.out.println("Enter the one share price of the stock  : ");
		sprice = scan.nextDouble();
		shareprice.add(sprice);

		System.out.println("Enter the number of shares to you want to buy ");
		NumOfShares = scan.nextDouble();
		NumberOfShares.add(NumOfShares);

//		System.out.println(stock.get(0));
//		System.out.println(shareprice.get(0));
//		System.out.println(NumberOfShares.get(0));
	}

	public static void totalvalue() {

		System.out.println("Enter the number stocks :");
		int stock1 = scan.nextInt();
		for (int i = 0; i < stock1; i++) {

			stockdetails();
			// double oneshare = ;
			total_val = NumberOfShares.get(i) * 1 * shareprice.get(i);
			System.out.println("Name of the stock :" + stock.get(i));
			// System.out.println("The stock price for one share :" +oneshare );
			System.out.println("The stock value :" + total_val + "\n\n");
		}
	}

	public void newaccount() {
		System.out.println("Enter person name: ");
		name2 = scan.next();
		list1.add(name2);
	}

	public void display() {
		System.out.println("Name of account holder name is : " + name2);
		System.out.println("Current balance is : " + Balance);
	}

	public void buyandsell() {
//		
		System.out.println("Select the stocks given below : \n" + stock.get(0) + " one share value is : "
				+ shareprice.get(0) + "\n" + stock.get(1) + " one share value is : " + shareprice.get(1));
		String StockName1 = scan.next();

		for (int i = 0; i < stock.size(); i++) {
			if (StockName1.equals(stock.get(i))) {

				System.out.println("Enter the share you want to buy : ");
				Long numofshearbuy = scan.nextLong();
				total_Balance = numofshearbuy * (1 * shareprice.get(i));

				System.out.println("Would you like to (buy = 1) 1 or 2 (sell = 2) ?");
				int option = scan.nextInt();
				if (option==1) {
					if (Balance >= total_Balance) {

						Balance = Balance - total_Balance;
						list3.add(stock.get(i));
						System.out.println("You have buyed " + stock.get(i) + "stock");

					} else {
						System.out.println("\n" + name + " you can not buy shear of : " + total_Balance);
						System.out.println("your balance is: " + Balance);
					}
				} else if (option==2) {

					Balance = Balance + total_Balance;
					System.out.println("You have Selled " + stock.get(i) + "stock");

				} else
					System.out.println("You did not buy or sell here any stocks");
			}
		}

	}

	public void addMultiDematAccount() {

		System.out.println("How many accounts you want to add here : ");
		long count = scan.nextLong();
		for (long i = 0; i < count; i++) {
			newaccount();
			buyandsell();
			list2.add(Balance);
			display();
			System.out.println("\n");
			Balance = 2000;
		}
	}

	

	public static void main(String[] args) {
		StockAccount stock = new StockAccount();
		stock.totalvalue();
//		stock.newaccount();
//		stock.buyOrSellStock();
		stock.addMultiDematAccount();
//		stock.buyOrSellStock();
//		stock.display();

	}
}
