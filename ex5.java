package exercises;

import java.util.Scanner;
import java.lang.reflect.Field;
import static java.lang.System.out;

public class ex5 {
	
private static boolean inRange(float x, int i, int j) {
		if (x>=i & x<=j) return true;
		else 
			return false;
	}
	public static void main(String[] args) {
	
		float a, b, c;
		boolean d, e, f;
		int k, l, m;
		
		Scanner scanner = new Scanner(System.in);
		
		//part1
		
		System.out.println("Enter first value");
		a = scanner.nextFloat();
		System.out.println("Enter second value");
		b = scanner.nextFloat();
		System.out.println("Enter third value");
		c = scanner.nextFloat();
		
		d=inRange(a, -5, 5); System.out.println(d);
		if (d==true) System.out.println("The number is ok");
		else
			System.out.println("the number is out of range");
		
		e=inRange(b, -5, 5);
		if (e==true) System.out.println("The number is ok");
		else
			System.out.println("the number is out of range");
		
		f=inRange(c, -5, 5);
		if (f==true) System.out.println("The number is ok");
		else
			System.out.println("the number is out of range");
		
		//part2
		
	    int min = Integer.MAX_VALUE;
	    int max = Integer.MIN_VALUE;
	    
		System.out.println("Enter first value");
		k = scanner.nextInt();
		 if (k < min) { min = k; }
	       if (k > max) { max = k; }
		System.out.println("Enter second value");
		l = scanner.nextInt();
		 if (l < min) { min = l; }
	       if (l > max) { max = l; }
		System.out.println("Enter third value");
		m = scanner.nextInt();
		 if (m < min) { min = m; }
	       if (m > max) { max = m; }
	       
	       System.out.println("The smallest number amoung entered: " + min);
	       System.out.println("The largest number amoung entered: " + max);
	

	//part3
	
		enum HTTPError {
			BadRequest,
			Unauthorized,
			PaymentRequired,
			Forbidden,
			NotFound,
			MethodNotAllowed,
			NotAcceptable,
			ProxyAuthenticationRequired,
			RequestTimeout,
			Conflict,
			Gone;
			}
		
		System.out.println("Enter your mistake number");
		int number = scanner.nextInt();
		
		if(number==400)  System.out.println("Your mistake is: " + HTTPError.BadRequest);
		else if(number==401) System.out.println("Your mistake is: " + HTTPError.Unauthorized);
		else if(number==402) System.out.println("Your mistake is: " + HTTPError.PaymentRequired);
		else if(number==403) System.out.println("Your mistake is: " + HTTPError.Forbidden);
		else if(number==404) System.out.println("Your mistake is: " + HTTPError.NotFound);
		else if(number==405) System.out.println("Your mistake is: " + HTTPError.MethodNotAllowed);
		else if(number==406) System.out.println("Your mistake is: " + HTTPError.NotAcceptable);
		else if(number==407) System.out.println("Your mistake is: " + HTTPError.ProxyAuthenticationRequired);
		else if(number==408) System.out.println("Your mistake is: " + HTTPError.RequestTimeout);
		else if(number==409) System.out.println("Your mistake is: " + HTTPError.Conflict);
		else if(number==410) System.out.println("Your mistake is: " + HTTPError.Gone);
		   else
			System.out.println("Sorry, your mistake is not found");
 
		scanner.close();
 
	}}
		

	
