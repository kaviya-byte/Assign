package exercise;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter first number:");
		
		int  num1 = sc.nextInt();
		System.out.println("enter second number:");
		int  num2 = sc.nextInt();
		int temp=0;
		temp = num1;
		num1=num2;
		num2=temp;
		System.out.println("after swapping:");
		System.out.println("value of first number::" +num1);
		System.out.println("value of second number:: " +num2);
		

	}

}
