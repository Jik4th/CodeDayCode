package mainGame;
import java.security.SecureRandom;
import java.util.Scanner;
public class Room3 {
	public static void Room3Start(){
		String response;
		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		int enemy=3;
		int damage;
		while (StartHere.Health > 1) {
		
		System.out.println("You are now in Room3. What would you like to do?");
		response = input.next();
		
		if(response.contains("Look Around")){
			System.out.println("There is a 'Roid Monster in this Room. You are about to fight him");
			while (enemy > 0) {
				System.out.println("Press 1 to shoot!");
				damage = 1 + random.nextInt(2);
				enemy = enemy - damage;
				System.out.println("Enemy is still alive!");
				damage = 1 + random.nextInt(4);
				StartHere.Health = StartHere.Health - damage;
			}
			System.out.println("Victory! is yours. Good Job. He dropped a Power cell");
		}
		else if (response.contains("forward")) {
			System.out.println("Dank is blocked by a 'Roid Monster. You are about to fight him");
			while (enemy > 0) {
				System.out.println("Press 1 to shoot!");
				damage = 1 + random.nextInt(2);
				enemy = enemy - damage;
				System.out.println("Enemy is still alive!");
				damage = 1 + random.nextInt(4);
				StartHere.Health = StartHere.Health - damage;
			}
			System.out.println("Victory! is yours. Good Job. He dropped a Power cell");	
		}
		else if (response.contains("left")) {
			System.out.println("You can't go through the door to your left.");
		}
		else if (response.contains("right")){
			System.out.println("You can't go through the door to your right. ");
		}
		else if (response.contains("pick")){
			if (enemy > 0) {
			System.out.println("You cant pick up anything there is a Cyborg. You are about to fight him");
			while (enemy > 0) {
				System.out.println("Press 1 to shoot!");
				damage = 1 + random.nextInt(2);
				enemy = enemy - damage;
				System.out.println("Enemy is still alive!");
				damage = 1 + random.nextInt(4);
				StartHere.Health = StartHere.Health - damage;
			}
		}
		else if (response.contains("attack")){
			System.out.println("Prepare to attack");
			System.out.println("There is a 'Roid Monster in this Room. You are about to fight him");
			while (enemy > 0) {
				System.out.println("Press 1 to shoot!");
				damage = 1 + random.nextInt(2);
				enemy = enemy - damage;
				System.out.println("Enemy is still alive!");
				damage = 1 + random.nextInt(4);
				StartHere.Health = StartHere.Health - damage;
		}
		}
		
		else if (response.contains("backward")){
			System.out.println("You can move backward.");
			mainRoom.Mainstart();
		}
		else if (response.equals("attack with item")){
			System.out.println("There is nothing to pick up");
		}
		else if (response.contains("access console")){
		

		}
		else if (response.contains("place power cell")){
			

		}

	}
	System.out.println("Game OVER");
}
}
}

