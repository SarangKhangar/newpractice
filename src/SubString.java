
public class SubString {
	
	public static void main(String[] args) {
		
		String str = "Geeks Gor Geeks";
		
		int index = 6;
		 
        // Get the character
        char ch = 'F';
 
        // Print the original string
        System.out.println("Original String = " + str);
        
        System.out.println(str.substring(0, index));
        
        System.out.println(str.substring(index + 1));
 
        str = str.substring(0, index) + ch
              + str.substring(index + 1);
 
        // Print the modified string
        System.out.println("Modified String = " + str);

		
	}
	
}
