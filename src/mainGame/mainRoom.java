package mainGame;
import java.util.Scanner;

public class mainRoom {

<<<<<<< HEAD
	public static void Powerstart(int Power1, int Power2, int Power3, int Health, int Item){
		String response;
		Scanner input = new Scanner(System.in);
		System.out.println("Dank is now in the Main Room. What would you like to do?");
		response = input.next();
		
		if(response.contains("Look Around")){
			System.out.println("Dank is in a circular room with four doors and a command console in the center.");
		}
		else if (response.contains("left")) {
			System.out.println("Dank goes through the left door into another room.");
			//Insert room1 code here
		}
		else if (response.contains("right")){
			System.out.println("Dank goes through the right door into another room.");
			//Insert PowerRoom code here
		}
		else if (response.contains("pick")){
			System.out.println("There is nothing to pick up");
		}
		else if (response.contains("attack")){
			System.out.println("There is nothing to attack");
		}
		else if (response.contains("forward")) {
			System.out.println("Dank moves forward through the door to its front.");
			//Insert room3 code here
		}
		else if (response.contains("backward")){
			System.out.println("Dank turns around and moves through the door to its rear.");
			//Insert room2 code here
		}
		else if (response.equals("attack with item")){
			System.out.println("There is nothing to pick up");
		}
		else if (response.contains("access console")){
			System.out.println("");
		

		}
		else if (response.contains("place power cell")){
			

		}

	}
=======
    
    //id rename the function from powerstart to something relevent. -- br
    
    public static void Powerstart(int Power1, int Power2, int Power3, int Health, int Item){ // Sup with all these inputs?
            String response;
            Scanner input = new Scanner(System.in);
            System.out.println("You are now in the blan Room. ");
            response = input.next();

            if(response.contains("Look Around")){

            }
            else if (response.contains("left")) {
                    System.out.println("You can not move left.");
            }
            else if (response.contains("right")){
                    System.out.println("You can not move right");
            }
            else if (response.contains("pick")){
                    System.out.println("There is nothing to pick up");
            }
            else if (response.contains("attack")){
                    System.out.println("There is nothing to attack");
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
>>>>>>> origin/master
}
