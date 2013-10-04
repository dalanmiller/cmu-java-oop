public class carCompositionLab3  {

	public static void main(String[] args) {
		

		Car[] cars = new Car[20];

		for (Car c : cars){
			c = new Car("Ford Taurus", 1987, 4, 4);
			System.out.println(c);
		}
	}
	
}

class Engine{}
class Wheel{}
class Door{}

class Car { 
  Engine  eng; 
  Wheel[] wheels;
  Door[] doors;
  String model;
  int year; 
  
  	Car(){
  		eng = new Engine();
  		wheels = new Wheel[4];
  		doors = new Door[4];
  	}

  	Car (String m, int y, int numWheels, int numDoors){
  		model = m;
  		year = y;
  		eng = new Engine();
	    wheels = new Wheel[numWheels];
	    doors = new Door[numDoors];
  	}

 	Car(int numWheels, int numDoors ) { 
	    eng = new Engine();
	    wheels = new Wheel[numWheels];
	    doors = new Door[numDoors];
	}


	@Override
	public String toString(){
		return "M: "+model+"\t Y: "+year;
	}

}
