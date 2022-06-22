package xadrez;

import tabuleiro.Tabuleiro;

public class PartidaDeXadrez {

	private Tabuleiro tabuleiro; //UMA PARTIDA DE XADREZ TEM UM TABULEIRO

	public PartidaDeXadrez() { 
		tabuleiro = new Tabuleiro(8, 8); //É COLOCADO AQUI 8 8 PQ A CLASSE É DE XADREZ, PORTANTO VALOR CONHECIDO
	}
	
	//METODO PARA OBTER AS PECAS DO TABULEIRO
	public PecaDeXadrez[][] getPecas(){
		PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i=0; i<tabuleiro.getLinhas(); i++) {
			for (int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaDeXadrez)tabuleiro.peca(i, j);
			}
		}
		return mat;
	}
}
