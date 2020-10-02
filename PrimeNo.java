package exercise;

public class PrimeNo {

	public static void main(String[] args) {
		int ind,meth=0,flag=0;
		int number=13;//It is the number to be checked
		
		meth=number/2;
		if(number == 0 || number == 1) {
			System.out.println("it is not prime number" +number);
			
		}else {
			for(ind=2;ind<=meth;ind++){
				if(number%1 == 0) {
					System.out.println("is  not prime number" +number);
					flag=1;
					break;
					
				}
				
			}
			if(flag==0) {
				System.out.println("is prime number" +number);
			}
		}
		
		
			
		
		

	}

}
