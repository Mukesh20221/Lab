package Day4;
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//Scanner object
		System.out.println("Please enter any name");//Print message
		String name = sc.nextLine();//Take user input
		sc.close();//Close scanner object
		System.out.println("Your entered name: "+name);//Print result
	}
}
