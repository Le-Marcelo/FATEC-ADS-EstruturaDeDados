package controller;

public class FatorialDuploController {

	public FatorialDuploController() {
		super();
	}
	
	public int FatorialDuplo(int num) {
		//Condi��o de parada => Quando o n�mero for igual a um
		if(num == 1) {
			return 1;
		//Retorno � dado pela compara��o se o resto da divis�o entre o n�mero atual do vetor por dois � diferente de zero,
		//Caso sim o retorno � a multiplica��o do n�mero atual pela chamada da fun��o com o n�mero decrescido em um.
		}else if(num % 2 != 0){
			return num * FatorialDuplo(num - 1);
		//Caso n�o o retorno � a chamada da fun��o com o n�mero decrescido em um.
		}else {
			return FatorialDuplo(num - 1);
		}
	}

}
