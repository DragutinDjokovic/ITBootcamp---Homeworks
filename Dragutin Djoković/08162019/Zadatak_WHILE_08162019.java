package domaci4n;
import java.util.Scanner;
public class Zadatak_WHILE_08162019 {

	public static void main(String[] args) {
		// 	Ispis prirodnih brojeva od 1 do n koji su djeljivi sa a.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n");
		int n = sc.nextInt();
		System.out.println("Unesite broj a");
		int a = sc.nextInt();
		int p=1;
		while(p<=n) {
			if(p%a==0) {
				System.out.print(p+",");
				
			}
			p++;
		}
	}

}
