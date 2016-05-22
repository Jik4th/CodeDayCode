package mainGame;

import java.security.SecureRandom;
import java.util.Scanner;

public class Room2 {
public static void Room2start(){
		
		String response;
		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		int enemy=3;
		int press;
		int damage = 1 + random.nextInt(3);
		while (StartHere.Health > 1) {
		
		System.out.println("You are now in Room2. What would you like to do?");
		response = input.next();
		
		if(response.contains("look")){
			System.out.println("There is a Cyborg Monster in this Room. You are about to fight him");
			while (enemy > 0) {
				System.out.println("Press 1 to shoot!");
				press = input.nextInt();
				if(press == 1){
				damage = 1 + random.nextInt(3);
				enemy = enemy - damage;
				System.out.println("The monster has been hit. It has " + enemy + " health!!");
				damage = 1 + random.nextInt(4);
				StartHere.Health = StartHere.Health - damage;
				}
			}
				System.out.println("Victory! is yours. Good Job. The enemy droped a power cell. You have " + StartHere.Health + " health" );
			}
		
		else if (response.contains("backward")) {
			System.out.println("Dank is blocked by a cyborg. ");

			}
		
		else if (response.contains("forward")){
			System.out.println("Dank can go forward. ");
			mainRoom.Mainstart();
		}
		else if (response.contains("pick")){
			if (enemy > 0) {
			System.out.println("You cant pick up anything there is a Cyborg. You are about to fight him");
			while (enemy > 0) {
				System.out.println("Press 1 to shoot!");
				press = input.nextInt();
				if(press == 1){
				damage = 1 + random.nextInt(3);
				enemy = enemy - damage;
				System.out.println("The monster has been hit. It has " + enemy + " health!!");
				damage = 1 + random.nextInt(4);
				StartHere.Health = StartHere.Health - damage;
				}
			}
				System.out.println("Victory! is yours. Good Job. The enemy droped a power cell. You have " + StartHere.Health + " health" );
			}
			else {
				System.out.println("You picked up Power Cell");
				StartHere.item = "Power Cell";
			}
		}
		else if (response.contains("attack")){
			System.out.println("Prepare to attack");
			System.out.println("There is a Cyborg Monster in this Room. You are about to fight him");
			while (enemy > 0) {
				System.out.println("Press 1 to shoot!");
				press = input.nextInt();
				if(press == 1){
				damage = 1 + random.nextInt(3);
				enemy = enemy - damage;
				System.out.println("The monster has been hit. It has " + enemy + " health!!");
				damage = 1 + random.nextInt(4);
				StartHere.Health = StartHere.Health - damage;
				}
			}
				System.out.println("Victory! is yours. Good Job. The enemy droped a power cell. You have " + StartHere.Health + " health" );
			}
		else if (response.contains("left")) {
			System.out.println("Dank can not move left.");
		}
		else if (response.contains("right")){
			System.out.println("Dank can not move right");
		}
//		else if (response.equals("attack with item")){
//			System.out.println("There is nothing to pick up");
//		}
		else if (response.contains("access console")){
		

		}
		else if (response.contains("place power cell")){
			

		}

	}
System.out.println("Game OVER");
}
}
