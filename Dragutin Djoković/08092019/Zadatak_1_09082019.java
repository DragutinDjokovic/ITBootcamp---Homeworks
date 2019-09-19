package dp;

import java.util.Scanner;


public class Zadatak_1_09082019
{
 
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   int a;
  
   System.out.println("Unesite broj. Provericemo da li je paran. "); //Unosi se neka vrednost u a
    a = sc.nextInt();
   if (a % 2 == 0) {
      System.out.println("Broj je paran!");
   }
   else {
     System.out.println("Broj je neparan!");
   }
  
 }
}
