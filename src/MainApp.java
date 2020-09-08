import footballmanager.ScheduleMaker;
import footballmanager.Player;
import footballmanager.Team;
import footballmanager.gui.WelcomeScreen;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
	public static void main(String[]args) {
                
                startUp();
            
		Scanner keyb = new Scanner(System.in);
		
		ArrayList<Team> league = new ArrayList<Team>();
		Team team1;
		Player player1;
		
		System.out.println("How many teams?: ");
		int t = keyb.nextInt();
		keyb.nextLine();
		
		while(t > 0 ) {
			System.out.println("Enter Team Name: ");
			String teamName = keyb.next();
			team1 = new Team(teamName);
			keyb.nextLine();																				//error handling
			
			System.out.println("Add players now? (1-yes / 2-no): ");
			boolean next;
			if (keyb.nextInt() == 1) {
				next = true;
			}
			else {
				next = false;
			}
			
			while(next) {																	
				System.out.println("Enter player name, surname (or exit): ");
				String name = keyb.next();
				if (name.equals("exit")) {
					break;
				}
				String surname = keyb.next();
				System.out.println("Enter player position (1-GK, 2-DF, 3-MF, 4-ATT) and number: ");
				String pos = keyb.next();
				keyb.nextLine(); 																			//error handling
				int num = keyb.nextInt();
				player1 = new Player(name, surname, pos, num);
				team1.addPlayer(player1);
			}
			
			league.add(team1);
			t--;
		}
		
		ScheduleMaker schedule = new ScheduleMaker(league);
		
		System.out.println("League Schedule: ");
		schedule.leagueSchedule();
		
	}
        
        public static void startUp(){
            
            //open home screen
            WelcomeScreen home = new WelcomeScreen();
            home.setVisible(true);
        }
}
