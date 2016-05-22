package mainGame;
import java.util.Scanner;
import java.security.SecureRandom;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Room1 {
	public static void delay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException exp) {
        }
	} 
	public static void Roomstart(){
		
		String response;
		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		int enemy = 3;
		int damage;
		int press;
		while (StartHere.Health > 1) {
		 delay(1000);
		System.out.println("Dank is now in Room1. What would you like to do?");
		response = input.next();
		
		if(response.contains("look")){
			System.out.println("There is a Gas Monster in this Room. You are about to fight him");
			JFrame frame = new JFrame();
			  ImageIcon icon = new ImageIcon("src/Images/CodeDayGame/GaseousBoss.png");
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
				
		else if (response.contains("left")) {
			System.out.println("Dank can't go to the left, there's a monster blocking the way!.");
		}
		else if (response.contains("right")){
			System.out.println("Dank can go through the door to its right. ");
			mainRoom.Mainstart();
		}
		else if (response.contains("pick")){
			if (enemy > 0) {
			System.out.println("You cant pick up anything there is a Gas Monster. You are about to fight him");
			 JFrame frame = new JFrame();
			  ImageIcon icon = new ImageIcon("src/Images/CodeDayGame/GaseousBoss.png");
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
				frame.setVisible(true);
				System.out.println("Victory! is yours. Good Job. The enemy droped a power cell. You have " + StartHere.Health + " health" );
			}
			else {
				System.out.println("You picked up a power cell");
				StartHere.item = "Power Cell";
			}
		}
		else if (response.contains("attack")){
			System.out.println("Prepare to attack");
			System.out.println("There is a Gas Monster in this Room. You are about to fight him");
			JFrame frame = new JFrame();
			  ImageIcon icon = new ImageIcon("src/Images/CodeDayGame/GaseousBoss.png");
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
			System.out.println("Dank can not move forward.");
		}
		else if (response.contains("backward")){
			System.out.println("Dank can not move backward");
		}
//		else if (response.equals("attack with item")){
//			System.out.println("There is nothing for Dank to pick up");
//		}
		else if (response.contains("access console")){
		

		}
		else if (response.contains("place power cell")){
			

		}

	}
	System.out.println("Game OVER");
	}
}


