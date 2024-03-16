package model;

public class Cliente {

	public String cpf;
	public String nome;
	public int idade;
	public Double limiteCredito;
	
	public Cliente(String _cpf, String _nome, int _idade, Double _limiteCredito) {
		cpf = _cpf;
		nome = _nome;
		idade = _idade;
		limiteCredito = _limiteCredito;
	}
	
}
