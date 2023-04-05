
//This is Task 1st of Oasis infobyte intership making a Number Guessing game Khanderao Wakade//

import java.util.Scanner;

public class guessNumber{
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // limits the number of attempts per round to 5.
        int maxAttempts = 5;
        
        //limits the number of rounds to 3
        int maxRounds = 3;
        
        // keeps track of the player's score across all rounds.
        int totalScore = 0;
        
        //keeps track of the current round.
        int round = 1;
        
        
        //The game play in a loop for rounds
        while (round <= maxRounds) {
        	
        	//Each round has new random number between 1-100
            int randomNumber = (int) (Math.random() * 100) + 1;
            int guess = 0;
            
            //numGuesses is reset to 0 at the start of each round
            int numGuesses = 0;
            
            //roundScore keeps track of the play's score for the current round
            int roundScore = 0;
            
            System.out.println("Round " + round + ": I'm thinking of a number between 1 and 100. You have " + maxAttempts + " attempts.");
            
            //The loop for each round runs until the player guesses the number correctly or exceeds maxAttempts
            while (guess != randomNumber && numGuesses < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
                numGuesses++;
                
                //If the player guesses the number correctly, roundScore is calculated based on the number of attempts remaining, and added to totalScore
                if (guess < randomNumber) {
                    System.out.println("Too low! Guess higher.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Guess lower.");
                } else {
                    roundScore = (maxAttempts - numGuesses + 1) * 10;
                    totalScore += roundScore;
                    System.out.println("Congratulations, you guessed it! It took you " + numGuesses + " attempts. You earned " + roundScore + " points.");
                }
            }
            
            //If the player runs out of attempts without guessing the number, a message is printed telling them the number and no points are earned for that round.
            if (guess != randomNumber) {
                System.out.println("Sorry, you didn't guess the number. The number was " + randomNumber + ".");
            }
            //At the end of each round, the player's total score is displayed.
            System.out.println("End of round " + round + ". Your total score is " + totalScore + ".");
            round++;
        }
        //After maxRounds rounds, the player's final score is displayed.
        System.out.println("Game over! Your final score is " + totalScore + ".");
    }
}


		        	

