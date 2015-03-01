package demo.salestools;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();
	}

	private static void displayGreeting() {
		System.out.println("HELLO HAPPY SALES PEOPLE!");
		System.out.println("THIS APLL SHOWS SALES DATA!");
		
		System.out.println("Test 1");
		System.out.println("Test 2");
	}
}
