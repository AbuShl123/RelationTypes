package assocication.one_to_many;

public class ProgramTest {
    // one-to-many relationship -->
    // one row from table A links to many rows from table B
    // one row from table B links to only one row from table A
    public static void main(String[] args) {
        Team team = new Team("Smite ghosts");

        Player abu = null;
        for (int i = 0; i < 11; i++) {
            Player player = new Player();
            player.team = team;
            team.players.add(player);
            // player.team.players.add(player); // 0_o (possible variant)
            // all two ways above provide the same result!!

            if (i == 9) abu = player;
        }

        System.out.println(team.players);

        assert abu != null;
        System.out.println("Abu is " + abu);
        System.out.println("team size = " + abu.team.players.size());

        if (abu.team == team) {
            System.out.println(abu + " is in the team");
        } else {
            System.out.println(abu + " is not in the team");
        }

        System.out.println(team.players.contains(abu));
        // if it gives true result, so it means Abu in the team
    }
}
