package mainGame;
import java.security.SecureRandom;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Room3 {
	public static void delay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException exp) {
        }
	} 
	public static void Room3Start(){
		String response;
		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		int enemy=3;
		int damage;
		int press;
		while (StartHere.Health > 1) {
		delay(1000);
		System.out.println("You are now in Room3. What would you like to do?");
		response = input.next();
		
		if(response.contains("look")){
			System.out.println("There is a 'Roid Monster in this Room. You are about to fight him");
			JFrame frame = new JFrame();
			  ImageIcon icon = new ImageIcon("src/Images/CodeDayGame/SteroidbossSprite.png");
			  JLabel label = new JLabel(icon);
			  frame.add(label);
			  frame.setDefaultCloseOperation
			         (JFrame.EXIT_ON_CLOSE);
			  frame.pack();
			  frame.setVisible(true);
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
				frame.setVisible(false);
				System.out.println("Victory! is yours. Good Job. The enemy droped a power cell. You have " + StartHere.Health + " health" );
		}
		else if (response.contains("forward")) {
			System.out.println("Dank is blocked by a 'Roid Monster.");
		}
		else if (response.contains("left")) {
			System.out.println("You can't go through the door to your left.");
		}
		else if (response.contains("right")){
			System.out.println("You can't go through the door to your right. ");
		}
		else if (response.contains("pick")){
			if (enemy > 0) {
			System.out.println("You cant pick up anything there is a 'Roid Monster. You are about to fight him");
			JFrame frame = new JFrame();
			  ImageIcon icon = new ImageIcon("src/Images/CodeDayGame/SteroidbossSprite.png");
			  JLabel label = new JLabel(icon);
			  frame.add(label);
			  frame.setDefaultCloseOperation
			         (JFrame.EXIT_ON_CLOSE);
			  frame.pack();
			  frame.setVisible(true);
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
				frame.setVisible(false);
				System.out.println("Victory! is yours. Good Job. The enemy droped a power cell. You have " + StartHere.Health + " health" );
		}
			else {
				System.out.println("You picked up a power cell");
				StartHere.item = "Power Cell";
			}
				
		}
		else if (response.contains("attack")){
			System.out.println("Prepare to attack");
			JFrame frame = new JFrame();
			  ImageIcon icon = new ImageIcon("src/Images/CodeDayGame/SteroidbossSprite.png");
			  JLabel label = new JLabel(icon);
			  frame.add(label);
			  frame.setDefaultCloseOperation
			         (JFrame.EXIT_ON_CLOSE);
			  frame.pack();
			  frame.setVisible(true);
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
				frame.setVisible(false);
				System.out.println("Victory! is yours. Good Job. The enemy droped a power cell. You have " + StartHere.Health + " health" );
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
		else if (response.contains("place ")){
			System.out.println("You cant place anything here");

		}
			
		}
		System.out.println("Game OVER");
	}
	
}


