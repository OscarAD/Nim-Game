
/*
 File Name: Assignment #3
 Programmer's Name: Oscar A. Diaz
 Instructor: Greg Shaw COP3337
 */
/**
 * Class models a game of Nim between two players.
 */
public class Nim {

    /**
     * The play method will consist of these two players taking turns until
     * one player is left with the last marble, making the other player the winner.
     *
     * @param player1 First player implementing Player.
     * @param player2 Second player implementing Player.
     * @param marblePile Current number of marbles on the table.
     */
    public void play(Player player1, Player player2, Pile marblePile) {

        //Number of marbles player decided to take.
        int taken;

        System.out.print("----------------NEW GAME----------------\n\n");

        //Display total number marbles at the beginning of each game.
        System.out.print("Ammount of marbles on the table: "
                + marblePile.marbles + "\n\n");

        //Do while to keep taking turns as long as there are marbles.
        do {

            //Move method of player 1 is called and passed number of marbles.
            taken = player1.move(marblePile.marbles);

            //If player 1 is left with last marble on table, oponent wins.
            if (marblePile.size(taken) == 1) {
                System.out.print("\nFIRST PLAYER WINS!\n\n");
                //Ends turn taking.
                break;
            }

            //Move method of player 2 is called and passed number of marbles.
            taken = player2.move(marblePile.marbles);

            //If player 2 is left with last marble on table, oponent wins.
            if (marblePile.size(taken) == 1) {
                System.out.print("\nSECOND PLAYER WINS!\n\n");
                //Ends turn taking.
                break;
            }

        } while (marblePile.marbles > 0);

    }

}
