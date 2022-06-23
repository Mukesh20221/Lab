package Day4;
import java.util.*;
public class Add2Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int firstno = sc.nextInt();
		System.out.println("Enter second number");
		int secno = sc.nextInt();
		sc.close();
		System.out.println("Addition of two number: "+(firstno +secno ));
	}
}