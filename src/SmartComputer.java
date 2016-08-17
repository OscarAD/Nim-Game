
/*
 File Name: Assignment #3
 Programmer's Name: Oscar A. Diaz
 Instructor: Greg Shaw COP3337
 */

/**
 * Class implements Player, models a computer player which removes exactly 
 * enough marbles to make the remaining pile a power of two minus one 
 * (1, 3, 7, 15, 31, or 63).
 */
class SmartComputer implements Player {

    /**
     * Move method, which chooses the right number of marbles to make the 
     * remaining pile a power of two minus one.
     *
     * @param marbles Current number of marbles on the table.
     * @return Number of marbles the smart computer will take.
     */
    @Override
    public int move(int marbles) {
        
        //Number of marbles to take.
        int take = 0;

        
        if ((marbles/2) >= (marbles-1))
        {
            take = (marbles - 1);
        }
        else if ((marbles/2) >= (marbles-3))
        {
            take = (marbles-3);
        }
        else if ((marbles/2) >= (marbles-7))
        {
            take = (marbles-7);
        }
        else if ((marbles/2) >= (marbles-15))
        {
            take = (marbles - 15);
        }
        else if ((marbles/2) >= (marbles-31))
        {
            take = (marbles - 31);
        }
        else if ((marbles/2) >= (marbles-63))
        {
            take = (marbles - 63);
        }
        System.out.print("Marbles taken by computer: " + take + "\n");

        //Returns number of marbles computer took.
        return take;

    }

}