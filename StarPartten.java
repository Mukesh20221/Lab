package Day6;
import java.util.Scanner;
public class StarPartten {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of line");
		int line = sc.nextInt();
		sc.close();
		for(int i =0;i<=line;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}