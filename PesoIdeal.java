package basics;
//Este programa nos dice cual es nuestro peso ideal en dependencia del genero y de nuestra altura, los cuales se entran al programa por el usuario.
//peso ideal hombre=altura(cm)-110, Mujer=altura(cm)-120.
/*
import javax.swing.*;
public class PesoIdeal {

	public static void main(String[] args) {
		
		System.out.println("Descubra su peso ideal!!!!!!");
		String genero=JOptionPane.showInputDialog("Inserte M para masculino y F para femenino, por favor");
		String altura=JOptionPane.showInputDialog("Inserte su altura en centímetros, por favor");
		System.out.println("Su altura es "+altura+"cm");
		
		while (genero.equals("M")||genero.equals("F")){
		
		if(genero.equals("M")){
			int altura1=Integer.parseInt(altura);
			int pesoIdealH=altura1-110;
			System.out.println("Su peso ideal es "+pesoIdealH+"kg");
		}
		
		else if (genero.equals("F")){
			int altura2=Integer.parseInt(altura);
			int pesoIdealM=altura2-120;
			System.out.println("Su peso ideal es "+pesoIdealM+"kg");
		}
		break;
		}
		System.out.println("No ingresó un valor correcto de genero");	
	}
}
*/

import javax.swing.*;
public class PesoIdeal {

	public static void main(String[] args) {
		
		String genero="";
		String altura="";
		int alturaInt=0;
				
		System.out.println("Descubra su peso ideal!!!!!!");
		
		do{	
			genero=JOptionPane.showInputDialog("Inserte M para masculino y F para femenino, por favor");	
			//System.out.println("No ingresó un valor correcto de genero");
		}
		while (genero.equalsIgnoreCase("M")==false && genero.equalsIgnoreCase("F")==false);		//mientras no se teclee una M y no se teclee una F, hago el do
			
		do{
			altura=JOptionPane.showInputDialog("Inserte su altura en centímetros, por favor");
			alturaInt=Integer.parseInt(altura);
		}
		while ((alturaInt>240)||(alturaInt<140));
		
		if(genero.equalsIgnoreCase("M")){
			int altura1=Integer.parseInt(altura);
			int pesoIdealH=altura1-110;
			System.out.println("Su peso ideal es "+pesoIdealH+"kg");
		}
			
		else if (genero.equalsIgnoreCase("F")){
			int altura2=Integer.parseInt(altura);
			int pesoIdealM=altura2-120;
			System.out.println("Su peso ideal es "+pesoIdealM+"kg");
		}	
	}
}