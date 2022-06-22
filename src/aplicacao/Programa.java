package aplicacao;

import tabuleiro.Tabuleiro;
import xadrez.PartidaDeXadrez;

public class Programa {

	public static void main(String[] args) {
		
		PartidaDeXadrez partida = new PartidaDeXadrez();
		UI.printTabuleiro(partida.getPecas()); //CRIAR UMA CLASSE PARA IMPRIMIR O TABULEIRO puxando as pecas impressas
	}

}
