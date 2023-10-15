import java.util.*;
public class ex7 {
	public static void main(String[] args) {
		
  // Vector of initial capacity (size) of 6 
   Vector<String> vec = new Vector<String> (6); 
   // Adding elements to a vector
   vec.addElement("Banana"); 
   vec.addElement("Watermelon"); 
   vec.addElement("Mango"); 
   vec.addElement("Apple"); 
   /* check size and capacityIncrement*/ 
   System.out.println("Size is: "+vec.size());
   System.out.println("Default capacity increment is: " +vec.capacity());
   
   		vec.addElement("Grape");
   		vec.addElement("Orange"); 
   		vec.addElement("Clipart");
				
	/*size and capacityIncrement after two insertions*/
	System.out.println("Size after addition: "+vec.size());
	System.out.println("Capacity after increment is: " +vec.capacity());
	//*Display Vector elements 
	Enumeration en = vec.elements(); 
	System.out.println("\nElements are:");
	while (en.hasMoreElements()) 
	     System.out.print (en.nextElement() + " ");
	}

}
