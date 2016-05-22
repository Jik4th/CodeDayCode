package mainGame;
// import scanner
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class StartHere {

	public static void main(String[] args) {
		// Create new scanner object
		Scanner input = new Scanner(System.in);
		
		// Declare Variables
		String response;
		
		System.out.println("Welcome to Space Adventure 2402");
		System.out.println("-------------------------------");
		delay(3000);
		System.out.println("[incoming transmission]");
		delay(3000);
		System.out.println("[Transmission Succesful!]");
		delay(3000);
		System.out.println("[Recieving Location]");
		delay(3000);
		System.out.println("[Location recieved]: Hydra Starship");
		delay(3000);
		System.out.println("Unkown: Hello? Can anyone hear me? (yes/no)");
		response = input.next();
		
		if (response.equals("yes"))
			System.out.println("Dank: Yes, finally.");
		else{
			System.out.println("GAME ENDED");
			System.exit(0);
		} // end else
		
		delay(3000);
		System.out.println("My name is Dank, I am a robot. The ship that I was on just crashed and I seem to be the only survivor.");
		delay(3000);
		System.out.println("I was sent onto this ship on a mission to clear the illegal disease and species that is on board.");
		delay(3000);
		System.out.println("Thankfully the disease has escaped to deep space, where no harm can be done.");
		delay(3000);
		System.out.println("Unfortunatly, the species still exists on board in seperate rooms.");
		delay(3000);
		System.out.println("Should I go into the rooms? (yes/no)");
		response = input.next();
		
		if (response.equals("yes"));{
			System.out.println("I was sent up here with millitary fighters.");
			delay(3000);
			System.out.println("They were supposed to guide me to the control room so I can enable a virus onto the starboard so it can self-destruct");
			delay(3000);
			System.out.println("Let me send you a map of the ship before I go in.");
		} // end if
		if (response.equals("no")) {
			System.out.println("Good call, I didn't know if I was going to survive in there or not.");
		} // end else
		
		
	} // end main method
	
	public static void delay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException exp) {
        }
	} // end delay method

	
} // end class StartHere