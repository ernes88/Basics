package basics;
import javax.swing.*;							//importo el paquete javax y el subpaquete swing.
public class EntradaEjemplo2 {

	public static void main(String[] args) {
		String message1="Introduce tu nombre por favor";
		String message2="Introduce tu edad por favor";
		String nombre=JOptionPane.showInputDialog(message1);
		String edad=JOptionPane.showInputDialog(message2);
		System.out.println("Te llamas "+nombre+" y tienes "+edad+" a�os");
		System.out.println("El a�o que viene tendr�s "+ ((Integer.parseInt(edad))+1)+" a�os.");	//parseInt se usa para convertir de string a int, asi se puede sumarle 1 a la edad actual para saber la edad del a�o que viene
	}
		/*como el metodo parseInt es static no precisa de construir un objeto con el constructor para poder usar este metodo
		 *tambien como la clase Integer esta en el paquete java.lang que es el paquete por defecto no necesito incluir ningun paquete para usarlo 
		 */
}
