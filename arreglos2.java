package basics;
/*programa que crea una matriz de tipo string que contendrá paises. Se recorrerá tanto con un bucle for 
 * como con uno for-each se usarán amdos metodos para declarar e inicializar arrays. Se usará una ventana 
 * para pedirle al usuaio que rellene otro array
 */
import javax.swing.*;
public class arreglos2 {

	public static void main(String[] args) {
		String[]paises=new String[8];
		//String[]paises={"Cuba","Argentina","Uruguay"};	//de esta forma se declara e inicializa en una misma línea. 

		//inicialización manual		
		paises[0]="España";
		paises[1]="Mexico";
		paises[2]="Colombia";
		paises[3]="Peru";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";
		
		String [] capitales=new String[5];

//for tradicional para recorrer todo el array y sacar por pantalla los valores		
		for(int i=0;i<paises.length;i++){		
			System.out.println(paises[i]);
		}
/*for modificado o for-each. Se crea una variable del tipo de dato del array a recorrer y de esta forma
 * no hay que decirle al for de donde a donde recorrer el arreglo. Ya sabe que será de principio a fin 
 */
		for (String elemento:paises){
			System.out.println(elemento);
		}
		
//variante con un ciclo for tradicional
		/*
		for(int i=0;i<5;i++){
			String entrada=JOptionPane.showInputDialog("Ingrese una capital a guardar en memoria");
			System.out.println(capitales[i]=entrada);
		}
		*/		
	}

}
