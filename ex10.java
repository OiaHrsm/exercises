package exercises;

import java.util.Set;
import java.util.*;
 
public class ex10 {
	
	static void Union (Set a, Set b) {
	Set<Integer> union = new HashSet<Integer>(a);
    union.addAll(b);
    System.out.print("Union of the two Set: ");
    System.out.println(union);}
	
	static void Intersection (Set a, Set b) {
		Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set: ");
        System.out.println(intersection);
	}
	    public static void main(String args[])
	    {
	        Set<Integer> a = new HashSet<Integer>();
	        a.addAll(Arrays.asList(
	            new Integer[] { 12, 3, 25, 4, 18, 9, 20 }));
	       
	
	        Set<Integer> b = new HashSet<Integer>();   
	      b.addAll(Arrays.asList(
	            new Integer[] { 12, 3, 17, 5, 4, 20, 7, 25 }));
          Union (a, b);
          Intersection (a, b);
          
	    } }