package basics;
//se construye una matriz de 2x2  se llena manualmente. Se recorre la misma y se sacan sus valores por consola

public class matrix {
//programa que genera un array bidimensional y lo recorre imprimiedo ss valores de forma normal y luego en formato tabla
	public static void main(String[] args) {
		int [][]matrix=new int[2][2];
		matrix[0][0]=1; 
		matrix[0][1]=2;
		matrix[1][0]=3;
		matrix[1][1]=4;
		
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.println("El valor almacenado en la posición:"+i+","+j+" es "+matrix[i][j]);
			}
		}
//bloque de código para representar la matriz en forma de tabla.		
		for(int k=0;k<2;k++){
			for(int l=0;l<2;l++){
				System.out.print(matrix[k][l]+" ");
				
				if((l==1)&&(k==0)){
					System.out.println("");
				}
					
			}
		}
//Esta variante de abajo es mejor pues funciona independientemente del orden de la matriz		
		for(int z=0;z<2;z++){
			System.out.println();
			for(int y=0;y<2;y++){
				System.out.print(matrix[z][y]+" ");
			}
		}
	}

}
