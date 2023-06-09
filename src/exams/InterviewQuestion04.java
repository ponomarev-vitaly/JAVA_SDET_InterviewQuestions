package exams;

import java.util.Scanner;

public class InterviewQuestion04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer to check if it is prime or not");
		int number = scan.nextInt();
		primeCalculator(number);
        scan.close();

		// Solution 2.
		System.out.println("-----*********/////*********-----");
		boolean flag = true;

		if(number >= 2){
			for (int i = 2; i < number; i++) {
				if(number%i==0) {
					flag = false;
					break;
				}
			}

			if(flag){
				System.out.println("Number is prime " + number);
			}else{
				System.out.println("Number is not prime " + number);
			}
		}else if(number==1){
			System.out.println("The number is prime " + number);
		}else{
			System.out.println("Number is not prime!");
		}
	}

	public static void primeCalculator(int number) {
		int count = 0;
		if(number>0) {
			if (number == 1) {
				System.out.println(number + " is prime number");
			}else {
				for(int i=2; i<number; i++) {
					if(number%i==0) {
						count++;
					}
				}
				if(count==0) {
					System.out.println(number + " is prime");
				}else {
					System.out.println(number + " is not prime");
				}
			}
		}else {
			System.out.println("Enter a positive integer");
		}
	}

}
