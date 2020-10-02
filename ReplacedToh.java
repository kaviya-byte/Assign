package day3a;

public class ReplacedToh {

	public static void main(String[] args) {
		
		String str = new String( "dark clouds are more  like darker place in the day of winter ");

        // Replace all the 'd' characters with 'h' characters.
        // Display the strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("String after replacing all 'd' with 'h' :");
        System.out.println(str.replace('d','h'));

	}

}
