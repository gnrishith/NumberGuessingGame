package com.numberguessinggame;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("======================================");
		System.out.println("            NUMBER GUESSING GAME");
		System.out.println("======================================");
		System.out.println();
		
		System.out.print("Enter your name: ");
		String name=sc.nextLine();
		System.out.println("Welcome "+name+"!");
		
		boolean playagain=true;
		
		while(playagain) {
		
			System.out.println();
		System.out.println("Welcome to Number Guessing Game");
		System.out.println("I am thinking of a number between 1 and 100");
		System.out.println("Can you guess it");
		System.out.println();
		
		
		
		System.out.println("Good Luck, "+name+"!");
		System.out.println("======================================");
		
		System.out.println("Select Difficulty");
		System.out.println("1.Easy (10 Chances)");
		System.out.println("2.Medium (5 Chances)");
		System.out.println("3.Hard (3 Chances)");
		System.out.println();
		System.out.print("Enter your choice: ");
		System.out.println();
		int choice=sc.nextInt();
		int chances=0;
		switch(choice) {
		case 1: 
			System.out.println();
			System.out.println("Easy Difficulty Selected");
			System.out.println("You have 10 chances");
			chances=10;
			break;
		case 2:
			System.out.println();

			System.out.println("Medium Difficulty Selected");
			System.out.println("You have 5 chances");
			chances=5;
			break;
		case 3:
			System.out.println();

			System.out.println("Hard Difficulty Selected");
			System.out.println("You have 3 chances");
			chances=3;
			break;
		default :
			System.out.println("Invaild choice!");
			// System.out.println("Please restart the game");
			break;
		}
		Random random =new Random();
		int secretnumber=random.nextInt(100)+1;
		//System.out.println("SecretNumber: "+secretnumber);
		
		boolean guessed=false;
		for(int att=1; att<=chances; att++) {
			System.out.println();
			System.out.println("Attempt "+att+"/"+chances);
			System.out.print("Enter your guess: ");
			int guess=sc.nextInt();
			if(guess==secretnumber) {
				
				guessed=true;
				System.out.println("Congratulations, "+name+" !");
				System.out.println("You Guessed the number in "+att+" attempts.");
				break;
			}
			else if(guess > secretnumber)
				System.out.println("Too High");
			else 
				System.out.println("Too Low");
			}
		System.out.println();
		if(!guessed) {
			System.out.println("Game over");
			System.out.println("The secretNumber was: "+secretnumber);
		}
		System.out.println();
		System.out.println("Play Again?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		System.out.println("Enter your choice");
		int again=sc.nextInt();
		sc.nextLine();
		
		if(again==1) {
			playagain=true;
		}
		else if(again==2) {
			playagain=false;
			System.out.println("Thank you for playing!");
		}
		else {
			System.out.println("Invalid choice Exiting the game");
			playagain=false;
		}
		
		
		
		}
		

	}

}
