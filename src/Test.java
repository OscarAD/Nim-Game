/*
 File Name: Assignment #3
 Programmer's Name: Oscar A. Diaz
 Panther ID: 4954254
 Instructor: Greg Shaw COP3337

 Program's Purpose: This program will simulate a game of Nim between two
 players. The players will take turns removing marbles from a pile. On each turn,
 the player must remove at least one but no more than half of the remaining 
 marbles. The player who is forced to remove the last marble loses.

 Disclaimer:
 I hereby declare that this program is my own original work and has not been 
 submitted before to any institution for assessment purposes.

 Oscar D.
 */
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        //Holds player's  name.
        String name;

        //Used to store user's input
        char answer;

        //Booleans to determine first/second player & playing smart oponent.
        boolean goFirst = false;
        boolean smartComputer = false;

        //Determine if user wants to play again.
        boolean playAgain = false;

        System.out.print("Welcome to the Ancient and Honorable Game of Nim\n");

        //Reads and stores name.
        System.out.print("Human, what is your name? ");
        name = reader.nextLine();
        System.out.print("\n");

        //Do while loop to keep playing, unless user chooses not to play again.
        do {

            if (playAgain == true) {
                System.out.print("\n\n----------------NEW GAME----------------\n\n");

            }

            //Do while loop to determine playing smart or dumb computer.
            do {

                System.out.print(name + ", would you challenge the smart computer? y/n: ");
                answer = reader.next().charAt(0);

                //If playing smart computer.
                if (answer == 'y') {

                    //Set smartComputer variable to true.
                    smartComputer = true;
                    System.out.print("You must know what you are doing...\n\n");

                } //If playing dumb computer.
                else if (answer == 'n') {

                    //Set smartComputer variable to false.
                    smartComputer = false;
                    System.out.print("Computer is not so smart, but computer will try.\n\n");

                } 

                //If an invalid charater is entered.
                else {

                    System.out.println("Enter valid character");
                }

            } while ((answer != 'y') && (answer != 'n'));

            //Do while loop to determine if human goes first or second.
            do {

                //Asks user and stores answer.
                System.out.print(name + ", would you like to play first? 'y/n': ");
                answer = reader.next().charAt(0);

                //If answer is yes, sets goFirst to true.
                if (answer == 'y') {
                    
                    goFirst = true;
                    System.out.print("You will be the first player!\n\n");
                    
                } 
                //If answer is no, sets goFirst to false.
                else if (answer == 'n') {
                    
                    goFirst = false;
                    System.out.print("You will be the second player!\n\n");
                    
                } 
                
                //If an invalid charater is entered.
                else {

                    System.out.println("Enter valid character");
                }

            } while ((answer != 'y') && (answer != 'n'));

            System.out.print("\n");

            
            //New pile object created.
            Pile thePile = new Pile();
           
            //New Nim object created.
            Nim game = new Nim();

            
            //If player goes first.
            if (goFirst == true) {
                
                //New human player created as player1.
                HumanPlayer player1 = new HumanPlayer();

                //If playing smart computer.
                if (smartComputer == true) {
                    //New smart computer player created as player2.
                    SmartComputer player2 = new SmartComputer();
                    
                    //Pass player1,player2 and pile to play method.
                    game.play(player1, player2, thePile);
                    
                  //If playing dumb computer.
                } else if (smartComputer == false) {
                    //New dumb computer player created as player2.
                    DumbComputer player2 = new DumbComputer();
                    
                    //Pass player1,player2 and pile to play method.
                    game.play(player1, player2, thePile);

                }

              //If player goes second.  
            } else if (goFirst == false) {
                
                //New human player created as player2.
                HumanPlayer player2 = new HumanPlayer();

                //If playing smart computer.
                if (smartComputer == true) {
                    //New smart computer player created as player1.
                    SmartComputer player1 = new SmartComputer();
                    
                    //Pass player1,player2 and pile to play method.
                    game.play(player1, player2, thePile);

                  ////If playing dumb computer.
                } else if (smartComputer == false) {
                    //New dumb computer player created as player2.
                    DumbComputer player1 = new DumbComputer();
                    
                    //Pass player1,player2 and pile to play method. 
                    game.play(player1, player2, thePile);

                }

            }

            //Do while containing input validation.
            //Asks user to keep playing the game.
            do {
                System.out.print(name + ", would you like to play again? y/n: ");
                answer = reader.next().charAt(0);

                if (answer == 'y') {
                    playAgain = true;
                } else if (answer == 'n') {
                    System.exit(0);
                } else {

                    System.out.println("Enter valid character");
                }

            } while ((answer != 'y') && (answer != 'n'));
            
        } while (!playAgain == false);
    }
}
