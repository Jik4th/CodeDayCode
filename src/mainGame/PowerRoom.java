package mainGame;

import java.util.Scanner;

public class PowerRoom {

	public static void delay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException exp) {
        }
	} // end delay method

	
	@SuppressWarnings("unused")
	public static void Powerstart() { // Sup with all these inputs?

		String response;
		Scanner input = new Scanner(System.in);
		while (StartHere.Health > 1) {
			delay(1000);
			System.out.println("You are now in the Auxillary Power Room. There are three generators across one wall. What would you like to do.");
			response = input.next();

			if (response.contains("look")) {
				if (StartHere.Power1 == 1 && StartHere.Power2 == 0 && StartHere.Power3 == 0) {
					System.out.println("There is a power cell in generator 1, but not two or three");
				} 
				else if (StartHere.Power1 == 0 && StartHere.Power2 == 0 && StartHere.Power3 == 0) {
					System.out.println("There is no power cell in generator 1, 2, or 3!");
				} 
				else if (StartHere.Power1 == 1 && StartHere.Power2 == 1 && StartHere.Power3 == 0) {
					System.out.println("There is a power cell in generators 1 and 2!");
				}
				else if (StartHere.Power1 == 1 && StartHere.Power2 == 1 && StartHere.Power3 == 1) {
					System.out.println("There is a power cell in generators 1, 2, and 3! You win");
				}

			} 
			else if (response.contains("left")) {
				System.out.println("You are moving back!");
				mainRoom.Mainstart();
			}
			else if (response.contains("right")) {
				System.out.println("You can not move right");
			}
			else if (response.contains("forward")) {
				System.out.println("You can not move Forward");
			}
			else if (response.contains("backward")) {
				System.out.println("You can not move Backward");
			}
			else if (response.contains("pick")) {
				System.out.println("There is nothing to pick up");
			}
			else if (response.contains("attack")) {
				System.out.println("There is nothing to attack");
			}
			else if (response.contains("place")) {
				while(StartHere.item == "Power Cell") {
					if (StartHere.Power1 == 0 && StartHere.Power2 == 0 && StartHere.Power3 == 0) {
					System.out.println("You placed power cell in generator 1");
					StartHere.item = "nothing";
					StartHere.Power1 = 1;
					} 
					else if (StartHere.Power1 == 1 && StartHere.Power2 == 0 && StartHere.Power3 == 0  ) {
					System.out.println("You placed power cell in generator 2");
					StartHere.item = "nothing";
					StartHere.Power2 = 1;
					} 
					else if (StartHere.Power1 == 1 && StartHere.Power2 == 1 && StartHere.Power3 == 0 ) {
					System.out.println("You placed power cell in generator 3");
					StartHere.item = "nothing";
					StartHere.Power3 = 1;
					}
				}
			}
			else if (response.contains("pick")) {
				System.out.println("There is nothing to pick up");
				}
			if (StartHere.Power1 == 1 && StartHere.Power2 == 1 && StartHere.Power3 == 1) {
					System.out.println("The ship has been restored! Paycheck will be wired to 1-800-911 in 5-10 business days.");
					StartHere.Health = 0;
				}
			}
		
		System.out.println("Game OVER");
	}
// end Powerstart method
} // end delay method


// end class
