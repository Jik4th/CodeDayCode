package mainGame;
import java.util.Scanner;

public class PowerRoom {

	public static void Powerstart(int Power1, int Power2, int Power3, int Health, int Item) { // Sup with all these inputs?
		int generator;
		String response;
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("You are now in the Auxillary Power Room. There are three generators across one wall. What would you like to do.");
		response = input.next();
		
		if(response.equals("Look Around")){
			if (Power1 == 1) {
				System.out.println("There is a power cell in generator 1");
			}
			else if (Power1 == 0) {
				System.out.println("There is no power cell in generator 1. Generator 1 is empty!");
			}
			else if (Power2 == 1) {
				System.out.println("There is a power cell in generator 2");
			}
			else if (Power2 == 0) {
				System.out.println("There is no power cell in generator 2. Generator 2 is empty!");
			}
			else if (Power3 == 1) {
				System.out.println("There is a power cell in generator 3");
			}
			else if (Power3 == 0) {
				System.out.println("There is no power cell in generator 3. Generator 3 is empty!");
			}
			
		}
		else if (response.equals("move left")) {
			System.out.println("You can not move left.");
		}
		else if (response.equals("move right")){
			System.out.println("You can not move right");
		}
		else if (response.equals("pick up item")){
			System.out.println("There is nothing to pick up");
		}
		else if (response.equals("attack")){
			System.out.println("There is nothing to attack");
		}
		else if (response.equals("place power cell in Generator")){
			System.out.println("in generator 1, 2, or 3");
			number = input.nextInt();
			if (number == 1 && Power1 == 0) {
				System.out.println("You placed power cell in generator 1");
			}
			else if (number == 1 && Power1 == 1) {
				System.out.println("Generator 1 is full please choose a different generator");
			}
			if (number == 2 && Power1 == 0) {
				System.out.println("You placed power cell in generator 2");
			}
			else if (number == 2 && Power1 == 1) {
				System.out.println("Generator 1 is full please choose a different generator");
			}
			if (number == 3 && Power1 == 0) {
				System.out.println("You placed power cell in generator 3");
			}
			else if (number == 3 && Power1 == 1) {
				System.out.println("Generator 1 is full please choose a different generator");
			}
			

		}
		
	}//end Powerstart method
}//end class
