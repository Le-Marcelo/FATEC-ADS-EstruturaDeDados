package controller;

import model.PilhaInt;

public class NPRController {

	public NPRController() {
		super();
	}
	
	public void insereValor(PilhaInt p, int valor) {
		p.push(valor);
	}
	
	public int npr(PilhaInt p, String op) throws Exception{
		if(p.size() >= 2) {
			int num2 = p.pop();
			int resultado;
			
			switch(op) {
				case "+":
					resultado = p.pop() + num2;
					p.push(resultado);
					return resultado;
				
				case "-":
					resultado = p.pop() - num2;
					p.push(resultado);
					return resultado;
					
				case "*":
					resultado = p.pop() * num2;
					p.push(resultado);
					return resultado;
				
				case "/":
					resultado = p.pop() / num2;
					p.push(resultado);
					return resultado;
					
				default:
					throw new Exception("Operação inválida");
			}
		}else {
			throw new Exception("Valores insuficientes");
		}
		
	}

}
