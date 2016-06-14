/*Assignment 5 (Part A & b)
Nahian Pathan (27105827) 
 */

import java.util.Scanner;
class CellPhone {

	private int price;
	private String brand;
	private long serialNum;

	private static long serialNumberCounter = 100000000;


	//Constructor 

	public CellPhone () 
	{

		System.out.println("Creating Object with fixed values......"); 
		price = 699;
		brand = "Apple";
		serialNum = 123456789;

	}



	public CellPhone(int pr, String br, long sn)
	{
		// Initialize the attributes of vehicle when it is created.
		System.out.println("Creating Object with Parameterized values......"); 
		price = pr;
		brand = br;

		serialNum = serialNumberCounter;		// Assign the next available serial number 
		serialNumberCounter++;

	}

	//copy constructor. It takes an object of class and turns it into a parameter 

	public CellPhone (CellPhone cp)
	{
		//this(cp.brand, cp.price, cp.serialNum);
		
		System.out.println("Creating copy of objects with copy constructor......."); 
		this.price= cp.price;
		brand = cp.brand;
		serialNum = cp.serialNum;

		serialNum = serialNumberCounter;		// Assign the next available serial number 
		serialNumberCounter++;

	}

	//Accessrs and mutators 

	public int getPrice() {

		return price;
	}


	public void setPrice(int pr) {

		if (pr >= 100 && pr <=1000){
			price = pr;
		}
		else 
			System.out.println("Invalid entry!");
	}


	public String getBrand() {
		return brand;

	}


	public void setBrand(String br) {
		brand = br;
	}


	public long getSerialNum() {
		return serialNum;
	}


	public void setSerialNum(long sn) {
		this.serialNum = sn;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		if (this.brand.equals(((CellPhone)obj).brand)  &&  this.price==((CellPhone)obj).price  ) 
       return true;
       
    	    return false;
	}


	/*
		@Override
		public String toString(   ) 

		{
			return "CellPhone [price=" + price + ", brand=" + brand + "]";
		}
	 */

	//method for matching parameters





	public void showInfo()
	{		
		// Displays CellPhone information
		System.out.println("Made by " + brand + ". Priced at $" + price + "\nSerial Number=" + serialNum  + "\n======");

	}

	@Override
	public String toString() {
		return  brand;
	}



	public void matchPrBr(int pr, String br){

	}



}


public class CellPhoneSearch {

	public static void main(String[] args) {

		System.out.println ("Welcom to CellPhoneSearch Program" );


		int i;

		// Create an array of 10 CellPhone objects
		CellPhone[] cellArr1 = new CellPhone[10];

		// Create 10 CellPhone objects 
		CellPhone c1 = new CellPhone(500, "Apple", 111111111), 
				c2 = new CellPhone(600, "Nokia", 222222222), 
				c3 = new CellPhone(700, "Nokia", 333333333), 
				c4 = new CellPhone(600, "Apple", 444444444), 
				c5 = new CellPhone(500, "Samsung", 555555555), 
				c6 = new CellPhone(600, "Apple", 666666666), 

				//copying objects with copy constructor 

				c7 = new CellPhone(c1),
				c8 = new CellPhone(c2),
				c9 = new CellPhone(c3),
				c10 = new CellPhone (c4);


		// Now both the array of CellPhone is created as well as the 
		// CellPhone themselves; go ahead and place (actually reference)
		// these objects in the array. 
		cellArr1[0] = c1;
		cellArr1[1] = c2;
		cellArr1[2] = c3;
		cellArr1[3] = c4;
		cellArr1[4] = c5;
		cellArr1[5] = c6;
		cellArr1[6] = c7;
		cellArr1[7] = c8;
		cellArr1[8] = c9;
		cellArr1[9] = c10; 

		/*
		System.out.println("\nShowing information of cellArr1");

		for (i = 0; i < cellArr1.length; i++)
		{
			// Show the information of each object
			System.out.println("\nShowing information for CellPhone # " + (i+1));
			System.out.println("====================================");

			cellArr1[i].showInfo();
		}*/

		//ask users for input
		Scanner kb = new Scanner (System.in);
		System.out.println ("Please enter the name of the brand followed by the its price.");
		String br = kb.nextLine();
		int pr = kb.nextInt();
		System.out.println("Enter \"Yes\" for finding phone(s) with the same brand and price or \n\"No\" for finding same brand or same priced phones.");
		String ans = kb.next();


		if (ans.equalsIgnoreCase("Yes"))
		{

			//Searching within parameter
			for (i = 0; i<cellArr1.length; i++)
			{
				//Assign To String to a 
				String brandz = cellArr1[i].toString();

				if (cellArr1[i].getPrice() == pr && brandz.equalsIgnoreCase(br) )
				{

					System.out.println ("The cellphone(s) that matches both PRICE & BRAND is " );
					cellArr1[i].showInfo();

				}
				else 
				{
					System.out.println ("No matches found" );
					break;
				}
			}

		}	

		else //if No or anything else 
		{
			for (i = 0; i<cellArr1.length; i++)
			{

				String brandz = cellArr1[i].toString();

				if (cellArr1[i].getPrice() == pr || brandz.equalsIgnoreCase(br) )
				{

					System.out.println ("The cellphone(s) that matches both PRICE OR BRAND is " );
					cellArr1[i].showInfo();

				}
				else 
					System.out.println ("No matches found" );
				break;

			}


		}

		System.out.println ("Program is now terminating. \nThank You!" );

		kb.close();

	}

}
















