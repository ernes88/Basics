package basics;

public class UsoTiposEnumerados {
	
	enum Talla{MINI,MEDIANA,GRANDE,MUY_GRANDE};
	
	public static void main(String[] args) {
		
		Talla s=Talla.MINI;
		Talla m=Talla.MEDIANA;
		Talla l=Talla.GRANDE; 
		Talla xl=Talla.MUY_GRANDE; 
		//Talla xxl=Talla.ENORME;                //esto daría error pues Enorme no es uno de los valores permitidos en el tipo enumerado
				
	}

}
