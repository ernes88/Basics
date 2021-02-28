package basics;

public class arrays {

	public static void main(String[] args) {
		int[] arreglo=new int[5];	
		for(int i=0;i<5;i++){
			arreglo[i]=i*2;		//lleno el array con el for.
			System.out.println("El valor de arreglo[i] para i="+i+" es "+arreglo[i]);
		}
		
		int[] arreglo1={0,2,4,6,8,5,6,7,8,9,4,5,6,32,7,4,56,76,5,3,2,1,4,5,6,7,89};		//de esta forma se puede crear un arreglo sin necesidad de usar el operador new. Usando new se declara el array pero no se inicializa, pues no se puede inicializar en esas misma linea. 
		for(int j=0;j<arreglo1.length;j++){												//usando el operador legth se puede saber la cantidad de elementos que tiene un arreglo cuando es muy grande y no sabemos, pa no tener que contar los elementos.
			System.out.println("El valor de arreglo[j] para j="+j+" es "+arreglo1[j]);
		}
	
	
	}
	

}
