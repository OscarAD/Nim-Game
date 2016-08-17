
/*
 File Name: Assignment #3
 Programmer's Name: Oscar A. Diaz
 Instructor: Greg Shaw COP3337
 */
import java.util.Random;

/**
 * Class implements Player, models a computer player which will take a random
 * allowed number of marbles from the pile.
 */
class DumbComputer implements Player {

    //Construct a Random object named randNum.
    Random randNum = new Random();

    /**
     * Move method, which chooses a random number of marbles to take, as long as
     * it is within limits.
     *
     * @param marbles Current number of marbles on the table.
     * @return Number of marbles the computer will take.
     */
    @Override
    public int move(int marbles) {
        //Number of marbles the computer will take.
        int take = 0;

        //Generates a number of marbles to take, as long as there are enough.
        if (marbles > 1) {
            take = (randNum.nextInt(marbles / 2) + 1);

            //If only one marble is left, takes it.
        } else if (marbles == 1) {
            take = 1;
        }

        //Displays the number of marbles taken.
        System.out.print("Marbles taken by computer: " + take + "\n");

        //Returns the number of marbles the computer took.
        return take;

    }

}
