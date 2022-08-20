import java.util.*;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
		//To Generates a random number between 0 to 100
		int RandomNumber = (int)(Math.random()*100);
		System.out.println("**NUMBER GUESSING GAME**");
		System.out.println("\nWelcome All!! To play this game you need to follow some rules they are:");
		System.out.println("\n1.You Need to Guess a Number Between 1 To 100");
		System.out.println("2.If your guessed Number does'nt match, it will display the guessed Number is greater or smaller than generated number ");
		System.out.println("3.Every person gets 5 chances to guess the Number ");
		System.out.println("4.person who can guess the Number in minimum chances is the winner");
		System.out.println("Now you can start the Game");
		Scanner in = new Scanner(System.in);
		int chances=5;
		int i=0; 
		int points=100;
		while(i<chances) {
			int GuessedNumber=in.nextInt();
			if(GuessedNumber==RandomNumber) {
				System.out.println("Congrats!!");
				System.out.println("Your guessed Number was correct in "+(i+1)+"attempts");
				System.out.println("Your points" + points);
				break;
			}
			else if(GuessedNumber<RandomNumber && i!=chances-1) {
				points=points-20;
				System.out.println("sorry!!");
				System.out.println("Your guessed Number is smaller than Random Number");
				System.out.println("Your points"+points);
				
			}
			else if(GuessedNumber>RandomNumber && i!=chances-1) {
				points=points-20;
				System.out.println("Sorry!!");
				System.out.println("Your guessed Number is greater than Random Number");
				System.out.println("Your points"+points);
				
			}
			
			i++;
		}
		if(i==chances) {
			System.out.println("You are Done with your chances,the Number was:"+RandomNumber);
			System.out.println("Your Score is"+points);
			System.out.println("(: BETTER LUCK NEXT TIME :)");
		}
	}

    
}