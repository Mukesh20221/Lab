package Day6;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any year");
		int year =sc.nextInt();
		sc.close();
		if((year>0)&&(year%400==0)||(year%4==0)) {
			System.out.println(year+" is a leap year");
		}
		else {
			System.out.println(year+" is not a leap year");
		}
	}
}