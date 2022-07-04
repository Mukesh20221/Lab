package Day6;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int input =sc.nextInt();
		for(int i =2;i<=input-1;i++) {
			if(input%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println(input+" is a prime no");
		}
		else {
			System.out.println(input+" is not a prime no");
		}
		sc.close();
	}
}