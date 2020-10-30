package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {

    //create a variable to hold the user response using the Scanner object. The response needs to be an integer between 1-3 (1 = Rock, 2 = Paper, 3 = Scissors)
    int response;
    // create a variable to hold the cpu response generated by the getCPUResponse() method.
    int cpuResponse = getCPUResponse();

    String cpuWins;
    String playerWins;

    public int startGame() {
        Scanner scanner = new Scanner(System.in);

        //start game
        System.out.println("Proceed if you dare (-_-) Enter a number between 1-3");
        response = scanner.nextInt();

        if (response == 1) {
            System.out.println("Rock");
        } else if (response == 2) {
            System.out.println("Paper");
        } else if (response == 3) {
            System.out.println("Scissors");
        } else {
            System.out.println("Don't be stupid! try again");
        }

        //compare user and cpu response with each other to decide the winner.
        if (response == cpuResponse) {
            System.out.println("game draw");
            return 0;
        }
        else if ((response == 1) && (cpuResponse == 2)) {
            System.out.println("cpu has won");
            return 1;
        }
        else if ((response == 2) && (cpuResponse == 3)) {
            System.out.println("cpu has won");
            return 1;
        }
        else if ((response == 3) && (cpuResponse == 1)) {
            System.out.println("cpu has won");
            return 1;
        }
        else
            System.out.println("you have won!");
            return 2;
        }



    public int getCPUResponse(){
        // Generate random integers in range 1 to 3
        Random rand = new Random();
        int upperbound = 4;
        int cpuResponse = rand.nextInt(upperbound);
    }
}
