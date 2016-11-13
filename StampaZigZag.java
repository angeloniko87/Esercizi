package esercizi.week4;

public class StampaZigZag {

	public static void main(String[] args) {
		int array[]={
				12,
				21,
				34,
				46,
				59,
				61,
				74,
				88,
				94,
				102			
		};
		
		System.out.println("Numeri presenti nell'array");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
			System.out.print(" ");
			
		}
		System.out.println('\n');
		System.out.println("--------------------------");
		System.out.println('\n');
		
		for(int j=0, z=array.length-1;j<z;j++,z--){
			System.out.println("ZigZag Array");
			System.out.print(array[j]);
			System.out.print(" ");
			
			System.out.print(array[z]);
			System.out.println('\n');
		}
		
	}

}
