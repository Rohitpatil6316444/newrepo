package pack;

import java.util.*;

public class Inventory {
	String pname;
	static int price;
	int quantity;
	static String banner ="Welcome to IMS";
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Product Name");
		pname=s.next();
		System.out.println("Enter Price");
		price=s.nextInt();
		System.out.println("Enter Quantity");
		quantity=s.nextInt();
		
	}
	
	void show()
	{
		System.out.println(banner+" "+pname +" "+price+" "+quantity);
		
	}
	
	static void calculate()
	{
		if(price>3000)
			System.out.println("Discount is 10%");
		else
			System.out.println("Discount is 9%");
	}
	

	public static void main(String[] args) 
	{
		Inventory a = new Inventory();
		a.input();
		a.show();
		calculate();

	}

}
