package n42;

public class Zadatak_1_13082019 {

	public static void main(String[] args) {
		int a=1,b=2,c=3,d=4;
		
		a++;//=2, Na a cija je vrednost 1 se dodaje 1
		a=b++;// a=2(jer prvo uzima vrednost 2 od b),b=3(na b=2 se dodaje 1)
		
		c--;//=2, od c cija je vrednost 3 se oduzima 1
		d=c--;// d=2(prvo d uzima vrednost 2 od c)
			//c=1(od c vrednosti 2 se oduzima 1)
		
		++a;//a=3(na a vrednost 2 se dodaje 1)
		b=++a;/*b=4(jer uzima vrednost od a na koju je dodato 1 na preth. vrednost a=3)
				* a=4(na prethodnu vrednost a=3 se dodaje 1)
				*/ 
		--c;//c=0(od prethodne vrednosti c=1 oduzima se 1)
		c=--d;//d=1(od prethodne vrednosti d=2 se oduzme prvo 1)
			  //c=1(preuzima vrednost od d)
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