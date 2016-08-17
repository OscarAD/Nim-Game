
/*
 File Name: Assignment #3
 Programmer's Name: Oscar A. Diaz
 Instructor: Greg Shaw COP3337
 */
import java.util.Scanner;

/**
 * Class implements Player, models a human player which will be asked how many
 * marbles to take within an allowed number.
 */
class HumanPlayer implements Player {

    //Construct a Scanner object named input.
    private Scanner input;

    /**
     * Move method which allows human to take as number of marbles, as long as
     * it is within limits.
     *
     * @param marbles Current number of marbles on the table.
     * @return Number of marbles the human will take.
     */
    @Override
    public int move(int marbles) {

        //Input will read from standard input.
        input = new Scanner(System.in);

        //Number of marbles the human will take.
        int take = 0;

        //Do while to check for input validation.
        do {

            System.out.print("\nHuman, how many to take?: ");
            //Asks for number of marbles to take, reads it and stores in take.
            take = input.nextInt();

            //Not allow taking more than half or negative number of marbles.
            if (take > (marbles / 2) || (take < 1)) {

                System.out.print("Invalid number entered\n");
            }

        } while ((take > (marbles / 2)) || (take < 1));

        //Returns the number of marbles the human took.
        return take;
    }

}
