package basics;
//programa que utilizará el bucle for-each para recorrer una matriz y que rellenará la misma.
public class matrix2 {

	public static void main(String[] args) {
		//declaración e inicialización de una matrix en una misma línea
		int[][]matrix={{10,15,18,19,21},{5,25,37,41,15},{7,19,32,14,90},{85,2,7,40,27}};
		
/*en el bucle for mejorado, se declara una variable del tipo de dato del arreglo que se recorre, aca 
en el arreglo de dos dimensiones es igual, lo que la variable que recorre el arreglo exterior es un
arreglo tambien, o sea el arreglo interior (linea 11).La variable que recorre el arreglo interior si 
es una variable de tipo int*/
		for(int[]fila:matrix){
			System.out.println();
			 for(int i:fila){
				 System.out.print(i+" ");
			 }
		}
	}

}
