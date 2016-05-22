package mainGame;
import java.util.Scanner;
import java.security.SecureRandom;

public class Room1 {
	public static void Roomstart(){
		
		String response;
		Scanner input = new Scanner(System.in);
		while (StartHere.Health > 1) {
		SecureRandom random = new SecureRandom();
		int enemy = 3;
		int damage; 
		System.out.println("Dank is now in Room1. What would you like to do?");
		response = input.next();
		
		if(response.contains("Look Around")){
			System.out.println("There is a Gas Monster in this Room. You are about to fight him");
			while (enemy > 0) {
				System.out.println("Press 1 to shoot!");
				damage = 1 + random.nextInt(3);
				enemy = enemy - damage;
				System.out.println("Enemy is still alive!");
			}
			System.out.println("Victory! is yours. Good Job");
		}
		else if (response.contains("left")) {
			System.out.println("Dank can't go to the left, there's a monster blocking the way!.");
		}
		else if (response.contains("right")){
			System.out.println("Dank can go through the door to its right. ");
		}
		else if (response.contains("pick")){
			if (enemy > 0) {
			System.out.println("You cant pick up anything there is a Gas Monster. You are about to fight him");
				while (enemy > 0) {
				System.out.println("Press 1 to shoot!");
				damage = 1 + random.nextInt(2);
				enemy = enemy - damage;
				System.out.println("Enemy is still alive!");
				damage = 1 + random.nextInt(4);
				StartHere.Health = StartHere.Health - damage;
				}
			}
			else {
				System.out.println("You picked up a power cell");
				StartHere.item = "Power Cell";
			}
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
	System.out.println("Game OVER");
	}
}


