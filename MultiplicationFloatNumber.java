package Day4;
import java.util.*;
public class MultiplicationFloatNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		float firstno = sc.nextFloat();
		System.out.println("Enter second number");
		float seco = sc.nextFloat();
		sc.close();
		System.out.println("Multiplication of two number: "+(firstno * seco));
	}
}