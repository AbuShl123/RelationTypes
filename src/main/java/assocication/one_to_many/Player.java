package assocication.one_to_many;

public class Player {
    public static int counter = 0;

    public Team team; // this Player object links to only one object -- Team
    int playerNumber;

    public Player() {
        playerNumber = counter++;
    }

    @Override
    public String toString() {
        return "player #" + playerNumber;
    }
}
