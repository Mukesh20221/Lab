package Day4;
import java.util.*;
public class MultiplicationFloatNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//Scanner object
		System.out.println("Enter first number");//Print message
		float firstno = sc.nextFloat();//Take user input
		System.out.println("Enter second number");//Print message
		float seco = sc.nextFloat();//Take user input
		sc.close();//Close scanner object
		System.out.println("Multiplication of two number: "+(firstno * seco));
	}
}
