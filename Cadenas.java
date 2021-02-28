package basics;

public class Cadenas {

	public static void main(String[] args) {
		String nombre="Ernesto Rodriguez Pina";
		System.out.println("Mi nombre es "+nombre);
		System.out.println("Mi nombre tiene "+nombre.length()+" letras");
		System.out.println("Mi nombre comienza con la letra "+nombre.charAt(0));
		int indice=nombre.length();
		System.out.println("Y termina con la letra "+nombre.charAt(indice-1));
		String primerApellido=nombre.substring(8,17);					//uso de substring (a,b)
		System.out.println("Mi primer Apellido es "+primerApellido);
		System.out.println("Mis apellidos son "+nombre.substring(8));	//uso de la funcion substring(a)
		
		String alumno1="David";
		String alumno2="david";
		System.out.println(alumno1.equals(alumno2));
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
	}

}
