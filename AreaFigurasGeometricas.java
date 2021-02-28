package basics;
/*programa que calculará el área de cuatro figuras geométricas, cuadrado, rectángulo, triángulo y círculo, además,
 * el usuario podrá elegir que tipo de figura geométrica desea que el programa le calcule el área. Se deberá usar 
 * la consola para que el usuario escoja la figura a la que le desea hayar el área. Se deberá usar la clase JOptionPane
 * para que el usuario introduzca la base, la altura o el radio en dependencia de la figura que haya escogido anteriormente. 
 */

import java.util.*;
import javax.swing.*;
public class AreaFigurasGeometricas {
	public static void main(String[] args) {
		Scanner figura=new Scanner (System.in);
		//final double PI=3.14;				//crearla asi funciona bien pero no hace falta, ya que ya esta definida en Math
		
		System.out.println("Escoja la figura geométrica a la que desea hallarle el área");
		System.out.println("Teclee 1=Cuadrado, 2=Rectángulo, 3=Triángulo, 4=Círculo");
		
		int tipo=figura.nextInt();
		if (tipo==1){
			String lado_string=JOptionPane.showInputDialog("Entra el lado del cuadrado en cm");
			double lado_double=Double.parseDouble(lado_string);
			double areaCuadrado=lado_double*lado_double;
			
			System.out.println("El área del cuadrado de lado "+lado_double+" cm es: "+areaCuadrado+" cm cuadrados.");	
		}
		else if (tipo==2){
			String ladoMenor_string=JOptionPane.showInputDialog("Entra el lado menor del rectángulo en cm");
			double ladoMenor_double=Double.parseDouble(ladoMenor_string);
			
			String ladoMayor_string=JOptionPane.showInputDialog("Entra el lado mayor del rectángulo en cm");
			double ladoMayor_double=Double.parseDouble(ladoMayor_string);
			
			double areaRectangulo=ladoMenor_double*ladoMayor_double;
			System.out.println("El área del rectángulo de lado menor "+ladoMenor_double+" cm y lado mayor "
					+ladoMayor_double+" cm es: "+areaRectangulo+" cm cuadrados.");		
		}
		else if (tipo==3){
			String base_string=JOptionPane.showInputDialog("Entra la base del triángulo en cm");
			double base_double=Double.parseDouble(base_string);
			
			String altura_string=JOptionPane.showInputDialog("Entra la altura del triángulo en cm");
			double altura_double=Double.parseDouble(altura_string);
			
			double areaTriangulo=base_double*altura_double/2;
			System.out.println("El área del triángulo de base "+base_double+" cm y altura "
					+altura_double+" cm es: "+areaTriangulo+" cm cuadrados.");		
		}
		else if (tipo==4){
			String radio_string=JOptionPane.showInputDialog("Entra el radio del circulo en cm");
			double radio_double=Double.parseDouble(radio_string);
			
			double areaCirculo=Math.PI*radio_double*radio_double;			//PI ya esta definida en Math. 		
			//System.out.println("El área del circulo de radio "+radio_double+" cm es: " 
			//+areaCirculo+" cm cuadrados.");
			//Esta forma anterior aunque valida da un resultado con muchos decimales para el area del circulo.
			 System.out.print("El área del circulo de radio "+radio_double+" cm es: "); 
			 System.out.printf("%1.2f",areaCirculo);
			 System.out.println(" cm cuadrados"); 
			  
		}
		else {
			System.out.println("Teclee una opción valida");
		}
	}
}
