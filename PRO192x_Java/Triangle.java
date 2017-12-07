//Enter three sides of a triangle, check type of the triangle
import java.util.*;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Get three sides of a triangle from input
		double[] triangle_sides = triangle_input(sc);
		//Check type of the triangle
		triangle_type(triangle_sides);
	}
	
	public static double[] triangle_input(Scanner sc) {
		double[] sides = new double[3];
		while(true) {
			int check = 1;
			for(int i = 0; i < 3; i++) {
				sides[i] = sc.nextDouble();
				if(sides[i] <= 0) 
					check = 0;
			}
			
			if((sides[0] + sides[1]) <= sides[2] ||
			   (sides[0] + sides[2]) <= sides[1] ||
			   (sides[1] + sides[2]) <= sides[0]) {
				check = 0;
			}
			
			if(check == 0) {
				System.out.println("Not a triangle, please re-input.");
			} else if(check == 1) {
				break;
			}				
		}
		
		return sides;
	}

	public static void triangle_type(double[] sides) {
		if(sides[0] == sides[1] && sides[1] == sides[2]) {
			System.out.println("This is a equilateral triangle(three sides are equal).");
		}
		else if(sides[0] == sides[1] || sides[0] == sides[2] || sides[1] == sides[2]) {
			System.out.println("This is a isosceles triangle (two sides are equal).");
		}
		else System.out.println("This is a scalene triangle.");
	}
}
