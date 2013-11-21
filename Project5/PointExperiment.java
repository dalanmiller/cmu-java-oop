/** 
* @version 1.0
* @author Daniel Alan Miller
*/

import java.util.*;

//Main class for running the point classes testing
public class PointExperiment {
	
	public static void main(String[] args) {
			
		//Random object to generate random points 
		Random r = new Random();

		//Array of Points objects
		Point[] points = new Point[1000];

		//Iterate through each index in the points array, give that index a point
		// and also assign random variable to the x and y attributes of the Point
		for (int i = 0; i < points.length; i++){

			points[i] = new Point();
			points[i].x = r.nextInt();
			points[i].y = r.nextInt();
		}

		//Sort the Points in the array
		Arrays.sort(points);

		//Iterate through all the points and print the results
		for(Point p: points){
			System.out.println(p.x +", "+p.y);
		}
	}
}


//Standard Point class which implements Comparable of itself.
class Point implements Comparable<Point>{

	public int x, y;
	
	//Custom compareTo method which compares x then y attributes
	public int compareTo(Point p2){

		//First compare x values 
		if (x > p2.x){
			return 1;
		}
		if (x < p2.x){
			return -1;
		}

		//Then compare y values
		if (y > p2.y){
			return 1;
		}
		if (y < p2.y){
			return -1;
		}

		//Points are equal
		return 0;
	}
}

//PointY class which will compare on Y point first and then compare on X point
class PointY implements Comparable<PointY>{

	//X and Y attributes
	public int x, y;

	//compareTo method which first compares on Y attribute then X attribute.
	public int compareTo(PointY p2){

		//Compare y
		if (y > p2.y){
			return 1;
		}
		if (y < p2.y){
			return -1;
		}

		//Compare x
		if (x > p2.x){
			return 1;
		}
		if (x < p2.x){
			return -1;
		}

		//Points are equal
		return 0;
	}
}

