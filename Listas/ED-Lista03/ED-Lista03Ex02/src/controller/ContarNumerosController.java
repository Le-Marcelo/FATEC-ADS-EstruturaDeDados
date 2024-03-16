package controller;

public class ContarNumerosController {

	public ContarNumerosController() {
		super();
	}
	
	public int ContarNumeros(int num, int digito) {
		//Condição de retorno => Quando o resultado da divisão do número atual dividido por 10 for igual a 0.
		if(num / 10 == 0){
			//Teste lógico para verificar se o último número corresponde ao dígito.
			if(num % 10 == digito) {
				return 1;
			}else {
				return 0;
			}
		//Retorno é dado pela comparação se o resto da divisão do número por 10 for igual ao dígito.
		//Caso sim, retorna a adição de 1 e a chamada da função dividindo o número por 10.
		}else  if(num % 10 == digito){
			return 1 + ContarNumeros(num / 10, digito);
		//Caso não, retorna a chamada da função dividindo o número por 10.
		}else {
			return ContarNumeros(num / 10, digito);
		}
	}

}
