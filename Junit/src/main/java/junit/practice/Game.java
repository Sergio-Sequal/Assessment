package junit.practice;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    public void play() {
        //start game
        printGameRules();
        String choice = input.nextLine().toLowerCase(); //prompt response

        //initialize variables
        int tienum = 0;
        int winnum = 0;
        int lossnum = 0;

        //do the following if the user does not put in "quit"
        while (!choice.equals("quit")) {
            int choicenum = getChoiceNum(choice);
            //not valid responses
            if (choicenum == 0) {
                //continue while user input is still not valid
                while (choicenum == 0) {
                    System.out.println("Sorry, it looks like you didn't enter a correct input. Try again.");
                    choice = input.nextLine().toLowerCase();
                    choicenum = getChoiceNum(choice);
                }
            }
            int compnum = computerChoise();

            if (choicenum == compnum) //tie cases
            {
                System.out.println("It's a tie");
                tienum++;
            } else if (choicenum == 1 && compnum == 3) //user wins rock vs scissors
            {
                System.out.println("you win!");
                winnum++;
            } else if (choicenum == 3 && compnum == 2) //user wins scissors vs paper
            {
                System.out.println("you win!");
                winnum++;
            } else if (choicenum == 2 && compnum == 1) //user wins paper vs rock
            {
                System.out.println("you win!");
                winnum++;
            } else //otherwise computer wins
            {
                System.out.println("you lose.");
                lossnum++;
            }
            System.out.println("wins:" + winnum + "\nloses:" + lossnum + "\nties:" + tienum); //print out number of wins, ties, and loses
            System.out.println("Let's play again! \n \n"); //start game again
            System.out.println("Say \"Rock\", \"Paper\", or \"Scissors\" to indicate your choice. Otherwise say \"Quit\" to quit.");
            choice = input.nextLine().toLowerCase(); //prompt for new user input

        }
        if (choice.equals("quit")) //if user prints "quit", then quit program
        {
            return;
        }
    }

    private int getChoiceNum(String choice) {
        int choicenum = 0;

        switch (choice) {
            case "rock":
                choicenum = 1;
                break;
            case "paper":
                choicenum = 2;
                break;
            case "scissors":
                choicenum = 3;
                break;
            case "quit":
                System.exit(0); //quit program
            default:
                break;
        }
        return choicenum;
    }

    public void printGameRules() {
        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("Say \"Rock\", \"Paper\", or \"Scissors\" to indicate your choice. Otherwise say \"Quit\" to quit.");
    }

    private int computerChoise() {
        int compnum = random.nextInt(3) + 1;//computer generate random num
        //print computer choice
        if (compnum == 1) {
            System.out.println("Computer chose rock");
        }
        if (compnum == 2) {
            System.out.println("Computer chose paper");
        }
        if (compnum == 3) {
            System.out.println("Computer chose scissors");
        }
        return compnum;
    }
}
