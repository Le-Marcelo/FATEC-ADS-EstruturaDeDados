package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import model.Cliente;
import model.Lista;

public class ModificacaoCadastroController {

	public ModificacaoCadastroController() {
		super();
	}
	
	private void novoArquivo(Lista<Cliente> lista, String nomeArquivo) throws Exception{
		File arquivo = new File("C:\\TEMP", nomeArquivo + ".csv");	//Adicão da extensão para garantir
		StringBuffer buffer = new StringBuffer();
		
		for(int i = 0; i < lista.size(); i++) {		//Cria um StringBuffer modelado com os dados da lista
			Cliente cliente = lista.get(i);
			buffer.append(cliente.cpf + ";" + cliente.nome + ";" + cliente.idade + ";" + cliente.limiteCredito + "\n");
			
		}
		
		boolean arqExiste = arquivo.exists();	//Determina se o arquivo ja existe ou necessita a criação
		
		//Bloco para escrever no arquivo
		FileWriter escritor = new FileWriter(arquivo, arqExiste);
		PrintWriter print = new PrintWriter(escritor);
		print.write(buffer.toString());
		print.flush();
		print.close();
		escritor.close();
	}
	
	public void novoCadastro(int idadeMin, int idadeMax, Double limiteCredito) throws IOException, Exception{
		Lista<Cliente> lista = new Lista<Cliente>();
		File arquivo = new File("C:\\TEMP", "cadastro.csv");
		
		if(arquivo.exists()) {
			FileInputStream fluxo = new FileInputStream(arquivo);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			
			String linha = buffer.readLine();
			
			while(linha != null) {
				String vetorLinha[] = linha.split(";");
				
				//Limpeza de caracteres removendo aspas e trocando virgula por ponto
				vetorLinha[3] = vetorLinha[3].substring(0, vetorLinha[3].length() - 1);
				Double limite = Double.parseDouble(vetorLinha[3].replace(',', '.'));
				
				//Remoção de aspas no CPF
				Cliente cliente = new Cliente(vetorLinha[0].substring(1), vetorLinha[1], Integer.parseInt(vetorLinha[2]), limite);
				
				if(cliente.idade >= idadeMin && cliente.idade <= idadeMax && cliente.limiteCredito > limiteCredito) {
					lista.addLast(cliente);
				}
				
				linha = buffer.readLine();
			}
			
			buffer.close();
			leitor.close();
			fluxo.close();
			
			novoArquivo(lista,"Idade " + idadeMax +  " limite " + limiteCredito);
			
		}else {
			throw new IOException("Arquivo inválido");
		}
		
		
	}

}
