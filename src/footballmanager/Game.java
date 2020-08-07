package footballmanager;


import footballmanager.Player;
import footballmanager.Team;


public class Game {
	
	private String team1, team2, location;
	private int date, time, scoreH, scoreA;
	
	public Game(Team team1, Team team2) { 			//String location, int date, int time
		this.team1 = team1.getName();
		this.team2 = team2.getName();
		location = "";
		//this.date = date;
		//this.time = time;
		scoreH = 0;
		scoreA = 0;
	}
	
	public void setTeam1() {
		this.team1 = team1;
	}
	
	public void setTeam2() {
		this.team1 = team1;
	}
	
	public void setLocation() {
		this.location = location;
	}
	
	public void setDate() {
		this.date = date;
	}
	
	public void setTime() {
		this.time = time;
	}
	
	public void setScore(int scoreH, int scoreA) {
		this.scoreH = scoreH;
		this.scoreA = scoreA;
	}
	
	public void addScorer(Player player, int goals) {
		player.addGoals(goals);
	}
	
	public void addYellow(Player player, int yel) {
		player.addYellow(yel);
	}
	
	public void addRed(Player player) {
		player.addRed();
	}
	
	public String getGame() {
		return "(H) " + team1 + " - (A) " + team2 + "\nLocation: " + location + "\nScore: " + scoreH + " - " + scoreA + "\n";
	}
	
}
