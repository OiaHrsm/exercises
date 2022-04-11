package exercises;

import java.util.Scanner;

public class Person {

	// private variables
	private String name; 
	private int birthYear;


//initialize age
	  public void setbirthYear(int birthYear) {
	    this.birthYear = birthYear;
	  }

	  // initialize name
	  public void setName(String name) {
	    this.name = name;
	  }

	  // access age
	  public int getbirthYear() {
	    return this.birthYear;
	  }

	  // access name
	  public String getName() {
	    return this.name;
	  }
	  
	  //age
	  void Age() {
		  int years = 2022 - birthYear;
		  System.out.println("He/she is " + years + " old");;
	  }
	  
	  //input
	  void input() {
		  Scanner sc = new Scanner(System.in);
	 
		  System.out.println("Enter name of the person");
		  name = sc.nextLine();
		  System.out.println("Enter birth year of the person");
		  birthYear = sc.nextInt();
		  sc.close();
	  }
	  
	  //output
	  void output() {
		  System.out.println("This person is " + name + " he/she was born in " + birthYear);
	  }
	  
	  //change Name
	  void changeName() {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter corrected name");
		  name = sc.nextLine();
		  sc.close();
	  }
	  
	  public static void main(String[] args) {
		 
		  
		  Person person1 = new Person();
		  person1.input();
		  person1.output();
		  person1.Age();
		  Person person2 = new Person();
		  person2.input();
		  person2.output();
		  person2.Age();
		  Person person3 = new Person();
		  person3.input();
		  person3.output();
		  person3.Age();
		  Person person4 = new Person();
		  person4.input();
		  person4.output();
		  person4.Age();
		  Person person5 = new Person();
		  person5.input();
		  person5.output();
		  person5.Age();
		  
		  person2.changeName();
		  person2.output();
		 
}}