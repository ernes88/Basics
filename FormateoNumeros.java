package basics;
//programa que permita calcular la raiz cuadrada de cualquier numero que introduzca el usuario
import java.util.*;
public class FormateoNumeros {

	public static void main(String[] args) {
		
		Scanner raiz=new Scanner(System.in);
		System.out.println("Teclee un valor");
		int rcuadrada=raiz.nextInt();
		System.out.println("La raiz cuadrada sin formatear de "+rcuadrada+" es:"+ Math.sqrt(rcuadrada));
		System.out.print("La raiz cuadrada formateada de "+rcuadrada+" es:");
		System.out.printf("%1.2f",Math.sqrt(rcuadrada));				//uso del metodo printf para recortar la parte decimal del valor a sacar por consola.		
	
	
	}

}
