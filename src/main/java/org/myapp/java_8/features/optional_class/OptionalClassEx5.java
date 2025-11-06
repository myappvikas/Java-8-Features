package org.myapp.java_8.features.optional_class;

import java.util.Optional;

public class OptionalClassEx5 {
	
	public static void main(String[] args) {  
          
	        String[] str = new String[10];
	        
	        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";
	        
	        // All three api returns optional class object. 
	        Optional<String> empty = Optional.empty();  
	        System.out.println(empty);  
	        
	        Optional<String> optional = Optional.of(str[5]); 
	        System.out.println(optional);
	     
	        Optional<String> optional2 = Optional.ofNullable(str[5]);
	        System.out.println(optional2);

	        // If value is present, it returns an Optional otherwise returns an empty Optional  
	        System.out.println("Filtered value: "+optional.filter(s->s.equals("Abc")));  
	        System.out.println("Filtered value: "+optional.filter((s)->s.equals("JAVA OPTIONAL CLASS EXAMPLE")));
	        
	        // It returns value of an Optional. if value is not present, it throws an NoSuchElementException    
	        System.out.println("Getting value: "+optional.get());
	        
	        // It returns hashCode of the value  
	        System.out.println("Getting hashCode: "+optional.hashCode());  
	        
	        // It returns true if value is present, otherwise false  
	        System.out.println("Is value present: "+optional.isPresent());
	        
	        // It returns value if available, otherwise returns specified value,  
	        System.out.println("orElse: "+optional.orElse("Value is not present")); 
	        
	        System.out.println("orElse: "+empty.orElse("Value is not present"));  
	        optional.ifPresent(System.out::println);   // printing value by using method reference   
	        
	    }  
}
