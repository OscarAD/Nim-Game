
/*
 File Name: Assignment #3
 Programmer's Name: Oscar A. Diaz
 Instructor: Greg Shaw COP3337
 */
import java.util.Random;

/**
 * Class which will model the pile of marbles on the table. It will start with 
 * a random number of marbles ranging from 10 to 100. It will also keep count of
 * the marbles left during the game.
 */
public class Pile {

    //Determine the minimum and maximum number of marbles to be generated.
    final int max = 100;
    final int min = 10;

    //Construct a Random object named randNum.
    Random randNum = new Random();

    //Generates a random number of marbles using min & max. Stores in marbles.
    int marbles = randNum.nextInt((max - min) + 1) + min;

    /**
     * The size method will keep track of how many marbles are left.
     *
     * @param taken Number of marbles to be removed from pile.
     * @return Number of marbles left on the board.
     */
    public int size(int taken) {

        //Removes marbles from pile.
        marbles -= taken;

        //Display number of marbles left after player move.
        System.out.print("Marbles left:" + marbles + "\n");

        //Return number of marbles left.
        return marbles;

    }

}
