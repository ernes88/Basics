package basics;
//programa que calcule el factorial de un numero
import javax.swing.*;

public class Factorial {

	public static void main(String[] args) {
		String entrada=JOptionPane.showInputDialog("Ingrese el número al que desea calcularle su factorial");
		long computo=1;
		
		int factorial=Integer.parseInt(entrada);
		for(int i=factorial;i>0;i--){
			computo*=i;
		}
		System.out.println("El factorial de "+factorial+" es "+computo);
	}

}
