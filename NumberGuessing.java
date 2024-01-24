import java.util.Scanner;
import java.lang.Math;

public class NumberGuessing {
    public static void main(String[] args){
        double guess;
        Scanner sc= new Scanner(System.in);

        int lowerBound = 1;  // Set your desired lower bound for the random number
        int upperBound = 100;
        guess=  Math.random() * 100;
        int computerGuess = (int) guess;


        int numberOfTries = 0;
        int score = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound);

        while (numberOfTries != 5) {
            System.out.print("Enter your guess: ");
            int userGuess = sc.nextInt();
            numberOfTries++;

            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please enter a valid guess within the specified range.");
            } else if (userGuess < computerGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > computerGuess) {
                System.out.println("Too high! Try again.");
            } else if(userGuess == computerGuess){
                score++;
                System.out.println("Congratulations! You guessed the correct number in " + numberOfTries + " tries.");
            }
            System.out.println("Your guess is "+ userGuess);

        }
        System.out.println("Your score is "+ score);
        sc.close();
    }
}

