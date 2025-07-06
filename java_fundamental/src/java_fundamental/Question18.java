package java_fundamental;
import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				System.out.print("Enter a number: ");
				int number = sc.nextInt();
				
				int reversed = 0;
				int n = Math.abs(number);
				
				while (n != 0) {
					int digit = n % 10;
					reversed = reversed * 10 + digit;
					n /= 10;
				}
				
				if (number < 0) {
					reversed = -reversed;
				}
				
				System.out.println("Reversed number: " + reversed);

	}

}
