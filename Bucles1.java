package basics;
//simulaci�n de acceso a una aplicaci�n que nos pide una contrase�a. Se deber� usar una ventana con JOptionPane
//la contrase�a para entrar ya estar� establecida en el c�digo y mientras lo que teclee el usuario no sea esa
//contrase�a, la ventana le continuar� saliendo hasta que no la teclee correctamente

import javax.swing.*;
public class Bucles1 {

	public static void main(String[] args) {
		String passwordValido="erne88";
		String intentoPassword="";		//inicializada cn una cadena vacia
		
		while(passwordValido.equals(intentoPassword)==false){			//aca se usa el metodo equals de la clase String para comparar dos cadenas de caracteres, no se pueden comparar cadenas con el ==.
			intentoPassword=JOptionPane.showInputDialog("Teclee la contrase�a por favor");
			System.out.println("Contrase�a incorrecta");	
		}																
		System.out.println("Acceso Permitido");															
																
	}
}

		
		
		
		
		
		
		
		
		/*String passwordValido="erne88";
		String intentoPassword="0";		//la inicializo 
		
		while(intentoPassword!=passwordValido){
		String intentoPassword1=JOptionPane.showInputDialog("Teclee la contrase�a por favor");		//aca hay un error que me hizo tener que declarar otra variable string y es poner la palaba String de nuevo delante de intentoPassword, con lo cual es como si se hubieran creado del variables con el mismo nombre.
		intentoPassword=intentoPassword1;
		
		if (intentoPassword=="erne88"){
			System.out.println("Acceso Permitido");
			break;
		}
		}
	*/	
	
	