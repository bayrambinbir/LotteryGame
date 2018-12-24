package programmingExcercisesCH05;

import java.util.Random;
import java.util.Scanner;

public class LotteryGame {
	public static void main(String[] args) {
		
		Random random = new Random();
		int num = random.nextInt(25-10+1)+10;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 10-25");
		int userNumber = input.nextInt();
		int userNumber1 = userNumber %10;
		int userNumber2 = userNumber /10;
		int firstDigit = num % 10;
		int secondDigit = num /10;
		
		if(userNumber == num) {
			System.out.println("Lottery number is: "+num);
			System.out.println("Your  number is: "+userNumber);
			System.out.println("Exact match. You won $100.000");
		} else if ((userNumber1 == secondDigit) && (userNumber2==firstDigit)){
			System.out.println("Lottery number is: "+num);
			System.out.println("Your  number is: "+userNumber);
			System.out.println("All the disgits are matching.You won $50.000");
		} else if ((userNumber1 == firstDigit) || (userNumber2==secondDigit)) {
			System.out.println("Lottery number is: "+num);
			System.out.println("Your  number is: "+userNumber);
				System.out.println("One digit is matching. You won $25.000");
		} else {
			System.out.println("Lottery number is: "+num);
			System.out.println("Your  number is: "+userNumber);
			System.out.println("Sorry no match.");
		}
			
		}
	

}
