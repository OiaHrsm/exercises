package exercises;
   import java.util.Scanner;
   import java.util.Arrays;


public class ex9 {
	
	static double divide(double a, double b) {
	    if (b == 0) {
	       System.out.println("Error, division by zero is undefined!");
	    return 0;
	    }  
	    else {
	    	return a/b;
	    }
	}
	
	
	 public static boolean ReadNumber (int start, int end, int num)
	    { if ((num>=start) && (num<=end)) return true;
	    else 
	    	return false;
	        }

	public static void main(String[] args) {

Scanner sc = new Scanner (System.in);
 
//part 1
		System.out.print("Enter first value ");
		double a = sc.nextDouble();
		System.out.print("Enter second value ");
		double b = sc.nextDouble();
		
		double r = divide(a, b);
		System.out.println(a + " / " + b + " = " + r);
	
//part 2
		System.out.print("Enter begining of the range ");
		int start = sc.nextInt();
		System.out.print("Enter end of the range ");
		int end = sc.nextInt();
		double[] arr;
		arr = new double[10];
		for (int i=0; i<10; i++) {
		System.out.print("Enter your number ");
		int num = sc.nextInt();
	    boolean m = ReadNumber(start, end, num); 
	    if (m==true) {
	    start = num;
	    arr[i] = num;}
	    else {System.out.println("Wrong number!"); 
	    break;}
		}
		sc.close();
		System.out.println(Arrays.toString(arr));
		} 
	}


