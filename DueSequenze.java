package esercizi.week4;

import java.util.Scanner;

public class DueSequenze {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Inserisci una Stringa di 5 carateri");
		
		String a=sc.nextLine();
		char[] elementiA=a.toCharArray();
		if(elementiA.length !=5){
			System.out.println("Errore: devi inserire una stringa di 5 caratteri. La tua stringa è di " + elementiA.length +" caratteri");
		}else{
		
		System.out.println("Inseririsci una seconda Stringa di 5 caratteri");
		String b=sc.nextLine();
		char[] elementiB=b.toCharArray();
		if(elementiB.length !=5){
			System.out.println("Errore: devi inserire una stringa di 5 caratteri. La tua stringa è di " + elementiB.length +" caratteri");
		}
		
	}

}
}