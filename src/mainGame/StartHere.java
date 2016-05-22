package mainGame;
// import scanner
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//Looks Balla af -- JH

public class StartHere {

	public static void main(String[] args) {
		// Create new scanner object
		Scanner input = new Scanner(System.in);
		
		// Declare Variables
		String response;
		
		System.out.println("Welcome to Space Adventure 2402");
		System.out.println("-------------------------------");
		delay(2000);
		System.out.println("[incoming transmission]");
		delay(2000);
		System.out.println("[Transmission Succesful!]");
		delay(2000);
		System.out.println("[Recieving Location]");
		delay(2000);
		System.out.println("[Location recieved]: Hydra Starship");
<<<<<<< HEAD
		delay(3000);
		System.out.println("Unknown: Hello? Can anyone hear me? (yes/no)");
=======
		delay(2000);
		System.out.println("Unkown: Hello? Can anyone hear me? (yes/no)");
>>>>>>> origin/master
		response = input.next();
		
		if (response.equals("yes"))
			System.out.println("Dank: Yes, finally.");
		else{
			System.out.println("GAME ENDED");
			System.exit(0);
		} // end else
		
<<<<<<< HEAD
		delay(3000);
		System.out.println("My name is Dank, I am your 1-800-911 Police Launcher Drone, or PLD for short. The ship that I was on just crashed and I seem to be the only survivor.");
		delay(3000);
=======
		delay(2000);
		System.out.println("My name is Dank, I am a robot. The ship that I was on just crashed and I seem to be the only survivor.");
		delay(2000);
>>>>>>> origin/master
		System.out.println("I was sent onto this ship on a mission to clear the illegal disease and species that is on board.");
		delay(2000);
		System.out.println("Thankfully the disease has escaped to deep space, where no harm can be done.");
		delay(2000);
		System.out.println("Unfortunatly, the species still exists on board in seperate rooms.");
		delay(2000);
		System.out.println("Should I go into the rooms? (yes/no)");
		response = input.next();
		
		if (response.equals("yes")){
			System.out.println("I was sent up here with millitary fighters.");
			delay(2000);
			System.out.println("They were supposed to guide me to the control room so I can enable a virus onto the starboard so it can self-destruct");
<<<<<<< HEAD
			delay(3000);
=======
			delay(2000);
			System.out.println("Let me send you a map of the ship before I go in.");
>>>>>>> origin/master
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