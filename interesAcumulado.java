package basics;
/*programa que calcula cuanto sería el interés acumulado de una cuenta con capital inicial 10000 euros, 
 * en un lapso de 4 años, para 6 tipos de interés diferentes, 10-15%, o sea se requiere que el programa 
 * un array bidimensional en forma de tabla donde las filas serían los años y las columnas los valores 
 * de interés.  
 */

public class interesAcumulado {

	public static void main(String[] args) {
		double acumulado;
		double interes=0.10;
		double [][]saldo=new double[6][5];
		
		for(int i=0;i<6;i++){
			saldo[i][0]=10000; 
			acumulado=10000;
			for(int j=0;j<5;j++){
				acumulado=acumulado+(acumulado*interes);
				saldo[i][j]=acumulado;
			}
			
			interes=interes+0.01;
		}
		
		for(int z=0;z<6;z++){
			
			System.out.println();
			
			for(int h=0;h<5;h++){
				System.out.printf("%1.2f",saldo[z][h]);
				System.out.print(" ");
			}
		}
		
		
		
	}
}

/*
//variante mia que funciona.
public class interesAcumulado {

	public static void main(String[] args) {
		double [][]acumuladoAnual=new double[5][6];				//el primer valor de los corchetes es las filas y el segundo las columnas
		double []tazaInteres={0.10,0.11,0.12,0.13,0.14,0.15};
		double capitalInicial=10000;
		
		for(int i=0;i<5;i++){
			System.out.println();			
				if(i==0){
					for(int j=0;j<6;j++){
						acumuladoAnual[i][j]=capitalInicial;
						System.out.printf("%1.2f",acumuladoAnual[i][j]);
						System.out.print("  ");
					}
				}
				if(i==1){
					for(int j=0;j<6;j++){
						double valorAnterior=acumuladoAnual[i-1][j];
						acumuladoAnual[i][j]=(valorAnterior)*(tazaInteres[j])+valorAnterior;
						System.out.printf("%1.2f",acumuladoAnual[i][j]);
						System.out.print("  ");	
					}
				}
					
				if(i==2){
					for(int j=0;j<6;j++){
						double valorAnterior1=acumuladoAnual[i-1][j];
						acumuladoAnual[i][j]=(valorAnterior1)*(tazaInteres[j])+valorAnterior1;
						System.out.printf("%1.2f",acumuladoAnual[i][j]);
						System.out.print("  ");	
					}
				}
				
				if(i==3){
					for(int j=0;j<6;j++){
						double valorAnterior2=acumuladoAnual[i-1][j];
						acumuladoAnual[i][j]=(valorAnterior2)*(tazaInteres[j])+valorAnterior2;
						System.out.printf("%1.2f",acumuladoAnual[i][j]);
						System.out.print("  ");	
					}
				}
				if(i==4){
					for(int j=0;j<6;j++){
						double valorAnterior3=acumuladoAnual[i-1][j];
						acumuladoAnual[i][j]=(valorAnterior3)*(tazaInteres[j])+valorAnterior3;
						System.out.printf("%1.2f",acumuladoAnual[i][j]);
						System.out.print("  ");	
					}
				
				}
		}
	}
}
*/
