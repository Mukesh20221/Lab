package Day4;
import java.util.Scanner;
public class Multiplication2Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int firstno = sc.nextInt();
		System.out.println("Enter second number");
		int secno = sc.nextInt();
		sc.close();
		System.out.println("Multiplication of two number: "+(firstno * secno));
	}
}