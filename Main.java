package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String trash = "";
        String YNResponse = "";
        boolean done = false;

        do
        {
            System.out.println("Player A, please make your move [R,P,S]: ");
            String playerA = "";
            playerA = in.nextLine();
            System.out.println("PlayerB, please make your move [R,P,S]: ");
            String playerB ="";
            playerB = in.nextLine();
            if (playerA.equalsIgnoreCase("R"))
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock vs. Rock. It's a tie!");
                }
                else if (playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("Rock breaks Scissors. Player A wins!");
                }
                else
                {
                    System.out.println("Paper covers Rock. PLayer B wins!");
                }
            }
            else if (playerA.equalsIgnoreCase("S"))
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock breaks Scissors. Player B wins!");
                }
                else if (playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors vs. Scissors. It's a tie!");
                }
                else
                {
                    System.out.println("Scissor cuts Paper. Player A wins!");
                }
            }
            else if (playerA.equalsIgnoreCase("P"))
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers Rock. Player A wins!");
                }
                else if (playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissor cuts Paper. Player B wins!");
                }
                else
                {
                    System.out.println("Paper vs. Paper. It's a tie!");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered an incorrect value");
                System.out.println("Please restart the program and enter the right input");
                System.exit(0);
            }

            System.out.println("Do you want to play again [Y/N]: ");
            YNResponse = in.nextLine();
            if (YNResponse.equalsIgnoreCase("N"))
            {
                done = true;
            }

        } while(!done);
    }
}
