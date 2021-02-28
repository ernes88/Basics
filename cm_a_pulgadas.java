package basics;

public class cm_a_pulgadas {

	public static void main(String[] args) {
		final float factorDeConversion=2.54F;
		float pulgadas=0F;
		float cm=0F;
		cm=250;
		pulgadas=cm/factorDeConversion;
		System.out.println(pulgadas);
		cm=pulgadas*factorDeConversion;
		System.out.println(cm+" cm"+" equivalen a "+pulgadas+" pulgadas.");
		

	}

}
