/** 
* @version 1.0
* @author Daniel Alan Miller
*/

import java.util.*;


class Dog {

		//X location of the dog on the board
		public int x = 0;

		//Y location of the dog on the board
		public int y = 0;

		//Down == true, up == false
		public boolean pen = false; 

		//Direction the dog is facing
		// 0 = north
		// 1 = east
		// 2 = south
		// 3 = west
		public int direction = 2;

		/**
		* Method for handling turning the dog to face a new direction
		* @param Takes string 's' which is a string representation of "left" or "right".
		*/

		public void turnDog(String s){

			if (s.equals("right")){

				System.out.println("Moving dog right!");

				if (direction < 3){

					direction += 1;

				} else {

					direction = 0;

				}

			} else if (s.equals("left")) {

				System.out.println("Moving dog left!");

				if (direction > 0){

					direction =- 1;
				} else {
					direction = 4;
				}
			}
		}

		public void moveForward(int spaces){

			switch(direction){

				case 0:
					
					if ( !(y + spaces > 20) ) {
						y += spaces;
					} else {
						System.out.println("Can't perform movement");
					}
					break;

				case 1:

					if ( !(x + spaces > 20) ){
						x += spaces;
					} else {
						System.out.println("Can't perform movement");
					}
					break;

				case 2:

					if ( !(y - spaces  < 0) ){
						y -= spaces;	
					} else {
						System.out.println("Can't perform movement");
					}
					break;

				case 3:

					if ( !(x - spaces < 0) ){
						x -= spaces;
					} else {
						System.out.println("Can't perform movement");						
					}
					break;
			}
		}
	}

class Floor {

	private int[][] floor;

	public int width = 20;
	public int height = 20;

	//Animals
	private Map animals = new HashMap();


	Floor(){
		floor = new int[width][height];
	}

	Floor(int w, int h){
		floor = new int[w][h];
	}

	public void printFloor(){

		for (int[] row : floor){

			for (int t : row){

				if (t == 1){
					System.out.print("|+|");
				} else {
					System.out.print("| |");
				}
			}
			System.out.print("\n");
		}
	}

	public void addDog(String name){
		try {
			animals.put(name, new Dog());	
		} catch (Exception e){
			System.out.println("An animal with that name already exists!");
		}
	}

	public Dog getDog(String name){
		if (animals.containsKey(name)){
			return (Dog)animals.get(name);
		} else {
			return null;
		}
	}
}


public class DogDraw  {

	// private String dogProgramming;
	private static String[] dogProgramming = new String[]{"2", "5,12", "3", "5,12", "3", "5,12", "3", "5,12", "1", "6", "9"};

	public static void main(String[] args) {
		
		//Ask for dog programming before beginning dog routine. 
		// programDog(); 

		//Init floor
		Floor f = new Floor();

		//Adding dog onto the floor.
		f.addDog("Horus");

		System.out.println("EXECUTING DOG PROGRAM.");

		Dog d = f.getDog("Horus");

		//Run through the program
		for (String s : dogProgramming){
			switch(s){

				//Disengage the pen 
				case "1":
					d.pen = false;
					break;

				//Engage the pen for drawing
				case "2":
					d.pen = true;
					break;

				//Turn the dog right
				case "3":
					d.turnDog("right");
					break;

				//Turn the dog left
				case "4":
					d.turnDog("left");
					break;

				//Move the dog forward
				case "5":
					int v = Integer.parseInt(s.split(",")[1]);

					if (d.pen == true){

						switch(d.direction){

							case 0: case:2 
								int yOrigin = d.y;
								break;		
							case 1: case 3:
								int xOrigin = d.x;
								break;
						}


						d.moveForward(v);	

					} else {
						d.moveForward(v);	
					}
					
					break;

				//Print the floor
				case "6":
					f.printFloor();
					break;

				//End the program
				case "9":
					break; 
			}

			if (s.equals("9")){
				break;
			}	
		}



	}
	//ArrayList<String> stringList = new ArrayList<String>();


	public static void programDog(){

		Scanner in = new Scanner(System.in);

		System.out.println("WELCOME TO ROBO DOG DRAW\n");
		System.out.println("You will now be asked to input each dog command one at a time");

		System.out.println("Here are your possible options:");
		System.out.print("1 - Pen up\n2 - Pen down\n3 - Turn right\n4 - Turn left\n5,# - Move dog # number of spaces\n6 - Display the grid\n9 - End of data\n\n");

		System.out.println("Entering a \"9\" will end the programming session");
		System.out.println("Please input a command:");

		ArrayList<String> commandList = new ArrayList<String>();

		String n = "";
		do {
			try {
				n = in.next("[1234569](\\,\\d+)?");
			} catch (Exception e){
				System.out.println("Looks like something went wrong with your entry, try again.");
			}

			commandList.add(n);

		} while( !n.equals("9") );

		//dogProgramming = commandList;

	}
}