package esercizi.week4;

public class SommaPariDispari {

	public static void main(String[] args) {
		int array[]={
				10,
				10,
				10,
				10,
				10,
				10,
				10,
				10,
				10,
				10			
		};
		int sommaDispari=0,sommaPari=0;
		
		System.out.println("Numeri presenti nell'array");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
			System.out.print(" ");
		}
			
		System.out.println('\n');
		
		for(int i=0;i<array.length;i=i+2){
			
					sommaPari=sommaPari+array[i];
			
		}
		System.out.println("Somma posizione pari: "+sommaPari);
		
		for(int i=1;i<array.length;i=i+2){
			
			sommaDispari=sommaDispari+array[i];
	
}
		System.out.println("Somma posizione dispari: "+sommaDispari);
		
		if(sommaPari==sommaDispari){
			System.out.println("Pari e Dispari uguali");
		}else{
			System.out.println("Pari e Dispari diversi");
		}
		
		
	}

}
