package domaci4n;
import java.util.Scanner;
public class Zadatak_IF_08162019 {

	public static void main(String[] args) {
		// Učitati dva broja a zatim ispisati manji pa veći broj.
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite prvi broj:");
		int p = sc.nextInt();
		System.out.println("Unesite drugi broj:");
		int d = sc.nextInt();
		
		if(p<d) {
			System.out.println("Manji broj je:"+p);
		}
		else if (p==d) {
			System.out.println("Brojevi ne smeju biti isti.");
		}
		
		else {
			System.out.println("Manji broj je:"+d);
		}
	}

}
