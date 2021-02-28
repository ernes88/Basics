package basics;
import java.util.*;
public class EntradaEjemplo1 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in); //construccion de un objeto de la clase Scanner llamado entrada que tomara como argumento lo que se introduzca por consola
		System.out.println("Introduce tu nombre por favor");
		String nombre=entrada.nextLine();       //la consola de sistema esperara a que se introduzca un caracter de tipo string y entonces lo almacenara en la variable nombre.
		System.out.println("Introduce tu edad por favor ");
		int edad=entrada.nextInt();
		System.out.println("Hola, tu nombre es "+nombre+" y tu edad es "+edad);

	} 

}	
