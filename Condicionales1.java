package basics;
import java.util.*;
public class Condicionales1 {

	public static void main(String[] args) {
		Scanner edad=new Scanner(System.in);
	    
		System.out.println("Teclee su edad, por favor");
	    if (edad.nextInt()<18){
	      System.out.println("Eres menor de edad");
	    }
	    else{
	      System.out.println("Eres mayor de edad");
	    }	

	}

}

