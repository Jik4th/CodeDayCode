package mainGame;
// import scanner
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


//Looks Balla af -- JH

public class StartHere {
	public static String item = "nothing";
	public static int Power1 = 0;
	public static int Power2 = 0;
	public static int Power3 = 0;
	public static int Health = 12;

	public static void main(String[] args) {
		// Create new scanner object
		Scanner input = new Scanner(System.in);
		int time = 1500;
		// Declare Variables
		String response;
		
		System.out.println("Welcome to Space Adventure 2402");
		System.out.println("-------------------------------");
		delay(time);
		System.out.println("[incoming transmission]");
		delay(time);
		System.out.println("[Transmission Succesful!]");
		delay(time);
		System.out.println("[Recieving Location]");
		delay(time);
		System.out.println("[Location recieved]: Hydra Starship");
		delay(time);
		System.out.println("Unknown: Hello? Can anyone hear me? (yes/no)");
		response = input.next();
		
		if (response.equals("yes"))
			System.out.println("Dank: Yes, finally.");
		else{
			System.out.println("GAME ENDED");
			System.exit(0);
		} // end else
		

		delay(time);
		System.out.println("My name is Dank, I am your 1-800-911 Police Launcher Drone, or PLD for short. The ship that I was on just crashed and I seem to be the only survivor.");
		delay(time);

		delay(time);
		System.out.println("The ship that I was on just crashed and I seem to be the only survivor.");
		delay(time);

		System.out.println("I was sent onto this ship on a mission to clear the illegal disease and species that is on board.");
		delay(time);
		System.out.println("Thankfully the disease has escaped to deep space, where no harm can be done.");
		delay(time);
		System.out.println("Unfortunatly, the species still exists on board in seperate rooms.");
		
		delay(time);
		System.out.println("Should I go into the rooms? (yes/no)");
		response = input.next();
		
		if (response.equals("yes")){
			System.out.println("I was sent up here with millitary fighters.");
			delay(time);
			System.out.println("They were supposed to guide me to the control room so I can enable a virus onto the starboard so it can self-destruct");

			delay(time);

			delay(time);
			// map
			System.out.println("Let me send you a map of the ship before I go in.");
			System.out.println("               ________________");
			System.out.println("               |              |");
			System.out.println("               |              |");
			System.out.println("               |   room 3     |");
			System.out.println("               |              |");
			System.out.println("               |              |");
			System.out.println("               -------  -------");
			System.out.println("                     |  |      ");
			System.out.println("_____________  -------  -------  ______________");
			System.out.println("|           |  |              |  |            |");
			System.out.println("|           |__|              |__|            |");
			System.out.println("|  room 1          I am here        Auxillary |");
			System.out.println("|           |--|              |--|    Room    |");
			System.out.println("|           |  |              |  |            |");
			System.out.println(" ------------  -------  -------  -------------");
			System.out.println("                     |  |      ");
			System.out.println("               -------  -------");
			System.out.println("               |              |");
			System.out.println("               |              |");
			System.out.println("               |   room 2     |");
			System.out.println("               |              |");
			System.out.println("               |              |");
			System.out.println("               ----------------");
			System.out.println("Guide me by saying left, right, forward, backward, pick, and place.\n Try to get all three power cells into the three generators to destroy the ship\n" );
			mainRoom.Mainstart();
		} // end if
		else if (response.equals("no")) {
			System.out.println("Good call, I didn't know if I was going to survive in there or not.");
			System.exit(0);
		} // end else
		
		
	} // end main method
	
	public static void delay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException exp) {
        }
	} // end delay method

	
} // end class StartHere