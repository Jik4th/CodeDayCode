package mainGame;
import java.util.Scanner;
import java.security.SecureRandom;

public class Room1 {
	public static void Roomstart(){
		
		String response;
		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		int enemy=3;
		int damage = 1 + random.nextInt(3);
		System.out.println("Dank is now in Room1");
		response = input.next();
		
		if(response.contains("Look Around")){
			
		}
		else if (response.contains("left")) {
			System.out.println("Dank can go through the door to its left.");
		}
		else if (response.contains("right")){
			System.out.println("Dank can go through the door to its right. ");
		}
		else if (response.contains("pick")){
			System.out.println("Dank can pick up a flamethrower or a power cell.");
			response = input.next();
			if(response.contains("flamethrower")){
				StartHere.item ="flamethrower";
				System.out.println("Dank picked up a flamethrower!");
			}
			else if (response.contains("power cell"))
				StartHere.item = "power cell";
			System.out.println("Dank picked up a power cell.");
		}
		else if (response.contains("attack")){
			System.out.println("Prepare to attack");
		}
		else if (response.contains("up")) {
			System.out.println("Dank can not move left.");
		}
		else if (response.contains("down")){
			System.out.println("Dank can not move right");
		}
		else if (response.equals("attack with item")){
			System.out.println("There is nothing for Dank to pick up");
		}
		else if (response.contains("access console")){
		

		}
		else if (response.contains("place power cell")){
			

		}

	}
}


