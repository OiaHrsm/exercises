package exercises;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
	
		double r;

Scanner scanner = new Scanner(System.in);
		
     // task 1
		System.out.println("Enter radius: ");
		r = scanner.nextInt();
		
		
		System.out.println("Perimeter is:" + (2 * Math.PI * r));
		System.out.println("Area is:" + (Math.PI * r * r));
		
		
	// task 2
		String name;
		String address;
		
		scanner.nextLine();
		
		System.out.println("What is your name?");
		name = scanner.nextLine();
		System.out.println("Where do you live, " + name);
		address = scanner.nextLine();
		System.out.println("Your name is " + name + ", you live in " + address);
	
	
	 // task 3
	    double c1, c2, c3;
	    int t1, t2, t3;
	    double r1, r2, r3, rt;
	    
	    System.out.println("Enter standard unit for the first country: ");
		c1 = scanner.nextInt();
		System.out.println("Enter standard unit for the second country: ");
		c2 = scanner.nextInt();
		System.out.println("Enter standard unit for the third country: ");
		c3 = scanner.nextInt();
	
		System.out.println("Enter contiunity of the first call: ");
		t1 = scanner.nextInt();
		System.out.println("Enter contiunity of the second call: ");
		t2 = scanner.nextInt();
		System.out.println("Enter contiunity of the third call: ");
		t3 = scanner.nextInt();
		
		r1= c1*t1; System.out.println("Count for the first call is: " + r1);
		r2= c2*t2; System.out.println("Count for the second call is: " + r2);
		r3= c3*t3; System.out.println("Count for the third call is: " + r3);
		rt= r1+r2+r3; System.out.println("Count for all calls is: " + rt);
		
		scanner.close();
	}

}
