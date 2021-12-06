/* The "Rock Paper Scissors" Game
*
* @author  Hussein
* @version 1.0
* @since 2020-11-18
*/

import java.util.Random;
import java.util.Scanner;

/**
* This is the standard "RockPaperScissors" Game.
*/

final class RockPaperScissors {

    /**
    * Declaring exponent variable.
    */
    public static final String SPACE = "\n";
    /**
    * Declaring exponent variable.
    */
    public static final int THREE = 3;
    /**
    * Declaring exponent variable.
    */
    public static final String SAME = "It’s a tie!";
    /**
    * Declaring exponent variable.
    */
    public static final String ROCK = "You Selected: Rock";
    /**
    * Declaring exponent variable.
    */
    public static final String ROCKONE = "The computer selected: Rock";
    /**
    * Declaring exponent variable.
    */
    public static final String PAPER = "You Selected: Paper";
    /**
    * Declaring exponent variable.
    */
    public static final String PAPERONE = "The computer selected: Paper";
    /**
    * Declaring exponent variable.
    */
    public static final String SCISSOR = "You Selected: Scissor";
    /**
    * Declaring exponent variable.
    */
    public static final String SCISSORONE = "The computer selected: Scissor";

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private RockPaperScissors() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting...
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Checks if there is an Invalid Input.
        try {
            // print at first
            System.out.print("------------ROCK--PAPER--SCISSORS------------");
            System.out.println(SPACE + "--------Pick a number from the Menu----------");
            System.out.print("---------------------------------------------");
            System.out.println(SPACE + "Game Menu");
            System.out.println("---------");
            System.out.println("1.Rock");
            System.out.println("2.Paper");
            System.out.println("3.Scissors");

            // Input
            System.out.print(SPACE + "Enter your choice: ");
            // Create a scanner object
            final Scanner scanner = new Scanner(System.in);
            final int userinput = scanner.nextInt();
            // create a random number
            final Random random = new Random();
            final int computerinput = random.nextInt(THREE) + 1;

            if (userinput == 1 && computerinput == 1) {
                System.out.print(SPACE + ROCK);
                System.out.println(SPACE + ROCKONE);
                System.out.println(SPACE + SAME);
            } else if (userinput == 2 && computerinput == 2) {
                System.out.print(SPACE + PAPER);
                System.out.println(SPACE + PAPERONE);
                System.out.println(SPACE + SAME);
            } else if (userinput == THREE && computerinput == THREE) {
                System.out.print(SPACE + SCISSOR);
                System.out.println(SPACE + SCISSORONE);
                System.out.println(SPACE + SAME);
            } else if (userinput == 1 && computerinput == THREE) {
                System.out.print(SPACE + ROCK);
                System.out.println(SPACE + SCISSORONE);
                System.out.println(SPACE + "YOU WIN! Rock breaks Scissor");
            } else if (userinput == 2 && computerinput == 1) {
                System.out.print(SPACE + PAPER);
                System.out.println(SPACE + ROCKONE);
                System.out.println(SPACE + "YOU WIN! Paper wraps Rock");
            } else if (userinput == THREE && computerinput == 2) {
                System.out.print(SPACE + SCISSOR);
                System.out.println(SPACE + PAPERONE);
                System.out.println(SPACE + "YOU WIN! Scissor cuts Paper");
            } else if (userinput == THREE && computerinput == 1) {
                System.out.print(SPACE + SCISSOR);
                System.out.println(SPACE + ROCKONE);
                System.out.println(SPACE + "YOU LOSE! Rock breaks Scissors");
            } else if (userinput == 1 && computerinput == 2) {
                System.out.print(SPACE + ROCK);
                System.out.println(SPACE + PAPERONE);
                System.out.println(SPACE + "YOU LOSE! Paper wraps Rock");
            } else if (userinput == 2 && computerinput == THREE) {
                System.out.print(SPACE + PAPER);
                System.out.println(SPACE + SCISSORONE);
                System.out.println(SPACE + "YOU LOSE! Scissor cuts Paper");
            } else if (userinput > THREE) {
                System.out.print(SPACE + "You should pick one");
                System.out.print(" number from the Menu!" + SPACE);
            }

        } catch (java.util.InputMismatchException errorCode) {
            System.out.println(SPACE + "Invalid Input! look at the Game Menu.");
        }
        System.out.println("\nDone.");
    }
}
