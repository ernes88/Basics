package basics;
//programa que crea una array de numeros aleatorios y luego los muestra por pantalla
public class arrayNumAleatorios {

	public static void main(String[] args) {
		double[]arrayNumAleat=new double[10000];
		for (int i=0;i<10000;i++){
			arrayNumAleat[i]=Math.random();
			System.out.println(arrayNumAleat[i]);
		}

	}

}
