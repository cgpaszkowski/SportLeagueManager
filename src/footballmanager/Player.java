package footballmanager;


public class Player {
	
	private String fname, lname, position;
	private int number, goals, cards, yellow, red;	
	
	public Player(String fname, String lname, String position, int number) {
		this.fname = fname;
		this.lname = lname;
		this.position = position;
		this.number = number;
		goals = 0;
		yellow = 0;
		red = 0;
	}
	
	public void setFName(String fname) {
		this.fname = fname;
	}
	
	public void setLName(String lname) {
		this.lname = lname;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void addGoals(int goals) {
		this.goals += goals;
	}
	
	public void addYellow(int yel) {		//can get two yellows
		yellow += yel;
	}
	
	public void addRed() {		//can only get one red per game
		red++;
	}
	
	public String getFName() {
		return fname;
	}
	
	public String getLName() {
		return lname;
	}
	
	public String getPosition() {
		return position;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getGoals() {
		return goals;
	}
	
	public int getYellow() {
		return yellow;
	}
	
	public int getRed() {
		return red;
	}
	
	public String toString() {
		return "Player Name: " + lname + ", " + fname + "\nPosition: " + position + "\nNumber: " + number;
	}
	
}
