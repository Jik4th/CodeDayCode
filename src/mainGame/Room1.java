package mainGame;
import java.util.Scanner;
import java.security.SecureRandom;

public class Room1 {
	public static void Powerstart(int Power1, int Power2, int Power3, int Health, int Item){
		String response;
		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		int enemy=3;
		int damage = 1 + random.nextInt(3);
		System.out.println("You are now in the blan Room. ");
		response = input.next();
		
		if(response.contains("Look Around")){
			
		}
		else if (response.contains("left")) {
			System.out.println("You can go through the door to your left.");
		}
		else if (response.contains("right")){
			System.out.println("You can go through the door to your right. ");
		}
		else if (response.contains("pick")){
			System.out.println("There is nothing to pick up");
		}
		else if (response.contains("attack")){
			System.out.println("Prepare to attack");
		}
		else if (response.contains("up")) {
			System.out.println("You can not move left.");
		}
		else if (response.contains("down")){
			System.out.println("You can not move right");
		}
		else if (response.equals("attack with item")){
			System.out.println("There is nothing to pick up");
		}
		else if (response.contains("access console")){
		

		}
		else if (response.contains("place power cell")){
			

		}

	}
}


