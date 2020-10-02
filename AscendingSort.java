package day3a;

import java.util.Scanner;

public class AscendingSort {

	public static void main(String[] args) {
        int count, temp;
    	
    	//User inputs the array size
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements you want in the array: ");
        count = scan.nextInt();
    
        int num[] = new int[count];
        System.out.println("Enter array elements:");
        for (int index = 0; index < count; index++) 
        {
            num[index] = scan.nextInt();
        }
        scan.close();
        for (int index = 0;  index< count; index++) 
        {
            for (int ind = index + 1; ind < count; ind++) { 
                if (num[index] > num[ind]) 
                {
                    temp = num[index];
                    num[index] = num[ind];
                    num[ind] = temp;
                }
            }
        }
        System.out.println("Array Elements in Ascending Order: ");
        for (int index1 = 0; index1 < count - 1; index1++) 
        {
            System.out.println(num[index1] + " ");
        }
        System.out.println(num[count - 1]);

	}

}
