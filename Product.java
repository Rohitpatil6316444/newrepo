package pack;

import java.util.*;

public class Product 
{

	String pname;
	int price;
	
	void productinfo()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Product Name");
		pname=s.next();
		System.out.println("Enter Product Price");
		price=s.nextInt();
		
		System.out.printf("Procuct Name = "+pname+"\nProduct Price = "+price);
	}
	
	void discount()
	{
		if(price>=2000)
			System.out.println("\nDiscount is 10%");
		else
			System.out.println("\nDiscount is 7%");
	}
	
	public static void main(String[] args) 
	{
		Product p = new Product();
		p.productinfo();
		p.discount();

	}

}
