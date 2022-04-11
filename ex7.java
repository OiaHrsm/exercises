package exercises;

abstract class Bird{
	abstract void feather();{
   System.out.println("This bird has feather, as well as all other");}
   
   abstract void layEggs();{
	   System.out.println("This bird lay Eggs, as other do too");}
  
	   static void fly(){
	    	System.out.print("we are flyyyiing"); 
	}
}

 abstract class FlyingBird extends Bird{
	 abstract void flying();{
	    	System.out.println("This bird can fly");
}}
 
 abstract class NonFlyingBird extends Bird{
	 abstract void walk();{
	    	System.out.println("This bird can only walk");
	    }
 }

  class Eagle extends FlyingBird{
	 
 }
 
  class Swallow extends FlyingBird{
	 
 }

  class Chiken extends FlyingBird{
	 
}

  class Penguin extends NonFlyingBird{
	 
}
 
public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird[] cage = new Bird[4];
		System.out.println("Eagle:");
		   cage[0] = new Eagle();
	    System.out.println("Swallow:");
		   cage[1] = new Swallow();
        System.out.println("Chiken:");
		   cage[2] = new Chiken();
		System.out.println("Penguin:");
		   cage[3] = new Penguin();
		   
		   System.out.print(" Eagle is saying:"); Eagle.fly();
		   
	}

}
