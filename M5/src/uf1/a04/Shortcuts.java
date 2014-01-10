package uf1.a04;

public class Shortcuts {

	public static void main(String[] args) {
		
		
		
	}
	
	
	public static int repeticioElement (int[] valors, int e){ 
//		Mètode que retorna quantes vegades es repeteix el valor e a l'array valors
		int contador=0;
			
		for (int i = 0; i < valors.length; i++) {
			if (valors[i]==e) {
				contador++;
			}
		}
		return contador;
			
	}		
		

}

