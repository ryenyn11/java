public class ex6 {

	public static void main(String[] args) {
		 String s ="Write a Java program very easily";
		 /*Used to contain the number of characters a in the string*/
		 int count=0; 
		 /*đếm số kí tự 'a'**/
		 for (int i=0;i<s.length();i++)
			 if(s.charAt(i)=='a') count++; 
		 System.out.println("number of characters in string ="+count);
		 
		 // Check the string contains the word "Java?" /
		 int index =s.indexOf("Java");
		 
		if (index>=0) System.out.println("tu Java dau tien cua chuoi o vi tri "+index); 
		else System.out.println("chuoi khong chua Java");
		
		//Check if the string starts with the phrase “write"
		if (s.startsWith("Write") == true) System.out.println("tu Write bat dau chuoi"); 
		
		//Check if the string ends with the word "easily 
		if (s.endsWith("easily") == true) System.out.println("tu Easily kthuc chuoi");  
	 
	    else System.out.print("tu  easily khong ket thuc chuoi");
		
	}
	
}
