package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {

		System.out.println("Welcome to the Change Calculator!");

		boolean finished = false;
		while(finished == false) {


			//Prompt user for total bill
			System.out.print("Please enter the amount of the bill: ");
			Scanner input = new Scanner(System.in);
			String billAmount = input.nextLine();
			double finalBillAmount = Double.parseDouble(billAmount);


			//Prompt user for amount tendered
			System.out.print("Please enter the amount tendered: ");
			String amountTendered = input.nextLine();
			double finalAmountTendered = Double.parseDouble(amountTendered);

			//Calculate change
			double change = finalAmountTendered - finalBillAmount;


			//Display the change required
			System.out.format("Your change is: $%.2f\n", change);

			System.out.print("Are you finished (y/n)? ");
			String response = input.nextLine();
			if (response.equals("y")){
				finished = true;
			}


		}
		System.out.println("Thanks for using the Change Calculator!");

	}

}
