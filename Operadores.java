package basics;

public class Operadores {

	public static void main(String[] args) {
		int a=5;
		int b;
		b=7;
		int c=a+b;
		System.out.println(c);      //imprime valor 12
		c--;						//decrementa a 11
		System.out.println(c);		//imprime 11
		System.out.println(c++);	//cuando se usa el operador de incremento luego de la variable, se imprime esta y luego se incrementa, por eso se imprime 11 nuevamente 
		System.out.println(++c);	//ya antes de ejecutar esta sentencia c vale 12 pues se incremento luego de ejecutarse sentenca anterior. Pero como aca se usa el operador ++ antes de la variable, se incrementara a 13 esta primero antes de que se imprima su valor de 13.
		System.out.println(c-=4);
		
		
		
	}

}
