package Day6;
import java.util.*;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, number, temp, total = 0;
		System.out.println("Ënter 3 Digit Number");
		num = sc.nextInt();
		sc.close();
		number = num;
		while (number != 0) {
			temp = number % 10;
			total = total + temp*temp*temp;
			number /= 10;
		}
		if(total == num) {
			System.out.println(num + " is an Armstrong number");
		}
		else {
			System.out.println(num + " is not an Armstrong number");
		}
	}
}