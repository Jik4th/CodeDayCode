package mainGame;
import java.util.Scanner;

public class mainRoom {

	
	public static void delay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException exp) {
        }
	} 
	public static void Mainstart(){
		String response;
		Scanner input = new Scanner(System.in);
		while (StartHere.Health > 1) {
			delay(1000);
		System.out.println("Dank is now in the Main Room. Here is a picture  What would you like to do?");
	
		response = input.next();
		
		if(response.contains("Look Around")){
			System.out.println("Dank is in a circular room with four doors and a command console in the center.");
		}
		else if (response.contains("left")) {
			System.out.println("Dank goes through the left door into another room.");
			Room1.Roomstart();
		}
		else if (response.contains("right")){
			System.out.println("Dank goes through the right door into another room.");
			PowerRoom.Powerstart();
		}
		else if (response.contains("pick")){
			System.out.println("There is nothing to pick up");
		}
		else if (response.contains("attack")){
			System.out.println("There is nothing to attack");
		}
		else if (response.contains("forward")) {
			System.out.println("Dank moves forward through the door to its front.");
			Room3.Room3Start();
		}
		else if (response.contains("backward")){
			System.out.println("Dank turns around and moves through the door to its rear.");
			Room2.Room2start();
		}
		else if (response.equals("attack with item")){
			System.out.println("There is nothing to pick up");
		}
		else if (response.contains("access console")){
			System.out.println("Here is a map");
	
		}
		else if (response.contains("place ")){
			System.out.println("You cant place anything here");

		}

	}
	
	System.out.println("Game OVER");
	
}  //id rename the function from powerstart to something relevent. -- br
    
   

}
