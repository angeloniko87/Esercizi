package esercizi.week4;

public class TreConsecutivi {

	public static void main(String[] args) {
		
		int array[]={
				10,
				10,
				1,
				10,
				1,
				10,
				1,
				10,
				1,
				10			
		};
		
		boolean a=false;
		
		for(int i=0;i<=7;i++){
			if(array[i]==array[i+1] && array[i+1]==array[i+2]){
				a=true;
			}
			
			
			}
			if (a){
				System.out.println("Presenti 3 valori consecutivi uguali");
			}else{
				System.out.println("Non sono presenti 3 valori consecutivi uguali");
			
				
			}
			
			
		}
		
				
				
			}
		
	
	
