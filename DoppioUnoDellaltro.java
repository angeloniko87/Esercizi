package esercizi.week4;

public class DoppioUnoDellaltro {

	public static void main(String[] args) {
		
		int array[]={
				20,
				20,
				1,
				40,
				1,
				10,
				1,
				10,
				1,
				10			
		};
		
		boolean a=false;
		
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length-1; j++){
				if(array[i]==2*array[j] || array[j]==2*array[i]){
					a=true;
				}
			}
			
			}
		if(a){
			System.out.println("Presenti alementi doppi uno dell'altro");
		}else{
			System.out.println("Non sono presenti elementi doppi uno dell'altroS");
		}
			
		}
	}


