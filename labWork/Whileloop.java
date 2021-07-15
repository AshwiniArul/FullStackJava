package labWork;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n Please Enter any integer Value below 10: ");
		int sum =0;
		int number = sc.nextInt();
		while (number <= 10) 
		{
		sum += number;
		number++;
		}
		System.out.format(" Sum of the Numbers From the While Loop is: %d "+sum);
	}

}
