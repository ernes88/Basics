package basics;
//programa que además de buscar por la @, busca que no puede haber mas de un @
//busca además que la dirección tecleada tiene que tener al menos un punto, y este punto tiene que estar posicionado luego de la @ separado por al menos dos caracteres.
//podran haber o no puntos delante de la @ pero deberá haber obligado uno luego de la @ separado por dos posiciones al menos.

import java.util.Scanner;
public class emailValidoMod {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner (System.in);
		System.out.println("Teclee su dirección de correo electrónico");
		String e_mail=entrada.nextLine();
		int numCaracteres=e_mail.length();
		int j=0;
		boolean punto=false;
		int posArroba=0;
		int posPunto=0;
		
		for(int i=0;i<numCaracteres;i++){
			if (e_mail.charAt(i)=='@'){
				j++;
				posArroba=i;
			}
			if (e_mail.charAt(i)=='.'){
				posPunto=i;
			}
			if ((posPunto-2>posArroba)&&(j==1)){
				punto=true;
			}
		}
		if ((j==1)&&(punto==true)){
			System.out.println("Su dirección de correo electrónico es válida");
		}
		if ((j==0)||(j>1)||(punto==false)){
		System.out.println("Su dirección de correo electrónico no es válida");
		}		
	}
}
