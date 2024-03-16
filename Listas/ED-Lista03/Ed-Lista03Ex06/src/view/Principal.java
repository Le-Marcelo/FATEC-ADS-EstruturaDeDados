package view;

import controller.SomatoriaFatorialController;

public class Principal {

	public static void main(String[] args) {
		int num = 5;
		
		SomatoriaFatorialController sf = new SomatoriaFatorialController();
		
		double resultado = sf.Somatoria(num);
		System.out.println(String.format("%.2f", resultado));

	}

}
