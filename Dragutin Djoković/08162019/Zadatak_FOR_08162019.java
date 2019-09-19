package domaci4n;
import java.util.Scanner;
public class Zadatak_FOR_08162019 {

	public static void main(String[] args) {
		// Proizvod neparnih prirodnih brojeva od a do b
		Scanner sc = new Scanner(System.in);
		
		int przv = 1;
		
		System.out.println("Unesite pocetnu vrednost a:");
		int a = sc.nextInt();
		System.out.println("Unesite krajnju vrednost b:");
		int b = sc.nextInt();
		
		for(int i=a;i<=b;i++)
			if(i%2!=0)
				przv*=i;
		System.out.println(przv);
		
	
	}

}
