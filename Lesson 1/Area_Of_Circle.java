package area_of_circle;

import java.util.Scanner;

public class Area_Of_Circle {

	public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
		double radius, area;
		String name;
		System.out.println("Enter your name: ");
		name = input.nextLine();
		System.out.println("Enter radius of circle: ");
		radius = input.nextInt();
		area = Math.PI * radius * radius;
		System.out.println(Math.PI + " * " + radius * radius + " = " + area);
		// TODO Auto-generated method stub

	}

}
