package com.techelevator;

import java.util.Scanner;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {

		System.out.println("Welcome to the Planet Weight Converter!");

		boolean finished = false;
		while (finished == false) {

			//Prompt user to input Earth weight
			System.out.print("Please input Earth weights, separated by one space: ");
			Scanner input = new Scanner(System.in);
			String weightInput = input.nextLine();
			String[] weightArray = weightInput.split(" ");

			//Calculate Mars weight
			double marsWeight = 0;
			double earthWeight = 0;
			for (int i = 0; i < weightArray.length; i++) {
				earthWeight = Double.parseDouble(weightArray[i]);
				marsWeight = earthWeight * 0.378;
				System.out.println(earthWeight + " lbs. on Earth, is equal to " + marsWeight + " lbs. on Mars.");
			}

			System.out.println("Are you finished (y/n)? ");
			String response = input.nextLine();
			if (response.equals("y")) {
				finished = true;
			}
		}
		System.out.println("Thanks for using our Planet Weight Converter!");
	}

}
