package footballmanager;

import footballmanager.Game;
import footballmanager.Team;
import java.util.ArrayList;

public class ScheduleMaker {
	
	private ArrayList<Game> schedule;
	private Game game;
	
	public ScheduleMaker(ArrayList<Team> league) {		//Make League Schedule with all teams
		schedule = new ArrayList<Game>();
		
		for(int i = 0; i < league.size(); i++) {
			for(int k = 0; k < league.size(); k++) {
				if (i != k) {
					game = new Game(league.get(i), league.get(k));		//Game(String team1, String team2)        //String location, int date, int time)
					league.get(i).addGame(game);
					league.get(k).addGame(game);
					schedule.add(game);
				}
				else continue;
			}
		}
			
	}
	
	public void leagueSchedule() {
		for (int i = 0; i <= schedule.size(); i++) {
			try {
				System.out.println(schedule.get(i).getGame());
			}
			catch (Exception e) {
				continue;
			}
			
		}
	}
	
	
}
