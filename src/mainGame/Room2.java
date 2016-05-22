package mainGame;

import java.security.SecureRandom;
import java.util.Scanner;

public class Room2 {
public static void Room2start(int Power1, int Power2, int Power3, int Health, String Item){
		
		String response;
		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		int enemy=3;
		int damage = 1 + random.nextInt(3);
		System.out.println("You are now in Room2");
		response = input.next();
		
		if(response.contains("Look Around")){
			
		}
		else if (response.contains("forward")) {
			System.out.println("Dank can go through the door to its front.");
		}
		else if (response.contains("backward")){
			System.out.println("Dank can go through the door to its rear. ");
		}
		else if (response.contains("pick")){
			System.out.println("There is nothing to pick up");
		}
		else if (response.contains("attack")){
			System.out.println("Prepare to attack");
		}
		else if (response.contains("left")) {
			System.out.println("Dank can not move left.");
		}
		else if (response.contains("right")){
			System.out.println("Dank can not move right");
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
