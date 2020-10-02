package exercise;

public class FizzBuzz {

	public static void main(String[] args) {
		{ 
			int num=100;
		//loop for 100 times
		for (int index = 1; index <= num; index++) {
			if (index % 15 == 0)// is the divide by both of 3 and 5?
				{
				System.out.println("fizzbuzz");
			}
			else if ((index %5) == 0 )//is it a multiple of 5?
			{
				System.out.println("Buzz");
			}
			else if ((index % 3)  == 0)// is it a multiple of 3?
			{
				System.out.println("Fizz");
			}
			else 
			{
				System.out.println(index);//not a ,multiple of 3or 5  
			}
			
		}

	}

}
}
