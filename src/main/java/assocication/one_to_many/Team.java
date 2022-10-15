package assocication.one_to_many;

import java.util.ArrayList;
import java.util.List;

public class Team {
    public List<Player> players; // this row from Team class links to many player objects
    private String teamName;

    public Team(String teamName) {
        players = new ArrayList<>();
        setTeamName(teamName);
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }



    @Override
    public String toString() {
        return getTeamName();
    }
}
