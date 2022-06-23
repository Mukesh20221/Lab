package Day4;
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any name");
		String name = sc.nextLine();
		sc.close();
		System.out.println("Your entered name: "+name);
	}
}