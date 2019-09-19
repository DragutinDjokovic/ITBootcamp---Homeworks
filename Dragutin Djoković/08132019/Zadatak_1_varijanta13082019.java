package n42;

public class Zadatak_1_varijanta13082019 {

	public static void main(String[] args) {
		int a=1,b=2,c=3,d=4;
		a=b++ + c++;//b=2 + c=3(a preuzima vrednosti sa desne strane a=5)
					//b=3 (dodaje mu se 1)
					//c=4 (dodaje mu se 1)	
		b=c-- + d--;//c=4 + d=4 (b preuzima vrednost sa desne strane b=8)
					//c=3 (oduzima se 1)
					//d=3 (oduzima se 1)
		c=++d - ++a;//d=4 - a=6; c=-2
		d=--a - --b;//a=5 - b=7; d=-2
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

/*
Napisati 8 primera za post inkrementu (i++), pre inkrementu (++i), 
post dekrementu (i--) i pre dekrementu (--i) i u programu 
u komentarima opisati kako koji primer funkcionise. Napisati po 2 primera o svakom.
*/