package imp_programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeated_word_letter {
	public static void main(String[] args) {
		Map<Object, Integer> sp=new LinkedHashMap<Object, Integer>();
		String sasi="Fears leads to anger, anger leads to hatred, haterd leads to conflict, conflict leads to suffering";
		String[] ps = sasi.split(" ");
		for (String string : ps) {
			if (sp.containsKey(string)) {
				Integer value = sp.get(string);
				sp.put(string, value+1 );	
				
			}
			else {
				sp.put(string, 1);
				
			}
			System.out.println(string);	
		}
		Set<Entry<Object,Integer>> entrySet = sp.entrySet();
		for (Entry<Object, Integer> entry : entrySet) {
		if (entry.getValue()>=0) {
			
			System.out.println(entry);
			
		}		
			}
			
		}	
			
		
				
		
	
		
		
		
	}

