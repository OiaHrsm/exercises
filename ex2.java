package exercises;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
	
		int n;
		int d;
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		n = scanner.nextInt();
		scanner.close();
		
		//part a
		d = n*n;
		System.out.println("Doubled entered value: " + d);
		String str1 = Integer.toString(d);
		if (str1.contains("3")) System.out.println("There is 3 in the number"); 
		else System.out.println("There is no 3");
		
		
		//part b
		String str2 = Integer.toString(n);
		StringBuilder sb = new StringBuilder(str2);
		sb.reverse();
		System.out.println("Reversed number: " + sb.toString());
		
		//part c
		String str3 = Integer.toString(n);
        str3 = str3.substring(str3.length()-1)+str3.substring(1, str3.length()-1)+str3.substring(0, 1);
        System.out.println("Number with switched last and first elements: " + str3);
		
		//part d
        String str4 = Integer.toString(n);
        System.out.println("Line with added 1 on the begining and end: " + "1" + str4 + "1");
	}

}
