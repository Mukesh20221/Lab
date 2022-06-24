package Day4;
import java.util.*;
public class Add2Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//Scanner object
		System.out.println("Enter first number");//Print message
		int firstno = sc.nextInt();//Take user input
		System.out.println("Enter second number");//Print message
		int secno = sc.nextInt();//Take user input
		sc.close();//Close scanner bject
		System.out.println("Addition of two number: "+(firstno +secno ));//Print result
	}
}
