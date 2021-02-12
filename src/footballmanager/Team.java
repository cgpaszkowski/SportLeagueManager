package footballmanager;

import java.util.ArrayList;

public class Team {
	
	private ArrayList<Player> team;
	private ArrayList<Game> games;
	private Player player;
	private String tName;
	
        public Team(){
            team = new ArrayList<Player>();
            games = new ArrayList<Game>();
        }
        
	public Team(String tName) {
            this.tName = tName;
            team = new ArrayList<Player>();
            games = new ArrayList<Game>();
	}
	
        public void setName(String tName){
            this.tName = tName;
        }
        
	public void addPlayer(Player player) {
            team.add(player);
	}
	
	public void removePlayer(Player player) {
            if(team.contains(player)) {
                    team.remove(player);
            }
	}
	
	public void addGame(Game game) {
            games.add(game);
	}
	
	public String getName() {
            return tName;
	}
	
	public String getRoster() {
            return team.toString();
	}
	
	public String getSchedule() {			//should change data type???
            return games.toString();
	}
	
	public String toString() {
            for (int i = 0; i >= team.size(); i++) {
                    System.out.println(team.get(i).toString());
            }
            return "temp TEAM CLASS toString()";
	}
	
}
