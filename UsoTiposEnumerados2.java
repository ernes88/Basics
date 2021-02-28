package basics;
import java.util.*;
public class UsoTiposEnumerados2 {

//entre las llaves del tipo enumerado Talla, se declaran los valores que tendrá, y además se construye un constructor que recibe como parámetro una variable de tipo String, y por otro ldo otra variable de tipo String encapsulada llamada abreviatura.
//a la hora de construir el tipo, el valor, pues le pasaremos la S por parámetro a abreviatura, y de esa forma le estemos diciendo que la abreviatura perteneciente a MINI es igual a la abreviatura que le pasemos por parámetro, de esa forma asociamos el nombre del objeto MINI con la abreviatura perteneciente a ese objeto
//los tipos enumerados no admiten la creación de obejtos de la forma tradicional con el operdor new. Por tanto el constructor que se creo tiene que ser private para que no pueda ser accedido o invocado desde fuera de la clase.	
	enum Talla{
		
		MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
		private Talla(String abreviatura){
			this.abreviatura=abreviatura;
		}
		private String abreviatura;
	
		public String dameAbreviatura(){
			return abreviatura;
		}
	
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingresa una talla:MINI,MEDIANO,GRANDE,MUY_GRANDE");
		String datos=entrada.nextLine().toUpperCase();								//con este 'ultimo método pasamos a mayúsculas lo que el usuario pueda ingresar por consola.
		
		Talla la_talla=Enum.valueOf(Talla.class,datos);								//valueOf devuelve el nombre de la constante enumerada a la que pertenece el texto introducido que lo hemos almacenado en datos
		System.out.print("Talla "+la_talla);
		System.out.println("Abreviatura"+la_talla.dameAbreviatura());
	}

}
