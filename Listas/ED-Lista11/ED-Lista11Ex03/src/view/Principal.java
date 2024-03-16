package view;

import controller.EscalonadorController;
import model.Fila;
import model.Processo;

public class Principal {

	public static void main(String[] args) {
		String[] entrada = {"notepad.exe;14","write.exe;35","chrome.exe;27","acrobat.exe;52","firefox.exe;18","word.exe;25"};
		Fila<Processo> fila = new Fila<Processo>();
		EscalonadorController ctrl = new EscalonadorController();
		
		//Receber entrada e inserir na fila
		for(String dados : entrada) {
			String[] texto = dados.split(";");
			
			Processo processo = new Processo(texto[0], Integer.parseInt(texto[1]));
			fila.insert(processo);
		}
		
		ctrl.escalonador(fila);

	}

}
