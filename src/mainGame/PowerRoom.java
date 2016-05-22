package mainGame;

import java.util.Scanner;

public class PowerRoom {

	public static void Powerstart() { // Sup with all these inputs?
		int generator;
		String response;
		int number;
		Scanner input = new Scanner(System.in);
		while (StartHere.Health > 1) {
			System.out
					.println("You are now in the Auxillary Power Room. There are three generators across one wall. What would you like to do.");
			response = input.next();

			if (response.contains("Look Around")) {
				if (StartHere.Power1 == true && (StartHere.Power2 == false)&& (StartHere.Power3 == false)) {
					System.out.println("There is a power cell in generator 1, but not two or three");
				} else if (StartHere.Power1 == false&& (StartHere.Power2 == false)&& (StartHere.Power3 == false)) {
					System.out.println("There is no power cell in generator 1, 2, or 3!");
				} else if (StartHere.Power1 == true&& (StartHere.Power2 == true)&& (StartHere.Power3 == false)) {
					System.out.println("There is a power cell in generators 1 and 2!");
				} else if (StartHere.Power1 == true&& (StartHere.Power2 == true)&& (StartHere.Power3 == true)) {
					System.out.println("There is a power cell in generators 1, 2, and 3!");
				}

			} else if (response.contains("left")) {
				System.out.println("You are moving back!");
				mainRoom.Mainstart();
			} else if (response.contains("right")) {
				System.out.println("You can not move right");
			}else if (response.contains("Forward")) {
				System.out.println("You can not move Forward");
			}else if (response.contains("Backward")) {
				System.out.println("You can not move Backward");
			}else if (response.contains("pick")) {
				System.out.println("There is nothing to pick up");
			} else if (response.contains("attack")) {
				System.out.println("There is nothing to attack");
			} else if (response.equals("place power cell in Generator")) {

				if (StartHere.Power1 = false) {
					System.out.println("You placed power cell in generator 1");
					StartHere.item = "nothing";
					StartHere.Power1 = true;
				} else if (StartHere.Power1 == true&& (StartHere.Power2 == false)) {
					System.out.println("You placed power cell in generator 2");
					StartHere.item = "nothing";
					StartHere.Power2 = true;
				} else if (StartHere.Power1 == true&& (StartHere.Power2 == true)&& (StartHere.Power3 == false)) {
					System.out.println("You placed power cell in generator 3");
					StartHere.item = "nothing";
					StartHere.Power3 = true;
				}

				else if (response.contains("pick")) {
					System.out.println("There is nothing to pick up");
				}
				if (StartHere.Power1 == true && (StartHere.Power2 == true)&& (StartHere.Power3 == true)) {
					System.out.println("The ship has been restored! Paycheck will be wired to 1-800-911 in 5-10 business days.");
				}
			}
		}
		System.out.println("Game OVER");
	}// end Powerstart method
}// end class
