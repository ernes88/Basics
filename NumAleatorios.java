package basics;
//programa que generar� n�meros aleatorios entre 0 y 100. Se le deber� presentar al usuario una pista cada vez para ue pueda adivinar el numero.

import java.util.*;
public class NumAleatorios {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);	//creaci�n del objeto de tipo Scanner para entrar datos por consola 
		int i=0;								//contador para el n�mero de intentos.
		
		//bloque de c�digo que genera el n�mero aleatorio entre 0 y 100
		double numAldouble=0;
		numAldouble=Math.random()*100;
		int numAlint=(int)numAldouble;
		
		//System.out.println(numAlint);
		System.out.println("Puedes adivinar el n�mero aleatorio que he generado entre 0 y 100?");
		System.out.println("Ingresa un n�mero entre 0 y 100");
		
		int propuesta=entrada.nextInt();
		
		
		if ((propuesta==numAlint) && i==0){
			System.out.println("Ingresaste el "+propuesta+" y es correcto, waoooh a la primera");
		}
		
		while(numAlint!=propuesta){
			
			if(propuesta>numAlint){
				i++;
				System.out.println("Ingresaste el n�mero "+propuesta+" y es mas alto");
				System.out.println(i+" intentos");
				System.out.println("Ingresa un nuevo n�mero ");
				propuesta=entrada.nextInt();
			}
			
			if (propuesta<numAlint){
				i++;
				System.out.println("Ingresaste el n�mero "+propuesta+" y es mas bajo");
				System.out.println(i+" intentos");
				System.out.println("Ingresa un nuevo n�mero ");
				propuesta=entrada.nextInt();
			}
		}
		System.out.println("Ingresaste el n�mero "+propuesta+" y es correcto y te tom� "+(i+1)+" intentos");
	}
}
	
		
		
		
		
		
	