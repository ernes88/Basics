package basics;
/*programa que calcular� el �rea de cuatro figuras geom�tricas, cuadrado, rect�ngulo, tri�ngulo y c�rculo, adem�s,
 * el usuario podr� elegir que tipo de figura geom�trica desea que el programa le calcule el �rea. Se deber� usar 
 * la consola para que el usuario escoja la figura a la que le desea hayar el �rea. Se deber� usar la clase JOptionPane
 * para que el usuario introduzca la base, la altura o el radio en dependencia de la figura que haya escogido anteriormente. 
 */

import java.util.*;
import javax.swing.*;
public class AreaFigurasGeometricas {
	public static void main(String[] args) {
		Scanner figura=new Scanner (System.in);
		//final double PI=3.14;				//crearla asi funciona bien pero no hace falta, ya que ya esta definida en Math
		
		System.out.println("Escoja la figura geom�trica a la que desea hallarle el �rea");
		System.out.println("Teclee 1=Cuadrado, 2=Rect�ngulo, 3=Tri�ngulo, 4=C�rculo");
		
		int tipo=figura.nextInt();
		if (tipo==1){
			String lado_string=JOptionPane.showInputDialog("Entra el lado del cuadrado en cm");
			double lado_double=Double.parseDouble(lado_string);
			double areaCuadrado=lado_double*lado_double;
			
			System.out.println("El �rea del cuadrado de lado "+lado_double+" cm es: "+areaCuadrado+" cm cuadrados.");	
		}
		else if (tipo==2){
			String ladoMenor_string=JOptionPane.showInputDialog("Entra el lado menor del rect�ngulo en cm");
			double ladoMenor_double=Double.parseDouble(ladoMenor_string);
			
			String ladoMayor_string=JOptionPane.showInputDialog("Entra el lado mayor del rect�ngulo en cm");
			double ladoMayor_double=Double.parseDouble(ladoMayor_string);
			
			double areaRectangulo=ladoMenor_double*ladoMayor_double;
			System.out.println("El �rea del rect�ngulo de lado menor "+ladoMenor_double+" cm y lado mayor "
					+ladoMayor_double+" cm es: "+areaRectangulo+" cm cuadrados.");		
		}
		else if (tipo==3){
			String base_string=JOptionPane.showInputDialog("Entra la base del tri�ngulo en cm");
			double base_double=Double.parseDouble(base_string);
			
			String altura_string=JOptionPane.showInputDialog("Entra la altura del tri�ngulo en cm");
			double altura_double=Double.parseDouble(altura_string);
			
			double areaTriangulo=base_double*altura_double/2;
			System.out.println("El �rea del tri�ngulo de base "+base_double+" cm y altura "
					+altura_double+" cm es: "+areaTriangulo+" cm cuadrados.");		
		}
		else if (tipo==4){
			String radio_string=JOptionPane.showInputDialog("Entra el radio del circulo en cm");
			double radio_double=Double.parseDouble(radio_string);
			
			double areaCirculo=Math.PI*radio_double*radio_double;			//PI ya esta definida en Math. 		
			//System.out.println("El �rea del circulo de radio "+radio_double+" cm es: " 
			//+areaCirculo+" cm cuadrados.");
			//Esta forma anterior aunque valida da un resultado con muchos decimales para el area del circulo.
			 System.out.print("El �rea del circulo de radio "+radio_double+" cm es: "); 
			 System.out.printf("%1.2f",areaCirculo);
			 System.out.println(" cm cuadrados"); 
			  
		}
		else {
			System.out.println("Teclee una opci�n valida");
		}
	}
}
