/** 
* @version 1.0
* @author Daniel Alan Miller
*/

import java.util.*;


//Class that handles the dog methods and programming
class Dog {

		//X location of the dog on the board
		public int x = 0;

		//Y location of the dog on the board
		public int y = 0;

		//Down == true, up == false
		public boolean pen = false; 

		//Refernce to the floor object that the dog is on.
		public Floor floor;

		//Direction the dog is facing
		// 0 = north
		// 1 = east
		// 2 = south
		// 3 = west
		private int direction = 0;

		/**
		* Constructor which only takes a reference to the floor which
		* the dog is going to be placed
		* @param f - reference to a Floor object 
		*/

		Dog(Floor f){
			this(f, 0, 0);
		}

		/**
		* Constructor which only takes a reference to the floor on which
		* the dog is going to be placed as well as s starting x and y 
		* coordinate
		* @param f - reference to a Floor object 
		* @param startX - starting X coordinate
		* @param startY - starting y coordinate
		*/

		Dog(Floor f, int startX, int startY){
			floor = f;
			x = startX;
			y = startY;
		}

		/**
		* Method for handling turning the dog to face a new direction
		* @param s - string 's' which is a string representation of "left" or "right".
		*/
		public void turnDog(String s){

			if (s.equals("right")){

				direction = (direction < 3) ? direction += 1 : 0;

			} else {

				direction = (direction > 0) ? direction -= 1 : 3;
			}
		}

		/**
		* Method for moving the dog forward 'spaces' amount of spaces
		* Takes the current direction the dog is in and then does the proper 
		* for loop calculation to go the proper number of spaces also
		* without going over the edge of the board.
		* Outputs a message if the movement will go over the boundaries 
		* of the board.
		* @param spaces - integer 'spaces' which  will move the dog that many spaces forward
		*/
		public void moveForward(int spaces){

				switch(direction){

				case 0:
					
					if ( !(y + spaces > floor.getEdgeLength()) ) {

						if (pen == true){	
							for ( int i = y;  i <= y + spaces; i++){
								floor.markTile(x,i);
							}
							y+=spaces; 
						} else {
							y+=spaces; 
						}
						
					} else {
						System.out.println("Can't perform movement");
					}
					break;

				case 1:

					if ( !(x + spaces > floor.getEdgeLength()) ){
						
						if (pen == true){
							for ( int i = x;  i <= x + spaces; i++){
								floor.markTile(i,y);
							}
							x += spaces; 
						} else {
							x += spaces;
						}
						
					} else {
						System.out.println("Can't perform movement");
					}
					break;

				case 2:
					if ( !(y - spaces  < 0) ){
						if (pen == true){
							for ( int i = y;  y-i < spaces ; i--){
								floor.markTile(x,i);
							}	
							y -= spaces;
						} else {
							y -= spaces;
						}
						

					} else {
						System.out.println("Can't perform movement");
					}
					break;

				case 3:

					if ( !(x - spaces < 0) ){
						if (pen == true){
							for ( int i = x;  x - i < spaces; i--){
								floor.markTile(i,y);
							}
							x -= spaces;

						} else {
							x -= spaces;
						}
						

					} else {
						System.out.println("Can't perform movement");						
					}
					break;
			}
		}
	}


//Class which handles all the activites of the floor
class Floor {

	//Boolean 2D array which represents marked and unmarked tiles
	// True if the tile has been amrked and false which is the initial state.
	private boolean[][] tiledFloor;

	//Hashmap of animals that have been added to the board. 
	private Map animals = new HashMap();

	//Floor constructor which takes no initial parameters
	Floor(){

		this(20, 20);
		
	}

	/**
	* Another overload constructor for the Floor class
	* @param Integer w for the width of the floor 
	* @param Integer h for the height of the floor
	*/
	Floor(int w, int h){
		tiledFloor = new boolean[w][h];
	}

	//Method which returns an integer of the length of the board.
	// Implementation assumes that the board is square. 
	public int getEdgeLength(){
		return tiledFloor.length;
	}

	//Method which clears the floor of marked tiles. 
	public void clearFloor(){
		for (int row = 0; row < tiledFloor.length; row++){
			for ( int col = 0; col < tiledFloor[0].length; col++  ){
				 tiledFloor[row][col] = false;
			}
		}
	}

	//Method which prints out the current state of the floor 
	public void printFloor(){

		for (int i = tiledFloor[0].length; i > 0 ; i--){

			System.out.print("|");

			for ( boolean[] row : tiledFloor){

				if (row[i-1]) {
					System.out.print(" + ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.print("|");
			System.out.print("\n");
		}
	}
	/**
	* Method which handles the marking of a tile at an x, y coordinate
	* @param x - x coordiante
	* @param y - y coordinate
	*/
	public void markTile(int x, int y){
		tiledFloor[x][y] = true;
	}


	/**
	* Method which handles the adding of a dog to the board
	* @param name - name of a dog to add to board
	*/
	public void addDog(String name){
		try {
			animals.put(name, new Dog(this));	
		} catch (Exception e){
			System.out.println("An animal with that name already exists!");
		}
	}

	/**
	* Method which handles returning a dog which is on the board given the dogs name. 
	* @param name - Name of the dog which you'd like to get access to
	*/
	public Dog getDog(String name){
		if (animals.containsKey(name)){
			return (Dog)animals.get(name);
		} else {
			return null;
		}
	}
}



//Class which essentially handles the progamming for the dog.
public class DogDraw  {

	private static ArrayList<String> dogProgramming;
	// private static ArrayList<String> dogProgramming = new ArrayList<String>(){{ add("2");  add("3"); add("5,6"); add("4"); add("5,16"); add("4"); add("5,6"); add("4"); add("5,6"); add("4"); add("5,16"); add("4"); add("5,6"); add("4"); add("5,6"); add("4"); add("5,16"); add("4"); add("5,6"); add("1"); add("6"); add("9");}};

	public static void main(String[] args) {
		
		//Ask for dog programming before beginning dog routine. 
		programDog(); 

		//Init floor
		Floor f = new Floor();

		//Adding dog onto the floor.
		f.addDog("Horus");

		System.out.println("EXECUTING DOG PROGRAM.");

		//Get the dog from the floor object
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

				//Print the floor
				case "6":
					f.printFloor();
					break;

				//End the program
				case "9":
					break; 

				//Move the dog forward, default since it's impossible
				// thanks to Java to do any sort of matching with this 
				// control structure
				default:

					int v = Integer.parseInt(s.split(",")[1]);

					d.moveForward(v);	
					
					break;
			}

			//Have to check for 9 again in order to break out of the for loop 
			// if a 9 is encountered
			if (s.equals("9")){
				break;
			}	
		}



	}

	//Method which handles the programming of the dog
	// The method will contoinue to ask for input from the user until the user 
	// inputs a 9, in which the program will then cease to ask for
	// further programming. As well, it will currently allow any number
	// even if there isn't an acction associated with that number. But the
	// actual processing of the instructions will ignore numbers without actions.
	public static void programDog(){

		Scanner in = new Scanner(System.in);

		System.out.println("WELCOME TO ROBO DOG DRAW\n");
		System.out.println("You will now be asked to input each dog command one at a time");

		System.out.println("Here are your possible options:");
		System.out.print("1 - Pen up\n2 - Pen down\n3 - Turn right\n4 - Turn left\n5,# - Move dog # number of spaces\n6 - Display the grid\n9 - End of data\n\n");

		System.out.println("Entering a \"9\" will end the programming session");

		ArrayList<String> commandList = new ArrayList<String>();

		String n = "";
		do {
			System.out.println("Please input a command:");
			try {
				n = in.next("[1234569](\\,\\d+)?");
			} catch (Exception e){
				System.out.println("Looks like something went wrong with your entry, try again.");
			}

			commandList.add(n);

		} while( !n.equals("9") );

		System.out.println("DOG PROGRAMMING COMPLETE.");

		dogProgramming = commandList;

	}
}