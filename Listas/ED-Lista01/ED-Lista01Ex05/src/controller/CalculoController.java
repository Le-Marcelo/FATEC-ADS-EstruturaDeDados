package controller;

public class CalculoController {

	public CalculoController() {
		super();
	}

	public double CalculoSerie(double n) {
//		Condição de parada => Quando N for igual a 1.
		if(n == 1) {
			return 1;
		}else {
//			Retorno é dado pela adição do resultado da divisão de 1 por N e pela chamada da função com N reduzido em 1.
			return (1 / n) + CalculoSerie(n - 1);
		}
	}
}
