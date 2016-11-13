package esercizi.week4;

import java.util.Scanner;

public class SecondoArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int array[] = new int [10];
		int counter=0;
		
		System.out.println("Inserisci 10 numeri");
		for(int i=0;i<10;i++){
			array[i]=sc.nextInt();	
			if(array[i]>=0)
				counter++;	
		}
		System.out.println("Contenuto array");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
			System.out.print(" ");
		}
			
		System.out.println('\n');	
		System.out.println("Lunghezza secondo array: "+counter);
		
		int creaArray[]= new int[counter];
		for(int i=0,j=0;i<10;i++,j++){
			if(array[i]>=0){
				creaArray[j]=array[i];
			}
		}
		System.out.print("Contenuto secondo array invertito: ");
		for(int i=counter-1;i>=0;i--){
			System.out.print(creaArray[i]);
			System.out.print(" ");
			}
		
	}
}
