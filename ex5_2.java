package exercises;

class Dog {
	String name;
	String breed;
	int age;	
	 
	    public Dog(String name, String breed, int age)
	    {
	        this.name = name;
	        this.age = age;
	        this.breed = breed;
	    }
	 
	    public Integer getAge() {
	        return age;
	    }
	 
	    // other getters and setters
	 
	    @Override
	    public String toString() {
	        return "[" + name + ", " + String.valueOf(age) + ", " + breed + "]";
	    }
	}
 


enum br {BEAGLE, BULLDOG, POODLE, BOXER;}

public class ex5_2 {

	public static void main(String[] args) {
	 Dog dog1 = new Dog ("Rex", br.BEAGLE.name(),2);
	     
	 Dog dog2 = new Dog ("Flora", br.BULLDOG.name(), 5);
	     
	 Dog dog3 = new Dog ("Rex", br.BOXER.name(), 10);

     Dog empty = new Dog("", br.BEAGLE.name(), 0);
     

	
	 if (dog1.name.equals(dog2.name) || dog1.name.equals(dog3.name) || dog2.name.equals(dog3.name))  { 
		 System.out.println(" Dogs have the same name");}
		 else
		 { System.out.println("All dogs have different names");}
	 
	 empty = dog1;
	 if (dog2.age>empty.age) {empty=dog2;}
	 else if (dog3.age>empty.age) {empty=dog3;}
	 
	 System.out.println("The oldest dog is " + empty.age + " years old. Its' name is " + empty.name + ", it is " + empty.breed);
 }
	}
