package exercises;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		double a, b, c, x, y;
		boolean t = false;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side a: ");
		a = scanner.nextDouble();
		
		System.out.println("Enter side b: ");
		b = scanner.nextDouble();
		
		System.out.println("Enter side c: ");
		c = scanner.nextDouble();
		
		System.out.println("Enter size x: ");
		x = scanner.nextDouble();
		
		System.out.println("Enter size y: ");
		y = scanner.nextDouble();
		
		scanner.close();
		
		if (a<=x & (b<=y|c<=y)) t=true;
		if (b<=x & (a<=y|c<=y)) t=true;
		if (c<=x & (b<=y|a<=y)) t=true;
			
		if (t==true) System.out.println("The block can go through the hole");
		else
			System.out.println("The block is too big");
	}

}
