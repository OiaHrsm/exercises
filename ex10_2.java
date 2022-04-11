package exercises;

import java.util.HashMap;
import java.util.Map;

public class ex10_2 {

	public static void main(String[] args) {

		Map<String, String> personMap = new HashMap<String, String>();
		
		        personMap.put("Fox", "Andrew");
		        personMap.put("Smith", "Ann");
		        personMap.put("Clark", "Emilia");
		        personMap.put("Efron", "Zack");
		        personMap.put("Ando", "Bill");
		        personMap.put("Lin", "Jeremy");
		        personMap.put("Page", "Elliot");
		        personMap.put("White", "Ann");
		        personMap.put("Ming", "Yao");
		        personMap.put("Bond", "Willow");
		        
		        System.out.println(personMap);
		        
		        personMap.remove("Smith");
		        System.out.println(personMap);
		    }
		
	}

