package Day6;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		int fact =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any to find factorial");
		int input = sc.nextInt();
		for(int i=input;i>=1;i--) {
			fact =fact*i;
		}
		System.out.println(fact+" is the factorial of "+input);
		sc.close();
	}
}