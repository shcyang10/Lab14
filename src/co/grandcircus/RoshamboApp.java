package co.grandcircus;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Player theRock = new Rock("The Rock");
		Player theMan = new Random();
		Player human = new Human();
		boolean check = true;
		String choice;
		Roshambo pick1;
		Roshambo pick2 = theRock.generateRoshambo();
		
		System.out.println("Welcome to Rock Paper Scissors!");
		
		
		String name = Validator.getString(scan, "Enter your name: ");
		// do loop to loop back after selecting to continue
		do {
			
			do {
				choice = Validator.getString(scan, "Enter Rock, Paper, or Scissors(r/p/s): ");
				if(choice.toLowerCase().startsWith("r") || choice.toLowerCase().startsWith("p") 
							|| choice.toLowerCase().startsWith("s")) {
					check = false;
				}
				
				}while(check);
				pick1 = human.generateRoshambo(choice);
				do {
					// do loop to loop again if they select to continue and when they select
					// a choice of r/p/s
					choice = Validator.getString(scan, "Would you like to play against, The Rock or The Man?");
					if(choice.equalsIgnoreCase("the rock")) {
						pick2 = theRock.generateRoshambo();
						check = false;
					}else if(choice.equalsIgnoreCase("the man")) {
						pick2 = theMan.generateRoshambo();
						check = false;
					}else {
						System.out.println("Wrong input! Please select The Rock or The Man.");
						check = true;
					}
				}while(check);
	
				System.out.println(whoWins(pick1, pick2));
				
				System.out.println("Play again? (y/n): ");
				choice = scan.nextLine();
				// while loop to go back to the top if they select y
		}while(choice.equalsIgnoreCase("y"));
		
		System.out.println("Thanks for playing!");
		scan.close();
		
	}
	
	public static String whoWins(Roshambo pick1, Roshambo pick2) {
		if(pick1.equals(Roshambo.Rock) && pick2.equals(Roshambo.Paper) 
				|| pick1.equals(Roshambo.Rock) && pick2.equals(Roshambo.Scissors) 
				|| pick1.equals(Roshambo.Paper) && pick2.equals(Roshambo.Scissors)) {
			return "You are the winner!";
			
		}else if(pick1.equals(pick2)) {
			return "Why you pick the same thing!";
			
		}else {
			return "You loss, better luck next time!";
		}
	}
	
}