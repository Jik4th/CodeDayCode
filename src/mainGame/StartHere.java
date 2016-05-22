package mainGame;
// import scanner
import java.util.Scanner;

public class StartHere {

	public static void main(String[] args) {
		// Create new scanner object
		Scanner input = new Scanner(System.in);
		
		// Declare Variables
		String response;
		
		System.out.println("Welcome to Space Adventure 2402");
		System.out.println("-------------------------------");
		System.out.println("[incoming transmission]");
		System.out.println("[Transmission Succesful!]");
		System.out.println("[Recieving Location]");
		System.out.println("[Location recieved]: Hydra Starship");
		response = input.next();
		if (response.equals(""))
		System.out.println("Unkown: Hello? Can anyone hear me? (yes/no)");
		response = input.next();
		
		if (response.equals("yes"))
			System.out.println("Yes, finally.");
		else{
			System.out.println("GAME ENDED");
			System.exit(0);
		} // end else
		
		System.out.println("Dank: My name is Dank, I am a robot. The ship that I was on just crashed and I seem to be the only survivor.");
		System.out.println("I was sent onto this ship on a mission to clear the illegal disease and species that is on board.");
		System.out.println("Thankfully the disease has escaped to deep space, where no harm can be done.");
		System.out.println("Unfortunatly, the species still exists on board in seperate rooms.");
		System.out.println("Should I go into the rooms? (yes/no)");
		response = input.next();
		
		if (response.equals("yes"));{
			System.out.println("I was sent up here with millitary fighters.");
			System.out.println(" They were supposed to guide me to the control room so I can enable a virus onto the starboard so it can self-destruct");
			System.out.println("Let me send you a map of the ship before I go in.");
		} // end if
		if (response.equals("no")) {
			System.out.println("Good call, I didn't know if I was going to survive in there or not.");
		} // end else
		
		
	} // end main method
	
} // end class StartHere